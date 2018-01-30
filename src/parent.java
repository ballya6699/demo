
public class parent 
{
	void display(parent p)
	{
		System.out.println("parent");
	}
	
	void display(String s)
	{
		System.out.println("String");
	}
	
	public static void main(String[] args)
	{
		parent p = new parent();
		p.display("nikhil");
	}
}




