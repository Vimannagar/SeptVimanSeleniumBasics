package utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigData {
	
	
	public static void main(String[] args) throws IOException {
	Properties prop = new Properties();
		
	FileInputStream fis = new FileInputStream("E:\\Desktop\\VimanNagar\\May 21\\SeptVimanSeleniumBasics\\config.properties");
	
	prop.load(fis);
	
	String urlvalue = prop.getProperty("url");
	
	System.out.println(urlvalue);
	
	String usernamevalue = prop.getProperty("username");
	
	System.out.println(usernamevalue);
	
	
	}
	
	public static String getDataFromConfig(String keyvalue) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\Desktop\\VimanNagar\\May 21\\SeptVimanSeleniumBasics\\config.properties");
		
		prop.load(fis);
		
		String actualvalue = prop.getProperty(keyvalue);
		
		return actualvalue;
	}
	
	

}
