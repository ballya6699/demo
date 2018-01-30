public class DecimalToBinary 
{
	public void toBinary(int num)
	{
		String calssName = this.getClass().getName();
		String binary = "";
		while(num!=0)
		{
			int rem = num%2;
			binary = rem + binary;
			num=num/2;
		}
			System.out.println(binary);
			System.out.println(calssName);
	}
	public static void main(String[] args) 
	{
		DecimalToBinary dtoc = new DecimalToBinary();
		dtoc.toBinary(11);
	}

}
