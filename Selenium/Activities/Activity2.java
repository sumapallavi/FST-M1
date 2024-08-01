package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 
{
	public static void main(String[] args) 
	{
	// Set up Firefox driver
    WebDriverManager.firefoxdriver().setup();
    // Create a new instance of the Firefox driver
    WebDriver driver=new FirefoxDriver();
    //open page
    driver.get("https://v1.training-support.net/selenium/login-form");
    // Find the username field and enter the username
    driver.findElement(By.id("username")).sendKeys("admin");
 // Find the password field and enter the password
    driver.findElement(By.id("password")).sendKeys("password");
 // Find the login button and click it
    driver.findElement(By.xpath("//button[text()='Log in']")).click();
 // Print the confirmation message
    String message=driver.findElement(By.id("action-confirmation")).getText();
    System.out.println("Login message: " + message);
    
    driver.close();
    

}
}