package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> addNumbersClick());
		randNumber.addActionListener(e -> randNumberClick());
		tellAJoke.addActionListener(e -> tellJokeClick());
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	void addNumbersClick(){
	String input1 = JOptionPane.showInputDialog("Enter a number");
	String input2 = JOptionPane.showInputDialog("Enter another number");
	
	int num1 = Integer.parseInt(input1);
	int num2 = Integer.parseInt(input2);
	
	int sum = num1 + num2;
	JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + sum);
	}
	void randNumberClick() {
		Random rand = new Random();
		int random = rand.nextInt(101);
		JOptionPane.showMessageDialog(null, random );
	}
	void tellJokeClick(){
		ArrayList<String> jokeList = new ArrayList<>();
		jokeList.add("Today at the bank, an old lady asked me to help check her balance. So I pushed her over.");
		jokeList.add("I bought some shoes from a drug dealer. I don't know what he laced them with, but I've been tripping all day.");
		jokeList.add("Why is Peter Pan always flying? He neverlands.");
		jokeList.add("Why do blind people hate skydiving? It scares the hell out of their dogs.");
		jokeList.add("What do you call a guy with a rubber toe? Roberto.");
		jokeList.add("Whatdya call a frenchman wearing sandals? Phillipe Phillope.");
		
		Random rand = new Random();
		int random = rand.nextInt(6);
		
		JOptionPane.showMessageDialog(null, jokeList.get(random));
	}


}
