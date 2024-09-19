package Activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {

AndroidDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.google.android.calculator");
		options.setAppActivity("com.android.calculator2.Calculator");
		options.noReset();
		
		//server address
		URL serverURL = new URL("http://localhost:4723/");	
		//driver initialization
		driver = new AndroidDriver(serverURL, options);
		
	}
	@Test
	public void additionTest() {
		// Perform the calculation
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_9")).click();
		driver.findElement(AppiumBy.accessibilityId("plus")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		String result = driver.findElement(AppiumBy.id("result_final")).getText();
		
		//Assertion
		Assert.assertEquals(result, "14");	
	}
	@Test
	public void subtractTest() {
		// Perform the calculation
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("minus")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		String result = driver.findElement(AppiumBy.id("result_final")).getText();
		
		//Assertion
		Assert.assertEquals(result, "5");	
	}
	@Test
	public void multiplyTest() {
		// Perform the calculation
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.accessibilityId("multiply")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_1")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		String result = driver.findElement(AppiumBy.id("result_final")).getText();
		
		//Assertion
		Assert.assertEquals(result, "500");	
	}
	@Test
	public void divideTest() {
		// Perform the calculation
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_0")).click();
		driver.findElement(AppiumBy.accessibilityId("divide")).click();
		driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_2")).click();
		driver.findElement(AppiumBy.accessibilityId("equals")).click();
		
		String result = driver.findElement(AppiumBy.id("result_final")).getText();
		
		//Assertion
		Assert.assertEquals(result, "25");	
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}