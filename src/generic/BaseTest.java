package generic;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class BaseTest implements DriverConstant

{
public WebDriver driver;
@Test
public void preconditions() 
{
	System.setProperty(GECKO_Key, GECKO_Values);
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("www.google.com");
	}


	@AfterMethod
	public void postconditions () 
	{
		driver.close();
	}
}


