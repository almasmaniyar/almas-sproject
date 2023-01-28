package demoProgramsNew;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream(new File("data/testdata1.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
		    XSSFRow row = sheet.getRow(i);
		    for (int j = 0; j < row.getLastCellNum(); j++) {
		        XSSFCell cell = row.getCell(j);
		        // Do something with the cell data
		        file.close();

		    }
		}


	}

}
