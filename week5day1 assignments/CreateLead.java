package week5day1assignments;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateLead extends LeadBase{

	@Test
	public void createLead() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevani");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dasa");
        driver.findElement(By.name("submitButton")).click();
	
		
	}

}
