package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	//To pass the values to form
	driver.findElement(By.id("firstNameField")).sendKeys("Jeevani");
	driver.findElement(By.id("lastNameField")).sendKeys("G");
	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Jeeva");
	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tarun");
	driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Quality Analsyst");
	driver.findElement(By.id("createContactForm_description")).sendKeys("Test the program");
	driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jeevaniraodasa@gmail.com");
	WebElement state =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select dd2 = new Select(state);
	dd2.selectByValue("NY");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("update the test data");
	driver.findElement(By.xpath("(//input)[44]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	

	}

}
