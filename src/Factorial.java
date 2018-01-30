
public class Factorial 
{
	public static void main(String[] args)
	{
		int i = 6,res=1;
		for(int j = i ;j>=1;j--)
		{
			res = res*j;
		}
		System.out.println(res);
		
		 
		  int n = 5;
		  int result = factorial(n);
		  System.out.println("The factorial of "+ n +"! = " + result);
	}
		public static int factorial(int n)
		{
		       if (n == 0)
		       {
		          return 1;
		       }
		       else
		       {
		    	   return n * factorial(n - 1);
		       }
		}
		
		
		

	}

