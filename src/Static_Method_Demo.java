
public class Static_Method_Demo 
{
	static int i;
	static String s;
	  //Static method
	  static void display()
	  {
	     //Its a Static method
		 Static_Method_Demo obj1=new Static_Method_Demo();
	     System.out.println("i:"+obj1.i);
	     System.out.println("i:"+obj1.i);
	  }

	  void funcn()
	  {
	      //Static method called in non-static method
	      display();
	  }
	public static void main(String[] args) 
	{
		//Static method called in another static method
	      display();
	}

}
