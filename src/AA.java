
public class AA 
{
	public AA()
	{
		System.out.println("A");
	}
	public void display()
	{
		System.out.println("In Display A");
	}
	
	public static void main(String[] args) 
	{
		BB a = new BB();
		a.display();
	}

}

class BB extends AA
{
	public BB()
	{
		System.out.println("B");
	}
	public void display()
	{
		System.out.println("In Display B");
	}
}

class C extends BB
{
	public C()
	{
		System.out.println("C");
	}
	
	public void display()
	{
		System.out.println("In Display C");
	}
}
