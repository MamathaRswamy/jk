package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Helloworld {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fs=new FileInputStream("./src/test/resources/testdata/data.xlsx");
Workbook book = WorkbookFactory.create(fs);
Sheet sheeet = book.getSheet("Sheet1");
Row rows = sheeet.getRow(1);
Cell celll = rows.getCell(0);
System.out.println(celll);


}
}
