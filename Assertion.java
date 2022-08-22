package pagefactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SivaPr\\Downloads\\CucumberJava\\CucumberJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "welocome to guru99";
		Assert.assertEquals(ActualTitle, ExpectedTitle);

	}

}
