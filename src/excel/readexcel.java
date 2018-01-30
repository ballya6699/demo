package excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		try 
		{
			File file = new File("F:\\NEW_WORKSPACE\\Demo\\Google_Login.xlsx");
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheet("Sheet1");
			
			Iterator<Row> rowIterator = sh.iterator();
			
			while (rowIterator.hasNext())
			{
				Row row = rowIterator.next();
				
				Iterator<Cell> cellIterator = row.cellIterator();
				
				while (cellIterator.hasNext()) 
				{
					Cell cell = cellIterator.next();
					
					switch (cell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
						
					case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");					
						break;
					
					case Cell.CELL_TYPE_BOOLEAN:
						System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                        
					default:
						break;
					}
					
				}
				
				System.out.println("");
			}
			
			fis.close();
			
		} catch (Exception e) 
		{
			
		}
	}

}
