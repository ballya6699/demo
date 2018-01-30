
public class ReverseString 
{
	public static void main(String args[]) 
	{
		String str = "Nikhil World Hello ";
		
		String s[] = str.split(" ");
		
		System.out.println("length "+s.length);
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
}
