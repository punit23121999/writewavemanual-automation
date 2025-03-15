import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automatethewritewaveappication {

	public static void main(String[] args) throws InterruptedException {
		
		// Initialize the Chrome WebDriver
		WebDriver driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set an implicit wait of 5 seconds for elements to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Navigate to the WriteWave website
		driver.get("https://write-wave-gamma.vercel.app/");

		// Click on the "Register" link using a CSS selector
		driver.findElement(By.cssSelector(".auth-link[href='/register']")).click();

		// Enter a username in the registration form
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("punitwww");

		// Enter a password in the registration form
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("punit@123");

		// Click the "Submit" button to complete registration
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// Wait for 6 seconds (to allow the registration process to complete)
		Thread.sleep(6000);

		// Accept any alert that appears after registration
		driver.switchTo().alert().accept();

		// Click on the "Login" link to navigate to the login page
		driver.findElement(By.cssSelector(".auth-link[href='/login']")).click();

		// Enter a username in the login form
		driver.findElement(By.cssSelector("input[placeholder='username']")).sendKeys("punitwritewave");

		// Enter a password in the login form
		driver.findElement(By.cssSelector("input[placeholder='password']")).sendKeys("punit@23");

		// Click the "Login" button to log in
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		// Click the "Create" button to navigate to the post creation page
		driver.findElement(By.className("create-btn")).click();

		// Enter a title for the post
		driver.findElement(By.cssSelector("input[placeholder='Title']")).sendKeys("punit@23");

		// Enter a summary for the post
		driver.findElement(By.cssSelector("input[placeholder='Summary']")).sendKeys("punit@23");

		// Define the file path for the document to be uploaded
		String filePath = "C:\\Users\\puneet kumar\\Downloads\\WriteWave_Test_Plan.docx";

		// Locate the file upload input element
		WebElement fileupload = driver.findElement(By.xpath("//input[@type='file']"));

		// Initialize a WebDriverWait with a timeout of 5 seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		// Wait until the file upload element is visible, then send the file path to it
		wait.until(ExpectedConditions.visibilityOf(fileupload)).sendKeys(filePath);

		// Click on a specific element (likely to submit the form or trigger an action)
		driver.findElement(By.xpath("//body/div[@id='root']/div/main/div[@class='create-page']/form/div[1]")).click();

		// Wait for 4 seconds (to allow the action to complete)
		Thread.sleep(4000);

		// Navigate back to the previous page
		driver.navigate().back();

		// Cast the driver to JavascriptExecutor to execute JavaScript
		JavascriptExecutor scr = (JavascriptExecutor) driver;

		// Scroll down the page by 2000 pixels
		scr.executeScript("window.scrollBy(0, 2000);");
	}

}
