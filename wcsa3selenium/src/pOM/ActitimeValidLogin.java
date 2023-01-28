package pOM;

import java.io.IOException;
public class ActitimeValidLogin extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(flib.readPropertyData(PROPERTY1_PATH, "username"), flib.readPropertyData(PROPERTY1_PATH, "password"));

	}

}
