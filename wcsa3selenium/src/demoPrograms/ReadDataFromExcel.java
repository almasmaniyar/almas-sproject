package demoPrograms;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\almas\\Desktop\\wcsa3workspacenew\\wcsa3selenium\\data\\testdata5.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		/*String cetValue = sheet.getRow(0).getCell(0).getStringCellValue();
		String cetValue1 = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(cetValue);
		System.out.println(cetValue1);
		workbook.close();
		fis.close();
	*/
		int rowCount=sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowCount ;i++)
		{
			XSSFRow row=sheet.getRow(i);
		
		int cellCount=row.getPhysicalNumberOfCells();
		
		for(int j=0; j<cellCount; j++)
		{
			XSSFCell cell=row.getCell(j);
			String cellvalue=getCellValue(cell);
			System.out.print("||"+cellvalue);
		}	
		System.out.println();
		}
		workbook.close();
		fis.close();
	}
	public static String getCellValue(XSSFCell cell)
	{
		switch (cell.getCellType())
		{
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
			default:
				return cell.getStringCellValue();
		}
		
	}
	}

