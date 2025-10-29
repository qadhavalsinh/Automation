package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import driverConnection.DriverConnection;

public class P002_FBCreateAcc {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.getDriver(url);
		
		WebElement createAccLink = driver.findElement(By.linkText("Create new account"));
		createAccLink.click();
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("selenium");
		
		WebElement lastname =  driver.findElement(By.name("lastname"));
		lastname.sendKeys("testers");
		
		WebElement days= driver.findElement(By.id("day"));
		//9/07/2002
		Select day = new Select(days);
		day.selectByIndex(8);
		
		WebElement months = driver.findElement(By.id("month"));
		
		Select month = new Select(months);
		month.selectByValue("7");
		
		WebElement years = driver.findElement(By.id("year"));
		
		Select year = new Select(years);
		year.selectByVisibleText("2002");
		
		List<WebElement> gender = driver.findElements(By.id("sex"));
		for(WebElement e:gender) {
			System.out.println(e);
		}
		
		gender.get(1).click();
		
		WebElement mono = driver.findElement(By.name("reg_email__"));
		mono.sendKeys("9876543210");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("selenium@123");
		
			
	}
}
