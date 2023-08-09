package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.Point;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		
		//To  click and confirm the title
		
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		
	// To confirm the button is disabled
		
		boolean isEnabled = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
		if(isEnabled) {
			System.out.println("Yes, the element is enabled");
		}else {
			System.out.println("No, the element is disabled");
		}
		
		Thread.sleep(2000);
		
		// To Find the position of  the submit button
		Point locationOfSave = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
		System.out.println("The Location of Submit Button is "+locationOfSave);
		
		// to find the save button color
		String colorOfSaveButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println("The color is Save Button is "+colorOfSaveButton);
		
		//to Find the height and width of this button 
		Dimension sizeOfSbumitButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println("The Height and Width of Submit Button is "+sizeOfSbumitButton);
		
		//to mouse over and confirm the color changed
		WebElement successButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		Actions action = new Actions(driver);
		action.moveToElement(successButton).perform();
		String successButtonColor = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']//span")).getAttribute("style");
		System.out.println("The Color of Success Button is "+successButtonColor);
		
		// To Click Image Button and Click on any hidden button
		
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-warning']")).click();
		WebElement hidden= driver.findElement(By.xpath("//div[@id='j_idt88:j_idt102:imagePanel']"));
		hidden.click();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		driver.navigate().back();
//		if() {
//			System.out.println("Yes, the element is enabled");
//		}else {
//			System.out.println("No, the element is disabled");
//		}
		//How many rounded buttons are there?
		
		}

}
