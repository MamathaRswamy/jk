package pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dem {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/testdata/data.xlsx");
	Workbook wr=new XSSFWorkbook(fis);
	Sheet dew = wr.getSheet("Sheet1");
	System.out.println(dew.getRow(0).getCell(1));
	
	
	/*
	 * Workbook deo = WorkbookFactory.create(fis); //Workbook work1 =
	 * WorkbookFactory.create(fis); Sheet s1 = deo.getSheet("Sheet1"); String data =
	 * s1.getRow(1).getCell(1).toString(); System.out.println(data);
	 */
	

}
}
