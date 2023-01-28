package createDataExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("almas");
		sheet.getRow(1).createCell(1).setCellValue("maniyar");
		File file = new File("C:\\Users\\almas\\Desktop\\wcsa3workspacenew\\wcsa3selenium\\data\\testdata5.xlsx");	
		FileOutputStream fos=new FileOutputStream(file);
		workBook.write(fos);
		workBook.close();
	}

}
