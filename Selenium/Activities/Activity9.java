package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 
{
	public static void main(String[] args) {
        // Setup the driver
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");
        //Find the button and click it
        driver.findElement(By.className("violet")).click();
        //wait for the new elements to appear and print the heading text.
        String headingText=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
        System.out.println("New heading is: " +headingText);
        //wait for the late text to appear in the sub heading
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"),"I'm late!"));
        //Get the text and print it
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println("Late text is: "+lateText);

        // Close the browser
        driver.quit();

}
}
