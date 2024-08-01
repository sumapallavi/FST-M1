package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity17 {

	public static void main(String[] args) 
	{
		// Set up Firefox driver
	    WebDriverManager.firefoxdriver().setup();
	    // Create a new instance of the Firefox driver
	    WebDriver driver=new FirefoxDriver();
	    //open page
	    driver.get("https://v1.training-support.net/selenium/selects");
	    //print the title of the page
	    System.out.println("Title of the page :" + driver.getTitle());
	    //Find the dropdown
	    WebElement dropdown=driver.findElement(By.id("single-select"));
	    //pass the Pass the WebElement to the Select object
	    Select singleSelect = new Select(dropdown);
	    //
	    
	    
	   
		

	}

}
