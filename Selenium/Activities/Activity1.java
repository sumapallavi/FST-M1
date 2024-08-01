package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity1 
{
	public static void main(String[] args) 
	{
		//setup geko driver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the firefox browser
		WebDriver driver=new FirefoxDriver();
		
		//open the page
		driver.get("https://v1.training-support.net");
		//print the title of the page
		System.out.println("Home page title:" +driver.getTitle());
		// Find About Us link using id and click it
        driver.findElement(By.id("about-link")).click();
        // Print the title of the new page
        System.out.println("About page title: " + driver.getTitle());

        // Close the browser
		
		driver.quit();

	}


}
