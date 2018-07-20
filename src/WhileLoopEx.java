import java.util.Scanner;

public class WhileLoopEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = null;
		String translated; 
		String answer; 
		
		// prompt at the beginning asking user to enter a word
		System.out.println("Welcome to Pig Latin Translator!");
		System.out.println("");
		
		do {
		System.out.println("Enter a word to be translated:");
		//make work lower case here
		input = scnr.nextLine();
		
		//Does not work but trying to get it fix. submitted to meet the deadline 
		if (!input.contains('a') && !input.contains('e') && 
				!input.contains('i') && !input.contains('o') && !input.contains('u') ) {
			
		}
		
		translated = solve (input);
		System.out.println(translated);
		System.out.println("Translate again? (y/n)");
		answer = scnr.nextLine();
		
		if (answer.equals("n")) {
		System.out.println("Goodbye.");
		}
		
		}
		while (answer.equals("y")); 
		scnr.close();
		}
		public static String solve (String input) {		
		input = input.toLowerCase();
		
		String output = "";
		//these are the conditions for words starting with a vowel
			if (input.startsWith("a") || input.startsWith("e") || input.startsWith("i") ||
				input.startsWith("o") || input.startsWith("u") ) {
				output = input + "way";
			}
			
		//translation with a consonant 
			else 
			{
				
				int firstVowel = getFirstVowel(input);
				
				if (firstVowel != 0 || firstVowel == -1) {
					output = input.substring(firstVowel) + input.substring(0, firstVowel) + "ay";
				}
				
				
				
			}

			return output;
		}
		
		public static int getFirstVowel(String word) {
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
						word.charAt(i) == 'o' || word.charAt(i) == 'u') {
					return i;
					
				}
			}
		
					return -1;
				
		}
		}