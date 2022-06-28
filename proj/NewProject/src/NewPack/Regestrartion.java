package NewPack;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regestrartion{
	public static void main(String[]args) {
		String path1="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path1);
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\WebProject-main\\WebProject-main\\project\\regester.html");
		driver.findElement(By.id("name")).sendKeys("Anitha");
		driver.findElement(By.id("username")).sendKeys("PoluruAnitha");
		driver.findElement(By.id("mail")).sendKeys("anitha@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8978121036");
		driver.findElement(By.id("pass")).sendKeys("ani@123");
		driver.findElement(By.id("conpass")).sendKeys("ani@123");
		WebElement radioboxSelect=driver.findElement(By.id("boy"));
		Boolean isSelect=radioboxSelect.isSelected();
		if(isSelect=false) {
			radioboxSelect.click();
		}
		driver.findElement(By.id("submit")).click();
				
				//driver.close();
			}
		}




