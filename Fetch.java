package pagefactory;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SivaPr\\Downloads\\CucumberJava\\CucumberJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/"
				+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("siva");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]"
				+ "/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("prasad");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/"
				+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input"))
				.sendKeys("9491836961");

		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("siva@gmail.com");

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
				+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[17]/td/input")).click();

	}

}
