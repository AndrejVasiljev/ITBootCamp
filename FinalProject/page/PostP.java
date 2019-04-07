package page;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import utils.ExcelUtills;
import utils.PathClass;

public class PostP {
	// makes new posts with data from excel sheet
	public static void NewPostExcel(WebDriver driver, int k) throws IOException, InterruptedException {
		ExcelUtills.setExcelFile(PathClass.FILE_PATH + PathClass.FILE_NAME, PathClass.SHEET2);
		// number of posts that we want to make
		for (int i = 1; i <= k; i++) {
			NewPost.clickMPost(driver);

			NewPost.clickName(driver);
			NewPost.sendKeysName(driver, utils.ExcelUtills.getCell(i, 1));

			NewPost.clickLocation(driver);
			NewPost.sendKeysLocation(driver, utils.ExcelUtills.getCell(i, 2));

			NewPost.clickDescription(driver);
			NewPost.sendKeysOpis(driver, utils.ExcelUtills.getCell(i, 0));

			NewPost.clickPostB(driver);
			Thread.sleep(2000);

		}
	}

	// new post with manually imputed data
	public static void NewPost(WebDriver driver, String name, String location, String PTransport, String description)
			throws IOException, InterruptedException {

		NewPost.clickMPost(driver);

		NewPost.clickName(driver);
		NewPost.sendKeysName(driver, name);

		NewPost.clickLocation(driver);
		NewPost.sendKeysLocation(driver, location);

		NewPost.selectTransport(driver, PTransport);

		NewPost.clickDescription(driver);
		NewPost.sendKeysOpis(driver, description);

		NewPost.clickPostB(driver);
		Thread.sleep(2000);

	}

	public static void NewPostScan(WebDriver driver)throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		NewPost.clickMPost(driver);
		
		System.out.println("Unesite Ime posta: ");
		String name = sc.nextLine();
		NewPost.clickName(driver);
		NewPost.sendKeysName(driver, name);
		
		System.out.println("Unesite lokaciju posta: ");
		String location = sc.nextLine();
		NewPost.clickLocation(driver);
		NewPost.sendKeysLocation(driver, location);
		
		System.out.println("Unesite transport posta: ");
		String PTransport = sc.nextLine();
		NewPost.selectTransport(driver, PTransport);
		
		System.out.println("Unesite opis posta: ");
		String description = sc.nextLine();
		NewPost.clickDescription(driver);
		NewPost.sendKeysOpis(driver, description);

		NewPost.clickPostB(driver);
		Thread.sleep(2000);
	}
}
