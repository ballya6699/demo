
public class Static_Variable_Demo
{
	static int j=100;
	static String s = "Nikhil";
	static int i= 1;
	static
	{
		i = i-- + --i;
	}
	
	{
		i = i++ - ++i;
	}
	
	int methodOfTest()
	{
		return i+i-i*i/i;
	}
	public static void main(String[] args) 
	{
		Static_Variable_Demo obj=new Static_Variable_Demo();
	       //Non Static variables accessed using object obj
	       System.out.println("j: "+obj.i);
	       System.out.println("s: "+obj.s);
	       
	       System.out.println("j access in static way: "+i);
	       System.out.println("s access in static way: "+s);
	       
	       
	       /********************************************************************************************************/
	       
	       System.out.println(new Static_Variable_Demo().methodOfTest());

	}

}
