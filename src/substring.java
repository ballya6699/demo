
public class substring 
{
	public static void main(String[] args) 
	{
		/*String str = "nikhil";
		for (int i = 0; i < str.length()-1; i++) 
		{
			char str1 = str.charAt(i);
			System.out.println(str1);
		}*/
		
		String mainStr = "nikhilramdasbhalerao";
		String subStr = "ramdas";
		int match =0;
		char ch = 0 ;
		String matchingStrind = null;
		char main[] = mainStr.toCharArray();
		char sub[] = subStr.toCharArray();
		
		int a =main.length;
		int b=sub.length;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < main.length; i++) 
		{
			for (int j = 0; j < sub.length; j++) 
			{
				if(main[i]==sub[j])
				{
					match++;
					//ch = (char) (ch+sub[j]);
					matchingStrind = matchingStrind+sub[j];
				}
			}
		}
		System.out.println("matching String = "+ matchingStrind);
 
	}

}
