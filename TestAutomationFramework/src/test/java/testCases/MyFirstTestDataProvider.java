package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.BaseTest;

public class MyFirstTestDataProvider extends BaseTest
{
  @Test(dataProvider="testdata")
  public void LoginTest(String userName,String Password) 
  {
	  driver.findElement(By.xpath(loc.getProperty("signin_Link"))).click();//loacators--properties
	  driver.findElement(By.xpath(loc.getProperty("userName"))).sendKeys(userName);//data hardcode
	  driver.findElement(By.xpath(loc.getProperty("next_Button"))).click();//loacators--properties
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.id(loc.getProperty("Password"))).sendKeys(Password);//datahardcode
	  driver.findElement(By.xpath(loc.getProperty("sign-in"))).click();//loacators--properties
	  String Title =driver.getTitle();
	  System.out.println(Title);
	  driver.quit();
  }
  @DataProvider (name="testdata")
  public Object [][]tData()
  {
	  return new Object[][] 
	{
		  {"annamsravanku@utlook.com","sravan26@A"},
		  {"annamvankumar1@otlook.com","sravan26@A"},
		  {"annamsrakumar1@oulook.com","sravan26@A"},
		  {"annamsravankumar1@outlook.com","sravan26@A"},
	};

  }
}
