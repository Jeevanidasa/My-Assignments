package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jeevani");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("D");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7995518142");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Tanvi@1992");
		
		WebElement day =driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd2 = new Select(day);
		dd2.selectByValue("26");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd3 = new Select(month);
		dd3.selectByVisibleText("Dec");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd4 = new Select(year);
		dd4.selectByVisibleText("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		

	}

}
