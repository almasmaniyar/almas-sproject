package pOM;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	Flib flib = new Flib();
	LoginPage lp = new LoginPage(driver);
	
	int rc=flib.rowCount(EXCEL_PATH1, "invalidcreds");
	for(int i=1; i<=rc; i++) 
	{
	String inValidUsername=flib.readExcelData(EXCEL_PATH1, "invalidcreds", i, 0);
	String inValidPassword=flib.readExcelData(EXCEL_PATH1, "invalidcreds", i,1);
	
	lp.actiTimeInValidLogin(inValidUsername, inValidPassword);
	}
	}
}
