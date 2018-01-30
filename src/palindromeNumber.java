
public class palindromeNumber 
{

	public static void main(String[] args) 
	{
		int n = 53435;
		int m = n;
		int rev = 0;
		while(m!=0)
		{
			int rem = m%10;
			
			rev = rev*10 +rem;
			m = m/10;
			System.out.println(m);
		}
		if(n==rev)
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}
