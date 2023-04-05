package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile 
	{
		public static void main(String[] args) throws IOException
		{
			FileReader fr = new FileReader("D:\\Softwares\\Selenium_Workspace2\\TestAutomationFramework\\src\\test\\resources\\configfiles\\config.properties");
			
			Properties prop = new  Properties();
			
			prop.load(fr);
			
			System.out.println(prop.getProperty("browser"));
			System.out.println(prop.getProperty("testUrl"));
			
		}
}
