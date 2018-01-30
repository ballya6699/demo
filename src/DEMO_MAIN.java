/*
public class DEMO_MAIN 
{
	
	public static void main(String[] args)
	{
		
		DEMO_MAIN dm  = new DEMO_MAIN();
		DEMO_MAIN.main("NIkhil");
		dm.main(100);
		dm.main("bhalerao");
		System.out.println("Form the MAIN main function...");
	}
	
	public static void main(String arg)
	{
		System.out.println(arg);
		System.out.println("Form the MAIN(STRING ARG) main function...");
	}
	
	public void main(int a)
	{
		System.out.println(a);
		System.out.println("Form the MAIN(int a) main function...");	
	}
}*/
 class X
{
	 static void staticMethod()
	    {
	        System.out.println("Class X");
	    }
	}
	 
	class Y extends X
	{
	    static void staticMethod()
	    {
	        System.out.println("Class Y");
	    }
	}
	 
	public class DEMO_MAIN
	{
	    public static void main(String[] args)
	    {
	    	X.staticMethod();
	        Y.staticMethod();
	    }
	}