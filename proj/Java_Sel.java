package proj;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Java_Sel {
	public static void main(String[]args) {
		String path1="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("username")).sendKeys("Anitha1036");
		driver.findElement(By.id("password")).sendKeys("Ani@webelement1");
		driver.findElement(By.id("login")).click();
		driver.get("https://adactinhotelapp.com/");
		driver.close();
	}
}
