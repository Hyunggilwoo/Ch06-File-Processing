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
		//countCoins();
		//System.out.print( "Total Money: " + countCoins( scan.nextLine() ) );
		
	}
	
	//public static double countCoins(Scanner console) throws FileNotFoundException {
	
		////Scanning a file
		//File check = new File("coins.txt");
		//Scanner scan = new Scanner(check);
		
		////Initializing the sum of coins and pennies, nickels, dimes, quarters
		//double sum = 0;
		//double num;
		
		//double penny, nickel, dimes, quarter;
		
		//// A code will store the number of coins
		//// while( there is a token)
		//// if a token is an integer, store it in a number
		
		//while( scan.hasNext()){
			//Scanner parseCoins = new Scanner(scan.next());
			//num = parseCoins.nextInt();
			
			//if (parseCoins.hasNext("pennies")){ //Scan for pennies and multiply them by 0.01
				//penny = num * 0.01;
				//sum = sum + penny;
			//} else;
		//}
		//System.out.print( "Total Money: " + countCoins( scan.nextLine() ) );
		//return sum;
	//}
	
	public static String wordWrap(Scanner console) {
	// Declare a String characters = "", word = observe.next()
	// while loop condition ( hasNext())
	// if (words.next() <= string.length(59)),  characters = characters + word, then System.out.print(character.next()),
	//  then outside of the loop, move to a new line.
	// return the text output organized in a line of 60 characters or less.
		File input = new File("words.txt");
		Scanner observe = new Scanner(input);
		
		String character = "";
		
		while (observe.hasNext()){
			String word = observe.next();
			if (observe.next() <= word.length(59)){
				character = character + word.next();
				System.out.print(character);
			} else {
				System.out.println();
			}
		}  
	return character ;
	} 
	
	public static void printDuplicates(Scanner console) {
	// What do I know: while(object.hasNext()) should identify all tokens in the file
	
	// What do I not know yet: How to print a repeated string like the following output - 
	// how*2, you * 4
	// I *3, Jack's * 2 smirking * 4
	// What is algorithm to print obtain an integer from a string?
	// int counter = 0// counts the number of duplicates from the same line.
	// duplicate = object.next(); also add a counter 
	File file2 = new File("duplicates.txt");
	Scanner object = new Scanner(file2);
	
	//initialize counter
	int counter = 0;
	
	while(object.hasNext()) {
		// How do I make the program compare the current token to the tokens down the road?
		
	}
	}
}
