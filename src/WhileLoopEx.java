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
		
		
		//already went through and removed lines 21-25
		
		
		
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
        	
        	//For loop to keep count of the index, until it reaches a vowel
        	int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' &&
                        word.charAt(i) != 'o' && word.charAt(i) != 'u') {
                    count++;
                }
                
            
            }
        
                    return count;
                
        }
		}