package week6day1assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;
public class LeadBase {
	public ChromeDriver driver; //global variable

    public String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Parameters({"url", "username", "password"})
    @BeforeMethod
    public void preCondition(String url, String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
    }



    @DataProvider(name = "dataProvider")
    public Object[][] sendData() throws IOException {
        Object[][] data=ReadExcelFile.readExcel(fileName);
        return data;
    }

    @AfterMethod
    public void postCondition() {
        driver.close();
    }
}
