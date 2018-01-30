import java.io.IOException;

public class NewStaticDemo 
{
	 static int i=0;
	 //int j = 1;
	 public NewStaticDemo() 
	 {
		i++;
		System.out.println(i);
	 }
	 
	 public static void example()
	 {
		 System.out.println("in method..");
	 }
			 
	public static void main(String[] args) throws IOException 
	{
		//System.out.println("value if j in main " + j);
		new NewStaticDemo();
		new NewStaticDemo();
		new NewStaticDemo();
		Access.example1();
		//Process p = Runtime.getRuntime().exec("notepad.exe");
	}
}

class Access extends NewStaticDemo
{
	public static void example1()
	{
		 int j = NewStaticDemo.i;
		 System.out.println("value of J is :- "+ j);
	 	 NewStaticDemo.example();
	}
}



