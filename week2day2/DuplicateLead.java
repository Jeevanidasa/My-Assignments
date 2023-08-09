package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("(//span[text()='Email'])")).click();
	driver.findElement(By.xpath("(//input[@name='emailAddress'])")).sendKeys("jeevaniraodasa@gmail.com");
	driver.findElement(By.xpath("(//button)[7]")).click();
	Thread.sleep(2000);
	WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));
	String firstLeadId = leadId.getText();
	System.out.println(firstLeadId);
	leadId.click();
	driver.findElement(By.xpath("(//a[text()='Duplicate Lead'])")).click();
	driver.findElement(By.xpath("(//input[@name='submitButton'])")).click();
	driver.close();
	
	}

}
