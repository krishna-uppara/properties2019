package propertiesDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Advancepropertiesviamap
{
	static Map<String, String> pro;
	String keyvalue;
	FileInputStream fis;
	Properties p;
	String path = "./config/setting.properties";

	Advancepropertiesviamap() throws IOException
	{
		pro = new HashMap<String, String>();
		p = new Properties();
		fis = new FileInputStream(path);
		p.load(fis);

	}

	public Map<String, String> proValue(Properties p, Map<String , String> pro)
	{

		for (String keys : p.stringPropertyNames())
		{
			// System.out.println(key);
			pro.put(keys, p.getProperty(keys));
		}
		return pro;

	}

	public String getValue(String key, String value)
	{

		Map<String, String> obj = proValue(p,pro);
		if (obj.isEmpty())
		{
			System.out.println("property file is empty");
		}
		else
		{
			if (obj.containsKey(key) && value.equals(obj.get(key)))
			{
				keyvalue = obj.get(key);
				System.out.println("Key contains in the property file");
				System.out.println("KEY is " + key + " and its VALUE is " + keyvalue);
			}
			else
			{
				System.out.println("key does not contains in the property file");
			}
		}
		return keyvalue;

	}

	public static void main(String[] args) throws IOException
	{
		Advancepropertiesviamap d = new Advancepropertiesviamap();
		System.out.println(d.getValue("king", "uuuuu"));

	}

}
