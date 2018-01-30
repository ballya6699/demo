
public class FirstLetterCapitalOfString 
{
	public static void main(String[] args) 
	{
		String str = "i am nikhil bhalerao ...";
		
		String[] strSplit = str.split(" ");
		
		for (int i = 0; i<=strSplit.length-1;i++) 
		{
			String strUp = strSplit[i];
			char ch = strUp.charAt(0);
			strUp = strUp.substring(1);
			ch = Character.toUpperCase(ch);
			strUp = ch+strUp;
			System.out.print(strUp + " ");
		}
	}
}

