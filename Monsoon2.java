package pagefactory;

public class Monsoon2 {
	package Monsoon.maveric;

	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;

	public class DemoSS {
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chromedriver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://askomdch.com/");
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileHandler.copy(scrFile, new File("screenshot.png"));
			Alert alert = driver.switchTo().alert();
			alert.dismiss();

		}
	}
}
---------------------------------------------------------------------
package Monsoon.maveric;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");

		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		org.openqa.selenium.Alert popup = driver.switchTo().alert();
		Thread.sleep(3000);
		popup.accept();
		driver.manage().window().maximize();
		driver.close();

	}

}
/*
 * try { Alert addtocart = driver.switchTo().alert(); addtocart.accept();
 * Thread.sleep(5000); } catch (Exception e) { System.out.println("No Alert"); }
 */
