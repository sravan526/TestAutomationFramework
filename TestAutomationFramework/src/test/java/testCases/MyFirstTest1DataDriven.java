package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTest1DataDriven extends BaseTest
{
	  @Test(dataProviderClass=ReadXLSdata.class,dataProvider="svdata") 
	  public void LoginTest(String username,String password) 
	  {
		  driver.findElement(By.xpath(loc.getProperty("signin_Link"))).click();//loacators--properties
		  driver.findElement(By.xpath(loc.getProperty("userName"))).sendKeys("annamsravankumar1@outlook.com");//data hardcode
		  driver.findElement(By.xpath(loc.getProperty("next_Button"))).click();//loacators--properties
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.id(loc.getProperty("Password"))).sendKeys("sravan26@A");//datahardcode
		  driver.findElement(By.xpath(loc.getProperty("sign-in"))).click();//loacators--properties
		  String ExpectedTitle="Zoho Accounts";
		  String ActualTitle =driver.getTitle();
		  System.out.println(ActualTitle);
		  Assert.assertEquals(ExpectedTitle,ActualTitle);
		  driver.quit();
	  }
 
} 
