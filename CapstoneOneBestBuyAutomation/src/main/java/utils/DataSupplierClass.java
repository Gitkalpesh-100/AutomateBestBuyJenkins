/*package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataSupplierClass {
public static void main(String[] args)   
{  
try  
{  
File file = new File("CapstoneOne.xlsx");   //creating a new file instance  
FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
//creating Workbook instance that refers to .xlsx file  
XSSFWorkbook wb = new XSSFWorkbook(fis);   
XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
while (itr.hasNext())                 
{  
Row row = itr.next();  
Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
while (cellIterator.hasNext())   
{  
Cell cell = cellIterator.next(); 

CellType ss = cell.getCellType();

String string1=ss.toString();
//System.out.println(string1);
if (string1.equals("STRING"))              
{  

System.out.print(cell.getStringCellValue() + "\t\t\t");  
}
else {
	//cell.CELL_TYPE_NUMERIC;    //field that represents number cell type  
System.out.print(cell.getNumericCellValue() + "\t\t\t");  
  
} 
}
System.out.println();
}
}
catch(Exception e)  
{  
e.printStackTrace();  
} 
}
public String readvalue(Integer row,Integer column)   
{  
	 String value = "" ;
	
try  
{  
File file = new File("CapstoneOne.xlsx");   //creating a new file instance  
FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
//creating Workbook instance that refers to .xlsx file  
XSSFWorkbook wb = new XSSFWorkbook(fis);   
XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
  
Cell cell = sheet.getRow(1).getCell(1); 

CellType ss = cell.getCellType();

String string1=ss.toString();


//System.out.println(string1);
if (string1.equals("STRING"))              
{  
	value = sheet.getRow(row).getCell(column).getStringCellValue();
	System.out.println(sheet.getRow(row).getCell(column).getStringCellValue());
   }
else {
	double d = sheet.getRow(row).getCell(column).getNumericCellValue();
	value = Double.toString(d);
	
	
	
	//cell.CELL_TYPE_NUMERIC;    //field that represents number cell type  
	
	System.out.println(sheet.getRow(row).getCell(column).getNumericCellValue());
}


}
catch(Exception e)  
{  
e.printStackTrace();  
}
return value; 

}
}
*/