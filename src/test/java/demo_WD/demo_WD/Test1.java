package demo_WD.demo_WD;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1

{
	@Test
	public void amazonlogin() throws InterruptedException  {
		
		//   WebDriverManager.chromedriver().setup();
		   WebDriverManager.chromedriver().clearDriverCache().setup();
		   WebDriverManager.chromedriver().clearResolutionCache().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.amazon.in");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
		   Thread.sleep(2000);
           driver.quit();
}
}
