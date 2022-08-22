package pagefactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SivaPr\\Downloads\\CucumberJava\\CucumberJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		org.openqa.selenium.Alert confirmation = driver.switchTo().alert();
		String alerttext = confirmation.getText();
		System.out.println(alerttext);
	}
}
