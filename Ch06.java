/**
 * <insert_comment_sumamry_here>
 * 
 * @author <Hyunggil Woo>
 */

import java.util.*;
import java.io.*;

public class Ch06{
	public static void main(String[]args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		countCoins(console);
		wordWrap(console);
		printDuplicates(console);
		inputstats(console);
		
		
	}
	
	public static void countCoins(Scanner console) throws FileNotFoundException {
	
		//Scanning a file
		File check = new File("coins.txt");
		Scanner scan = new Scanner(check);
		
		//Initializing the sum of coins and pennies, nickels, dimes, quarters
		double sum = 0;
		
		
		
		
		// A code will store the number of coins
		// while( there is a token)
		// if a token is an integer, store it in a number
		
		while( scan.hasNext()){
			
			
			
			
			int amount = scan.nextInt();
			String type = scan.next().toLowerCase();
			
			
			if (type.equals("pennies")){ //Scan for pennies 
				sum += 1 * amount;
			} else if (type.equals("nickels")) {
				sum += 5 * amount;
			} else if ( type.equals("dimes")) {
				sum += 10 * amount;
			} else if (type.equals("quarters")) {
				sum += 25 * amount;
			} 
		}
		System.out.println( "Total money: $" + String.format("%.2f", sum/100 ) );
		System.out.println();
		
	}
	
	public static void wordWrap(Scanner console) throws FileNotFoundException
	{
	// Declare a String characters = "", word = observe.next()
	// while loop condition ( hasNext())
	// if (words.next() <= string.length(60)),  characters = characters + word, then System.out.print(character.next()),
	//  then outside of the loop, move to a new line.
	// return the text output organized in a line of 60 characters or less.
		File input = new File("words.txt");
		Scanner observe = new Scanner(input);
		
		while(observe.hasNextLine()) {
			String word = observe.nextLine();
			
			while(word.length() > 60) {
				System.out.println(word.substring(0, 60));
				word = word.substring(60);
			}
			
			System.out.println(word);
		}
	}		
			
	
	public static void printDuplicates(Scanner console) throws FileNotFoundException
	{
		// What do I know: while(object.hasNext()) should identify all tokens in the file
		
		// What do I not know yet: How to print a repeated string like the following output - 
		// how*2, you * 4
		// I *3, Jack's * 2 smirking * 4
		// What is algorithm to print obtain an integer from a string?
		// 
		// int counter = 0// counts the number of duplicates from the same line.
		// duplicate = object.next(); also add a counter 
		File file2 = new File("duplicates.txt");
		Scanner object = new Scanner(file2);
		
		//initialize counter
		int counter = 0;
		String now = "";
		
		while(object.hasNextLine()) {
			// How do I make the program compare the current token to the tokens down the road?
			
			
			while(object.hasNext()) {
				String line = object.next();
				
				if(line.equals(now)) {
					counter++;
				} else {
					if (counter > 1) {
						System.out.print( now + "*" + counter +" ");
					}
					
					now = line;
					counter = 1;
				}
			}
			
		}
		
	}
	
	public static void inputstats( Scanner console) throws FileNotFoundException
		{
		
			File text = new File("Jabberwock.txt");
			Scanner inputter = new Scanner(text);
			
			int lineNumber = 0;
			String longestLine = "";
			
			 //Prints the line number and the longest String
			while (inputter.hasNextLine()) {
				lineNumber++;
				String line = inputter.nextLine(); //Used compare the longest Line
				
				Scanner lineInputter = new Scanner(line);
				int counter = 0;
				int longestToken = 0; //Initialize the longest token
				
				 //Prints the number of tokens + 
				while(lineInputter.hasNext()) {
					String token = lineInputter.next();
					counter++;
					
					if (token.length() > longestToken) 
						longestToken = token.length();
					}
				
					System.out.println("Line " + lineNumber + "has " + counter + "tokens "  + "(longest = " + longestToken + ")" );
				
				
				if (line.length() > longestLine.length())
					longestLine = line;
				}
				System.out.print("Longest line: " + longestLine);
				
			
		}
}
