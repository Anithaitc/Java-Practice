package NewPack;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
		public static void main(String[]args) {
			String path1="D:\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path1);
			WebDriver driver=new ChromeDriver();
			driver.get("D:\\WebProject-main\\WebProject-main\\project\\booking.html");
			driver.findElement(By.className("Firstname")).sendKeys("First_name");
			driver.findElement(By.className("Lastname")).sendKeys("Last_name");
			driver.findElement(By.className("Address")).sendKeys("Address");
			driver.findElement(By.className("email")).sendKeys("Email");
			driver.findElement(By.className("Phonenumber")).sendKeys("Phonenumber");
			driver.findElement(By.id("DOB")).sendKeys("name");
			driver.findElement(By.id("submit")).click();
					
					//driver.close();
				}
			}






