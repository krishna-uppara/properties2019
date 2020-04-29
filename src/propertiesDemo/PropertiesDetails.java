package propertiesDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDetails
{

	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();
		String path = "./config/setting.properties";
		FileInputStream fis = new FileInputStream(path);
		p.load(fis);
		String browser = p.getProperty("browser");
		int time = Integer.parseInt(p.getProperty("time"));
		System.out.println(time);
		System.out.println(browser);

	}

}
