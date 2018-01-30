public class XXX
{
	public static int i = 1;
	
	public void display()
	{
		i=2;
		System.out.println("In Parent " + i);
	}
	
	public void show()
	{
		System.out.println("In Parent Show Method..");
	}
	
	public static void diaplay(String name)
	{
		i = 3;
		System.out.println(name+" "+i);
	}
	
	public static void main(String args[])
	{
		XXX x = new b();
		x.display();
		x.show();
		XXX.diaplay("NIKHIL");
		//b b = new XXX();
	}
}

class b extends XXX
{
	public void show()
	{
		int i = 11;
		System.out.println("In child show.."+ i);
	}
	
	public void display()
	{
		i=12;
		System.out.println("In child display.." + i);
	}
}