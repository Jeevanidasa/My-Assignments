package week4day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement amount1 = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		String amt=amount1.getText();
		System.out.println(amt);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newone = new ArrayList<String>(windowHandles);
		WebDriver newwindow = driver.switchTo().window(newone.get(1));
		System.out.println(newwindow.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='a-dynamic-image a-stretch-horizontal']")).click();
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File storeSS = new File(".amazon/mobile/oneplus/pic.jpg");
		FileUtils.copyFile(screenshotAs, storeSS);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
		driver.findElement(By.xpath("//span[@class='a-button a-spacing-small a-button-primary a-button-icon natc-enabled']")).click();
		Thread.sleep(5000);
		WebElement findElement = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		System.out.println(findElement.getText());
		if(findElement.getText().contains(amt))
		{
			
			System.out.println("subtotal verified");
		}
		driver.switchTo().window(newone.get(1)).close();
		driver.switchTo().window(newone.get(0)).close();

	}

}
