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
		
	
        driver.get("http://royB");

        WebElement username= driver.findElement(By.id("j_username"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.id("j_password"));
        password.sendKeys("Admin");
        
        WebElement signInBtn= driver.findElement(By.id("loginBtn"));
        signInBtn.click();
   
     //   WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(lnkLogout));
        System.out.println("Logged in successfully into the IPM Application");
    
    	
		} catch(Exception ex) {
        System.out.println("Error1 occured while logging into the IPM Application using userName: Admin Password :ROYC@dm1n");
			
		}
		
	}
		
		
	
}
