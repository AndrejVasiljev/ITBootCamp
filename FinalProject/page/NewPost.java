package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewPost {
	// praksa stavljanja adresa web el. u promenljive radi preglednijeg koda
	public static final String URL = "http://localhost/izlet/HomePage.php#";

	private static final String NEWPOST = "//a[contains(text(),'Make a post')]";
	private static final String PNAME = "//input[@placeholder='Naziv']";
	private static final String PLOCATION = "//input[@placeholder='Lokacija']";
	private static final String PTRANSPORT = "//select[@name='transport']";
	private static final String PDESCRIPTION = "//textarea[@placeholder='Opis']";
	private static final String POST = "//input[@value='Post']";
	private static final String POSTS = "posts";
	private static final String MORE = "fa-ellipsis-v";
	private static final String EDIT = "fa-edit";
	private static final String DELETE = "fa-trash-alt";
	// Changing post details
	private static final String ENAME = "//input[@id='title']";
	private static final String ELOCATION = "//input[@id='location']";
	private static final String ETRANSPORT = "//div[@class='popupEdit']//select[@name='transport']";
	private static final String EDISCRIPTION = "//textarea[@id='description']";
	private static final String EPOST = "//div[@class='popupEdit']//input[@value='Post']";

	// New post
	// "Catching" web element//
	public static WebElement getMPost(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(NEWPOST));
		return wb;
	}

	// Clicking on recently selected web element//
	public static void clickMPost(WebDriver driver) {
		getMPost(driver).click();
	}

	// Post name
	public static WebElement getName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PNAME));
		return wb;
	}

	public static void clickName(WebDriver driver) {
		getName(driver).click();
	}

	// Ispisivanje odredjenih stringova u prethodno dohvaceno i izabrano polje
	public static void sendKeysName(WebDriver driver, String str) {
		getName(driver).sendKeys(str);
	}

	// Post location
	public static WebElement getLocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PLOCATION));
		return wb;
	}

	public static void clickLocation(WebDriver driver) {
		getLocation(driver).click();
	}

	public static void sendKeysLocation(WebDriver driver, String str) {
		getLocation(driver).sendKeys(str);
	}

	// Selecting way of transport
	public static void selectTransport(WebDriver driver, String str) {
		Select transport = new Select(driver.findElement(By.xpath(PTRANSPORT)));
		transport.selectByVisibleText(str);

	}

	// Description of post
	public static WebElement getDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(PDESCRIPTION));
		return wb;
	}

	public static void clickDescription(WebDriver driver) {
		getDescription(driver).click();
	}

	public static void sendKeysOpis(WebDriver driver, String str) {
		getDescription(driver).sendKeys(str);
	}

	// Post button
	public static WebElement getPostB(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(POST));
		return wb;
	}

	public static void clickPostB(WebDriver driver) {
		getPostB(driver).click();
	}

	// More button
	public static WebElement getMore(WebDriver driver, int i) {
		List<WebElement> list = driver.findElements(By.className(POSTS));
		WebElement wb = list.get(i).findElement(By.className(MORE));
		return wb;
	}

	public static void clickMore(WebDriver driver, int i) {
		getMore(driver, i).click();
	}

	// Delete a post
	public static WebElement getDelete(WebDriver driver) {
		WebElement wb = driver.findElement(By.className(DELETE));
		return wb;
	}

	public static void clickDelete(WebDriver driver) {
		getDelete(driver).click();
	}

	// Edit a Post //
	public static WebElement getEdit(WebDriver driver, int i) {
		List<WebElement> list = driver.findElements(By.className(EDIT));
		WebElement wb = list.get(i);
		return wb;
	}

	public static void clickEdit(WebDriver driver, int i) {
		getEdit(driver, i).click();
	}

	// Edit Naziv in specific post
	public static WebElement getEName(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(ENAME));
		return wb;
	}

	public static void clickEName(WebDriver driver) {
		getEName(driver).click();

	}

	public static void sendKeysEName(WebDriver driver, String str) {
		getEName(driver).clear();
		getEName(driver).sendKeys(str);
	}

	// Edit Lokacija in specific post
	public static WebElement getELocation(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(ELOCATION));
		return wb;
	}

	public static void clickELocation(WebDriver driver) {
		getELocation(driver).click();
	}

	public static void sendKeysELocation(WebDriver driver, String str) {
		getELocation(driver).clear();
		getELocation(driver).sendKeys(str);
	}

	// Edit - transport
	public static void selectEPTransport(WebDriver driver, String str) {
		Select prevoz = new Select(driver.findElement(By.xpath(ETRANSPORT)));
		prevoz.selectByVisibleText(str);

	}

	// Edit Opis in specific post
	public static WebElement getEDescription(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EDISCRIPTION));
		return wb;
	}

	public static void clickEDescription(WebDriver driver) {
		getEDescription(driver).click();
	}

	public static void sendKeysEOpis(WebDriver driver, String str) {
		getEDescription(driver).clear();
		getEDescription(driver).sendKeys(str);
	}

	// Post button
	public static WebElement getEPostButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(EPOST));
		return wb;
	}

	public static void clickEPostButton(WebDriver driver) {
		getEPostButton(driver).click();
	}

	// Open page
	public static void openPage(WebDriver driver) {
		driver.get(URL);
	}

	// Navigate to page
	public static void navigateTo(WebDriver driver) {
		driver.navigate().to(URL);
	}
}
