import org.apache.poi.ss.formula.eval.ConcatEval;

public class StringEquals 
{

	public static void main(String[] args) 
	{
		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = str2;
		
		if(str.equals(str1))
		{
			System.out.println("String str = hello and String str1 = hello");
			System.out.println("str.equals(str1)  --- " + str.equals(str1) + "\n");
		}
		if(str1.equals(str2))
		{
			System.out.println("String str1 = hello and String str2 = new String("+"\"hello\""+")");
			System.out.println("str1.equals(str2) --- " + str1.equals(str2)+ "\n");
		}
		
		if(str2.equals(str3))
		{
			System.out.println("String str2 = new String("+"\"hello\""+") and String str3 = new String("+"\"hello\""+")");
			System.out.println("str2.equals(str3) --- " + str2.equals(str3) + "\n");
		}
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-* \n");
		
		
		if(str==str1)
		{
			System.out.println("There..");
			System.out.println("str==str1  --- " + str==str1);
		}
		
		if(str1==str2)
		{
			System.out.println("IS");
			System.out.println("str1==str2 --- \n" + str1==str2);
		}
		
		if(str2==str3)
		{
			System.out.println("Here..");
			System.out.println("str2==str3" + str2==str3);
		}
		
		/*String str = "Nikhil"; 
		String str1 = new String("Ramdas");
		System.out.println(str.concat( " "+str1).concat(" Bhalerao.."));*/
		
	}

}
