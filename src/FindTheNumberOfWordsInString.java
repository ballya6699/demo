
public class FindTheNumberOfWordsInString 
{

	public static void main(String[] args)
	{
		int word=1;
		String str = "One of the most important thing to solve any error is to "
				   + "One of the most important thing to solve any error is to "
				   + "One of the most important thing to solve any error is to";
		
		String[] str1 = str.split(" ");
		
		System.out.println(str1.length);
		
		/*for(int i=0;i<str.length();++i)
		  {
		   if(str.charAt(i)==' ')
		    word++;
		  }
		System.out.println(word);*/
	}

}
