
import java.util.Scanner;
import java.io.*;

public class inputStats{
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		input(console);
	}
	
	
	public static void input( Scanner console) throws FileNotFoundException
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
