package readPropertyData;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.apache.poi.hpsf.Property;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("./data/config.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String data = prop.getProperty("browser");
		System.out.println(data);

	}

}
