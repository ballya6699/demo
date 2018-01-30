public class democlass 
{	
	public democlass()
	{
		// TODO Auto-generated constructor stub
	}
	void demo()
	{
		
		String obj1 = new String("xyz");

		// now obj2 and obj1 reference the same place in memory
		String obj2 = obj1;

		if(obj1.equals(obj2))
		   System.out.println("obj1==obj2 is TRUE");
		else
		  System.out.println("obj1==obj2 is FALSE");

		
	}
	
	void deom()
	{
		
		/*try 
		{
			 System.out.println("In try block b4 system.exit()");
			 //System.exit(0);
			 int i = 5/0;
			 System.out.println(i);
			 System.out.println("After print statement..");
		} catch (Exception e)
		{
			
			System.out.println("in catch block");
			//System.exit(0);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in finally block");
			System.exit(0);
		}
		//return 1;*/
	}
	
	public static void main(String args[])
	{
		democlass d = new democlass();
		d.demo();
	}

}

