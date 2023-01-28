package keyWordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc=flib.rowCount("./data/ActiTimeTestData.xlsx","invalidrecords");
		for(int i=0; i<=rc;i++)
		{
			//String usn=flib.readExcelData("./data/actiTimeTestData.xlsx","invalidcreds",i,0);
			//String pass=flib.readExcelData("./data/actiTimeTestData.xlsx","invalidcreds",i,1);

			//driver.findElem
		}
	}
}
