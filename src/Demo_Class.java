
public class Demo_Class
{  
  void sum(int a,int b)
  {
	  System.out.println(a+b);
  }  
  int sum(int a,int b,int c)
  {
	  System.out.println(a+b+c);
	
	
	
	
	return c;
  }  

  public static void main(String args[]) 
  {  
	  Demo_Class obj=new Demo_Class();  
    obj.sum(10,10,10);  //30
    obj.sum(20,20);     //40 
    System.out.println("AAYUSH SANDEEP MANDLIK");
  }  
}  