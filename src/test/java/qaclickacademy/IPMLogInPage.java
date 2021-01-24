package qaclickacademy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class IPMLogInPage {
	
	
	//@FindBy(id="headerFrm:logoutLink")
	//public WebElement lnkLogout;
    @Test
	public void logIn() {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
		
	
        driver.get("http://172.31.55.217:7051/ipmSuite");

        WebElement username= driver.findElement(By.id("j_username"));
        username.sendKeys("admin");
        WebElement password= driver.findElement(By.id("j_password"));
        password.sendKeys("ROYC@dm1n");
        
        WebElement signInBtn= driver.findElement(By.id("loginBtn"));
        signInBtn.click();
   
     //   WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(lnkLogout));
        System.out.println("Logged in successfully into the IPM Application");
    
    	
		} catch(Exception ex) {
        System.out.println("Error occured while logging into the IPM Application using userName: Admin Password :ROYC@dm1n");
			
		}
		
	}
		
		
	
}
