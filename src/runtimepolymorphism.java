class shape
{
	void draw()
	{
		System.out.println("Drawing");
	}
}

class rectangle extends shape
{
	void draw()
	{
		System.out.println("Draw Rectangle..");
	}
}

class trangle extends rectangle
{
	void draw()
	{
		System.out.println("Draw Triangle..");
	}
}


public class runtimepolymorphism 
{
	public static void main(String[] args) 
	{
		shape sh;
		
		sh = new shape();
		sh.draw();
		
		sh = new rectangle();
		sh.draw();
		
		sh = new trangle();
		sh.draw();
	}

}
