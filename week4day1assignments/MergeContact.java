package week4day1assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	WebElement username= driver.findElement(By.id("username"));
	username.sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
	driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[1]")).click();
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> listWindowHandles = new ArrayList<String>(windowHandles);
	driver.switchTo().window(listWindowHandles.get(1));
	driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]/tbody/tr[1]/td[1]/div/a")).click();
	driver.switchTo().window(listWindowHandles.get(0));
	driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a/img)[2]")).click();
	Thread.sleep(3000);
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String> listWindowHandles2 = new ArrayList<String>(windowHandles2);
	driver.switchTo().window(listWindowHandles2.get(1));
	driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[5]/tbody/tr[1]/td[1]/div/a")).click();
	driver.switchTo().window(listWindowHandles2.get(0));
	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	driver.switchTo().alert().accept();
	System.out.println(driver.getTitle());

	}

}
