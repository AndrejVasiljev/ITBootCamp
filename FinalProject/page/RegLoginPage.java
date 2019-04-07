package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegLoginPage {
	public static final String 	URL	= "http://localhost/izlet/index.php";
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String USERNAME = "//form[@action='processregister.php']//input[@name='username']";
	private static final String EMAIL_ADRESS = "//input[@name='email']";
	private static final String PASSWORD = "//form[@action='processregister.php']//input[@name='password']";
	private static final String REGISTRATION = "//input[@value='Register']";
	private static final String LOGIN_USERNAME = "//input[@placeholder='username']";
	private static final String LOGIN_PASS = "//input[@placeholder='password']";
	private static final String LOGIN_BUTTON = "//input[@value='Log in']";

	// First Name
	public static WebElement getFirstName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(FIRSTNAME));
		return wb;
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void sendKeysFirstName(WebDriver driver, String str) {
		getFirstName(driver).sendKeys(str);
	}

	// Last Name
	public static WebElement getLastName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LASTNAME));
		return wb;
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void sendKeysLastName(WebDriver driver, String str) {
		getLastName(driver).sendKeys(str);
	}

	// Username
	public static WebElement getRegisterUsername(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(USERNAME));
		return wb;
	}

	public static void clickRegisterUsername(WebDriver driver) {
		getRegisterUsername(driver).click();
	}

	public static void sendKeysRegisterUsername(WebDriver driver, String str) {
		getRegisterUsername(driver).sendKeys(str);
	}

	// Email Address
	public static WebElement getEmail(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EMAIL_ADRESS));
		return wb;
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void sendKeysEmail(WebDriver driver, String str) {
		getEmail(driver).sendKeys(str);
	}

	// Password
	public static WebElement getRegisterPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PASSWORD));
		return wb;
	}

	public static void clickRegisterPassword(WebDriver driver) {
		getRegisterPassword(driver).click();
	}

	public static void sendKeysRegisterPassword(WebDriver driver, String str) {
		getRegisterPassword(driver).sendKeys(str);
	}

	// Register Button
	public static WebElement getRegister(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(REGISTRATION));
		return wb;
	}

	public static void clickRegister(WebDriver driver) {
		getRegister(driver).click();
	}

	// Log in Username
	public static WebElement getLoginUsername(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_USERNAME));
		return wb;
	}

	public static void clickLoginUsername(WebDriver driver) {
		getLoginUsername(driver).click();
	}

	public static void sendKeysLoginUsername(WebDriver driver, String str) {
		getLoginUsername(driver).sendKeys(str);
	}

	// Log in Password
	public static WebElement getLoginPassword(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_PASS));
		return wb;
	}

	public static void clickLoginPassword(WebDriver driver) {
		getLoginPassword(driver).click();
	}

	public static void sendKeysLoginPassword(WebDriver driver, String str) {
		getLoginPassword(driver).sendKeys(str);
	}

	// Log in Button
	public static WebElement getLogInButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(LOGIN_BUTTON));
		return wb;
	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	// Open the Page
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}

	// Navigate to the Page
	public static void navigateToRegLoginPage(WebDriver driver) {
		driver.navigate().to(URL);
	}

}

