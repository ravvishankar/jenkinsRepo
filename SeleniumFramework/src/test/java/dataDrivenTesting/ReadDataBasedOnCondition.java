package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataBasedOnCondition {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ravis\\OneDrive\\Desktop\\data\\testscriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("practice");
		int rowCount = sh.getLastRowNum();
		String condition = "tc_102";
		String data = "";
		String data1 = "";
		String data2 = "";
		String data3 = "";

		boolean flag = false;
		for (int i = 0; i <= rowCount; i++) {
			try {
				data = sh.getRow(i).getCell(0).getStringCellValue();
				if (condition.equals(data)) {
					flag = true;
					data1 = sh.getRow(i).getCell(1).getStringCellValue();
					data2 = sh.getRow(i).getCell(2).getStringCellValue();
					data3 = sh.getRow(i).getCell(3).getStringCellValue();

				}
			} catch (Exception e) {
			}

		}
		if (flag == true) {
			System.out.println(data1 + " " + data2 + " " + data3);
		} else {
			System.out.println(condition + " " + "Data is not available");
		}
	}
}
