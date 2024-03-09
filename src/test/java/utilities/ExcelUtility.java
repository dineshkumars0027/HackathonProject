package utilities;
 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class ExcelUtility {
	public static void write(String sheetName, int rownum, int colnum, String data)throws IOException {
		//Opening the excel file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Book1.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
 
		//Creating the sheet if it does not exist
		if(book.getSheetIndex(sheetName)==-1) {
			book.createSheet(sheetName);              
		}
		XSSFSheet sheet=book.getSheet(sheetName);
		if(sheet.getRow(rownum)==null)
		{
			sheet.createRow(rownum);
		}
		XSSFRow row =sheet.getRow(rownum);   
		// Creating cell
		XSSFCell cell=row.createCell(colnum); 
		//Setting the data in the column
		cell.setCellValue(data); 
		FileOutputStream fo=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\Book1.xlsx");
		book.write(fo);
		book.close();
		file.close();
		fo.close();
	}
	public static String getCellData(String sheetName,int rownum,int colnum) throws IOException
	{
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Book1.xlsx");
		 XSSFWorkbook workbook=new XSSFWorkbook(fi);
		 XSSFSheet sheet=workbook.getSheet(sheetName);
		 XSSFRow row=sheet.getRow(rownum);
		 XSSFCell cell=row.getCell(colnum);
		DataFormatter formatter = new DataFormatter();
		String data;
		try{
		data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
		}
		catch(Exception e)
		{
			data="";
		}
		workbook.close();
		fi.close();
		return data;
	}
 
 
}