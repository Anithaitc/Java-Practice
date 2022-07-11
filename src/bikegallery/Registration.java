package bikegallery;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) throws InterruptedException {
		String path1 = "D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		WebDriver driver = new ChromeDriver();
		driver.get("D:/WebProject-main/WebProject-main/project/register.html");

		driver.findElement(By.id("name")).sendKeys("anitha");
		driver.findElement(By.id("username")).sendKeys("anithaitc");
		driver.findElement(By.id("mail")).sendKeys("anithapoluru@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.findElement(By.id("pass")).sendKeys("Ani@123");
		driver.findElement(By.id("conpass")).sendKeys("Ani@123");
		WebElement radioboxSelect = driver.findElement(By.id("girl"));
		Boolean isSelect = radioboxSelect.isSelected();
		if (isSelect == false) {
			radioboxSelect.click();
		}
		driver.findElement(By.id("submit")).click();
		driver.switchTo().alert().accept();
		// driver.close();
	}

}
