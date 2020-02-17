package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		Stream.of(strArr).forEach((i) -> System.out.println(i));
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(1);
		intList.add(4);
		intList.stream().filter((j) -> j != 1).forEach((i) -> System.out.println(i));
		
		Stack<Random> randStack = new Stack<Random>();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		Stream.of(randStack).forEach((i) -> System.out.println(i));
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		
		Stream.of(dQueue).forEach((i) -> System.out.println(i));

		
}
