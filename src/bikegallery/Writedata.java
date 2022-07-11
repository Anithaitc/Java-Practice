package bikegallery;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Writedata {
	public static void main (String [] args) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\itctesting20\\Downloads\\Webelements of bike gallery.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("practice");
	    Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("This is testing training ...");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\itctesting20\\Downloads\\Webelements of bike gallery.xlsx");
		workbook.write(fos);
		fos.close();
		System.out.println("END OF WRITING DATA IN EXCEL");
		}
}
