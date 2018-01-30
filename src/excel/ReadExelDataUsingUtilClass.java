package excel;

public class ReadExelDataUsingUtilClass 
{
	public static void main(String args[]) throws Exception
	{
		ExcelApiTest eat = new ExcelApiTest("F:\\NEW_WORKSPACE\\Demo\\Google_Login.xlsx");
		System.out.print(eat.getCellData("Sheet1", 0, 0));
		System.out.print(eat.getCellData("Sheet1", 0, 1));
		System.out.println(eat.getCellData("Sheet1", 0, 2));
		
		System.out.println("**********************************************************");
		
		System.out.print(eat.getCellData("Sheet1", 1, 0));
		System.out.print(eat.getCellData("Sheet1", 1, 1));
		System.out.println(eat.getCellData("Sheet1", 1, 2));
		
		System.out.println("**********************************************************");
		
		System.out.print(eat.getCellData("Sheet1", 2, 0));
		System.out.print(eat.getCellData("Sheet1", 2, 1));
		System.out.println(eat.getCellData("Sheet1", 2, 2));
	}
}
