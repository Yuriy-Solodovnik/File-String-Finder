import java.util.ArrayList;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input path to file: ");
        String path = in.nextLine();
        System.out.print("Input sought string: ");
        String soughtString = in.nextLine();
		ArrayList<String> allStringsList = StringReader.readFile(path);
		if(!allStringsList.isEmpty())
		{
			System.out.println("[In file: " + path + "]\nAll strings: ");
			print(allStringsList);
			System.out.println("\nList of matches with string: " + soughtString);
			print(Finder.FindMatches(allStringsList, soughtString));
		}
		in.close();
	}
	
	public static void print(ArrayList<String> list)
	{
		for(String str: list)
		{
			System.out.print("[" + str + "] ");
		}
	}
}
