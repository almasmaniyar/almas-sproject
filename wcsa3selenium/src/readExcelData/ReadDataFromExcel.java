package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	//read operation
  public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException ,IOException {
   FileInputStream fis=new FileInputStream("./data/testdata1.xlsx"); //getting the specified file for read operation
   Workbook wb=WorkbookFactory.create(fis);//it makes the file ready for read operation
   Sheet sh=wb.getSheet("validdata");// it specifies which sheet 
   Row row = sh.getRow(2);//specifies the row 
   Cell cell = row.getCell(0);//specifies the column
   String data = cell.getStringCellValue();
   System.out.println(data);
  
  }
}
