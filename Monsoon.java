package pagefactory;

public class Monsoon {
	
	package Monsoon.maveric;

	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	//import org.openqa.selenium.support.ui.ISelect;

	public class Selenium1 {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chromedriver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://askomdch.com/");

			// JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(0,950)", "");

			// driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();
			// driver.findElement(By.xpath("//*[@id=\"woocommerce-product-search-field-0\"]")).sendKeys("jeans");
			// driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-1\"]/form/button")).click();

			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileHandler.copy(scrFile, new File("screenshot.png"));
			// driver.manage().window().maximize();
		}
	}

	/*
	 * driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a[2]")).
	 * click(); driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"ast-site-header-cart\"]/div[1]/a/div/span")).click();
	 * 
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	 * 
	 * // driver.findElement(By.xpath("//*[@id=\"payment_method_cod\"]")).click();
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys(
	 * "siva");
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys(
	 * "prasad"); // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 * 
	 * // driver.findElement(By.xpath(
	 * "//*[@id=\"billing_country_field\"]/span/span/span[1]/span/span[2]/b")).click
	 * ();
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys(
	 * "Chennai");
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).
	 * sendKeys("Near DLF");
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Chennai")
	 * ;
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys(
	 * "85001");
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"billing_email\"]")).sendKeys(
	 * "siva@gmail.com");
	 * 
	 * driver.findElement(By.xpath("//*[@id=\"place_order\"]")).click();
	 * 
	 * // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 * 
	 * // Select drpcountry = new Select(driver.findElement(By.name("Country")));
	 * 
	 * // drpcountry.selectByVisibleText("US");
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * }
	 */

	/*
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript("window.scrollBy(0,950)", ""); driver.findElement(By.xpath(
	 * "//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[2]/div[2]/a[2]")).click();
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"post-61\"]/div/div[3]/div/div/ul/li[2]/div[2]/a[3]")).click();
	 * 
	 * js.executeScript("window.scrollBy(0,950)", ""); driver.findElement(By.xpath(
	 * "//*[@id=\"post-1220\"]/div/div/div/div/div[2]/div/div/a")).click();
	 * driver.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys(
	 * "siva");
	 * driver.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys(
	 * "prasad");
	 * 
	 */


}
