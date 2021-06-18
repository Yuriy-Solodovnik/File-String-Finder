import java.util.ArrayList;

public class Finder 
{
	public static ArrayList<String> FindMatches (ArrayList<String> list, String soughtString)
	{
		ArrayList<String> hitList = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++)
		{
			String str = list.get(i);
			if(str.equals(soughtString))
			{
				hitList.add("number " + (i+1));
			}
		}
		return hitList;
	}
}
