package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Jeevani");
	driver.findElement(By.xpath("(//button)[7]")).click();
	Thread.sleep(2000);
	WebElement leadId = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)"));
	String firstLeadId = leadId.getText();
	System.out.println(firstLeadId);
	leadId.click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Jeeva");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	 Thread.sleep(2000);
	 driver.close();
	}

}
