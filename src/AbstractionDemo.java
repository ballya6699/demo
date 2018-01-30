
public class AbstractionDemo extends Employee
{

	public AbstractionDemo(String name, String address, String number) 
	{
		super(name, address, number);
		
	}

	public static void main(String[] args) 
	{
		
	}

}
abstract class Employee
{
	private String name;
	private String address;
	private String number;
	
	public Employee(String name, String address, String number)
	{
		System.out.println("Constructor Of Emlployee..");
		this.name = name;
		this.address = address;
		this.number = number;		
	}
	
	public void mailCheck()
	{
		System.out.println("Mailing Ckeck to "+ this.name+" "+this.address);
	}
	
	public String toString()
	{
		return name + " " + address + " " + number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getNumber()
	{
		return number;
	}
	
	public void setNumber(String newAddress)
	{
		address  = newAddress;
	}
}
