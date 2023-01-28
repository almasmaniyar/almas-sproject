package pOM;

import java.io.IOException;


public class ActiTimeLogOut extends BaseTest{
	public static void main(String[] args) throws InterruptedException, IOException {
		BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	Flib flib = new Flib();
	LoginPage lp = new LoginPage(driver);
	lp.actiTimeValidLogin(flib.readPropertyData(PROPERTY1_PATH, "username"), flib.readPropertyData(PROPERTY1_PATH, "password"));
	
	Thread.sleep(2000);
	HomePage hp = new HomePage(driver);
	hp.selectUser(1);
	Thread.sleep(1000);
	hp.logOut();
	}

}
