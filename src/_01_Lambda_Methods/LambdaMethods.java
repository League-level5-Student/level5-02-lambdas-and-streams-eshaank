package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "shiva is super mega dumb");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String reverse = "";
			for(int i = s.length() - 1; 0 <= i; i--) {
				reverse += s.substring(i, i + 1);
			}
			System.out.println(reverse);
		}, "shiva is super mega dumb");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String upperLower = "";
			for(int i = 0; i < s.length(); i++) {
				if(i % 2 == 1) {
					upperLower += s.substring(i, i + 1).toUpperCase();
				}
				else {
				upperLower +=s.substring(i, i + 1);
				}
			}
			System.out.println(upperLower);
		}, "shiva is super mega dumb");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String periods = "";
		for(int i = 0; i < s.length(); i++) {
			periods += s.substring(i, i+1) + "."; 
		}
		System.out.println(periods);
	}, "shiva is super mega dumb");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
