package co.grandcircus;
import java.util.Scanner;
public class PigTest {
	public static void main(String[] args) {
		
		//This will take the first letter and move it to the back and makes the string lower-case
		String java = "Java".toLowerCase();
		char firstLetter = java.charAt(0);
		System.out.println(firstLetter);
		String javaShrunk = java.substring(1);
		System.out.println(javaShrunk);
		System.out.println(javaShrunk + firstLetter);
		
		//This will determine whether the first letter entered in a string is a vowel or not
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a one word string: ");
		char firstDetermine = scan.next().toLowerCase().charAt(0);
		System.out.println(firstDetermine);
		if (firstDetermine == 'a' || firstDetermine == 'e' || firstDetermine == 'i' || firstDetermine == 'o' || firstDetermine == 'u') {
			System.out.println("First letter is a vowel");
		} 
		else {
			System.out.println("The first letter is a consonant");
		}
		
		//This will move ALL of the consonants to the back
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
	}

}
