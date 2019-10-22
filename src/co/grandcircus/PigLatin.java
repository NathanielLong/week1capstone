package co.grandcircus;

import java.util.Scanner;

public class PigLatin {

	private static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u');
	}

	private static String pigLatin(String userInput) {

		int len = userInput.length();
		int index = -1;
		for (int i = 0; i < len; i++) {
			if (isVowel(userInput.charAt(i))) {
				index = i;
				break;
			}
		}

		if (index == -1)
			return "-1";
		return userInput.substring(index) + userInput.substring(0, index) + "ay";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char tryAgain = 0;
		System.out.println("Welcome the the Pig Latin Translator!");
		System.out.println("Please enter your name: ");
		String userName = scan.next();

		do {
			System.out.println("Please enter a one word string: ");
			String userInput = scan.next().toLowerCase();
			char firstLetter = userInput.toLowerCase().charAt(0);

			if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
					|| firstLetter == 'u') {
				System.out.println(userName + ", the word " + userInput + " in pig latin becomes " + userInput + "way");
			} else {
				System.out
						.println(userName + ", the word " + userInput + " in pig latin becomes " + pigLatin(userInput));
				System.out.println("Would you like to try again (y/n): ");
				tryAgain = scan.next().charAt(0);
			}
		} while (tryAgain == 'y');
		System.out.println("Good-bye!");
		scan.close();
	}
}
