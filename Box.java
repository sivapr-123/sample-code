package pagefactory;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Box {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SivaPr\\Downloads\\CucumberJava\\CucumberJava\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(4000);

		Select drpCountry = new Select(driver.findElement(By.name("country")));

		drpCountry.selectByVisibleText("AUSTRALIA");

	}
}
