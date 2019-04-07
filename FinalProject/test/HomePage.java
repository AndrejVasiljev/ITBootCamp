package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String HOME_URL = "http://localhost/izlet/dashboard.php";
	private static final String LOGOUT = "//a[contains(text(),'Logout')]";

	// Log out Button
	public static WebElement getLogOut(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGOUT));
		return wb;
	}

	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

	// Open Home Page
	public static void openHomePage(WebDriver driver) {
		driver.get(HOME_URL);
	}

	// Navigate to Home page from another page
	public static void navigateToHomePage(WebDriver driver) {
		driver.navigate().to(HOME_URL);
	}
}
