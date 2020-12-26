package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class Apache {

	public static void main(String[] args) {
		// create file stream
		FileInputStream f = new FileInputStream (new File("C:\\Users\\abidu\\Documents\\Apache\\TestFile.xlsx"));  
		
		
		HSSFWorkbook wb = new HSSFWorkbook(f);
		
		HSSFSheet sheet  = wb.getSheetAt(0);
		
		
		
		
		

		
		
		
		
		
		

	}

}
