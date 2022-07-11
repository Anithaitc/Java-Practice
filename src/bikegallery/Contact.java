package bikegallery;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class Contact {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\WebProject-main\\WebProject-main\\project\\contact.html");
		Thread.sleep(2000);
		driver.findElement(By.id( "fname")).sendKeys("Anitha");
		driver.findElement(By.id( "lname")).sendKeys("Poluru");
		Thread.sleep(2000);
		driver.findElement(By.id( "email")).sendKeys("Anitha@gmail.com");
		driver.findElement(By.id( "mobile")).sendKeys("8978121036");
		Thread.sleep(2000);
		driver.findElement(By.id( "meg")).sendKeys("Happy to visit your website");
		Thread.sleep(2000);
		driver.findElement(By.id( "sub")).click();
		//driver.close();
	}
}
