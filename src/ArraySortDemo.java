
public class ArraySortDemo 
{
	public static void main(String[] args) 
	{
		int arr[] = {100,90,2505,80,1000,70,60,50,40,30,20,10};
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				//System.out.println(arr[i]);
				//System.out.println(arr[j]);
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}

	}
	
		/*int i =10;
		if(i==10)
		{
			int j = 20;
			System.out.println(i);
			System.out.println(j);
		}
		System.out.println(i);
		System.out.println(j);*/
}

