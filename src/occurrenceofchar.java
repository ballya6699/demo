
public class occurrenceofchar
{

	public static void main(String[] args) 
	{
		int k=0,j=0,l=0;
	 String str = "nikhil";
	 for (int i = 0; i <= str.length()-1; i++) 
	 {
		 char ch = str.charAt(i);
		if(ch=='n')
		{
			k++;
		}
		if(ch=='i')
		{
			j++;
		}
		if(ch=='l')
		{
			l++;
		}
		
	 }
	 
	 System.out.println(k);
	 System.out.println(j);
	 System.out.println(l);

	}

}
