import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		//File f = new File("C:\\Users\\abidu\\Desktop\\New folder\\newexcel.txt");
		File f = new File("C:\\Users\\abidu\\Desktop\\New folder\\newexcel2.xlsx");
		// Create excel file
		// XSSFWorkbook support new and older XLS and XLSX
		XSSFWorkbook efile = new XSSFWorkbook();//Create an Object
		XSSFSheet sheet1 = efile.createSheet("Sheet1");
		XSSFSheet sheet2 = efile.createSheet("Sheet2");
		
		Row row1 = sheet1.createRow(1);
		Cell cellA = row1.createCell(1);
		Cell cellB = row1.createCell(2);
		Cell cellD = row1.createCell(3);
	
		cellA.setCellValue("First");
		cellB.setCellValue("Second");
		cellD.setCellValue("Third");
		
		Row row2 = sheet2.createRow(0);
		Cell cell2A = row2.createCell(0);
		Cell cell2B = row2.createCell(1);
		Cell cell2D = row2.createCell(2);
	
		cell2A.setCellValue("First");
		cell2B.setCellValue("Second");
		cell2D.setCellValue("Third");
		
		
		
		FileOutputStream fo = new FileOutputStream (f);
		efile.write(fo);
		efile.close();
		System.out.println(efile);
		System.out.println("Excel File were created");

	}

}