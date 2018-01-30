package collection;

import java.util.HashMap;

public class occuranceusingHashMap 
{
	public static void main(String[] args)
	{
		String str = "HI there THERE I am NIKHIL nikhil";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char ch : str.toCharArray()) 
		{
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				map.put(ch, val+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
