package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple {

	@Test(dataProvider = "testdata")
	public void TestChrome(String uname, String password) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SivaPr\\Downloads\\CucumberJava\\CucumberJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sivaprasad@");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/"
				+ "/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input")).sendKeys("prasad@123");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/"
				+ "td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input"))
				.sendKeys("prasad@123");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
				+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();

	}

}
