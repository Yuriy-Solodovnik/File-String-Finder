import java.io.*;

import java.util.ArrayList;

public class StringReader 
{
	
	public static ArrayList<String> readFile(String path) 
	{
		ArrayList<String> list = new ArrayList<String>();
		String tempStr;
		try (BufferedReader reader = new BufferedReader(new FileReader(path)))
		{
			while ((tempStr = reader.readLine()) != null) 
			{
				list.add(tempStr);
			}
		} catch (IOException ex) 
		{
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
