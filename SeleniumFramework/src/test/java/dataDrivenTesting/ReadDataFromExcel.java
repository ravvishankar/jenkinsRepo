package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Step-1 : Get the excel path location  & java object of physical file
		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\data\\testscriptdata.xlsx");
		//Step-2 : Open Workbook in read mode
		Workbook wb = WorkbookFactory.create(fis);
		//Step-3 : Get the control of "practice"sheet
		Sheet sh = wb.getSheet("practice");
		//Step-4 : Get the control of 1st Row
		Row row = sh.getRow(1);
		//Step-5 : Get the control of 2nd cell & read the string data
		Cell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println(data);
		//Step-6 : Close the workbook
		wb.close();
		
	}

}
