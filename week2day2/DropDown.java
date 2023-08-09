package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	//To pass the values to form
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Jeeva Test Company 1");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevani");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jeeva");
	driver.findElement(By.name("departmentName")).sendKeys("Quality Analyst");
	driver.findElement(By.name("description")).sendKeys("Test the program");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevaniraodasa@gmail.com");
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd=new Select(source);
	dd.selectByIndex(2);
	WebElement industry =driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd1 = new Select(industry);
	dd1.selectByIndex(3);
	
	WebElement ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd2 = new Select(ownership);
	dd2.selectByValue("OWN_SCORP");
	
	
	
	

	}

	

}
