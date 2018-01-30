
public class ZZZ 
{
	public void display(ZZZ z)
	{
		System.out.println(z);
	}
	
	public void dispaly(String str)
	{
		System.out.println("String Object");
	}
	public static void main(String[] args) 
	{
		ZZZ z = new ZZZ();
		z.dispaly(null);
	}

}
