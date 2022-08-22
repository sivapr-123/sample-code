package pagefactory;

public class selenium {

	package RookieBatch.RookieBatch;import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;import com.github.dockerjava.api.model.Driver;import io.github.bonigarcia.wdm.WebDriverManager;public class webtable {
	    @Testpublic void test01() {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
	    driver.manage().window().maximize();
	    //div[text()='"+FN+"']//following-sibling::div[1]"    String cID = driver.findElement(By.xpath("//table/tbody/tr/td[1]")).getText();
	    String cName = driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText();
	    String cntName = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
	    String Address = driver.findElement(By.xpath("//table/tbody/tr/td[4]")).getText();
	    String city = driver.findElement(By.xpath("//table/tbody/tr/td[5]")).getText();
	    String pCode = driver.findElement(By.xpath("//table/tbody/tr/td[6]")).getText();
	    String Country = driver.findElement(By.xpath("//table/tbody/tr/td[7]")).getText();
	    System.out.println(cID);
	    System.out.println(cName);
	    System.out.println(cntName);
	    System.out.println(Address);
	    System.out.println(city);
	    System.out.println(pCode);
	    System.out.println(Country);


}
