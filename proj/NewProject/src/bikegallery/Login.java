package bikegallery;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	public static void main(String[]args) {
		String path1="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\WebProject-main\\WebProject-main\\project\\login.html");
		driver.findElement(By.id("username"));
		driver.findElement(By.id("password"));
		driver.findElement(By.id("submit")).click();
		//driver.close();
				}
			}

