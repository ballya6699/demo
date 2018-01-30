
public class BinaryToDecimal 
{
	public void Decimal(int num)
	{
		int decimal = 0;
		int power = 0;
		int rem;
		while(num!=0)
		{
			rem = num%10;
			decimal += rem * Math.pow(2,power);
			num = num/10;
			power++;
		}
		System.out.println(decimal);
	}
	public static void main(String[] args) 
	{
		BinaryToDecimal bTod = new BinaryToDecimal();
		bTod.Decimal(111);				

	}

}
