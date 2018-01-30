
public class FIndTheString 
{
	public static void main(String[] args) 
	{
		String str = "Hi I am Nikhil Bhalerao";
		String str1 = "Nikhill";
		
		String str2[] = str.split(" ");
		
		System.out.println(str2.length);
		boolean flag=false;
		for(int i=0;i<=str2.length-1;i++)
		{
			//System.out.println(i+"---->"+str2[i]);
			if(str2[i].equals(str1))
			{	
				System.out.println("Matching..");
				flag = true;
			}
		}
		if(flag == false)
		{
			System.out.println("Not Matching..");
		}
	}

}
