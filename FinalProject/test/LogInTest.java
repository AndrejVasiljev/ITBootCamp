package test;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.RegLoginPage;
import utils.ExcelUtills;
import utils.PathClass;

public class LogInTest {

	// 1. Inputing data manually to login //
	public static void LogInMain(WebDriver driver, String username, String password) throws IOException {
		// Username
		RegLoginPage.clickLoginUsername(driver);
		RegLoginPage.sendKeysLoginUsername(driver, username);
		// Password
		RegLoginPage.clickLoginPassword(driver);
		RegLoginPage.sendKeysLoginPassword(driver, password);
		// Log in button
		RegLoginPage.clickLogInButton(driver);

	}

	// 2. Login using excel (i-row, 2 an4 columns) //
	public static void LogInUserExcel(WebDriver driver, int i) throws Exception {
		String data;
		// Setting excel file
		ExcelUtills.setExcelFile(PathClass.FILE_PATH + PathClass.FILE_NAME, PathClass.SHEET1);
		// Username
		data = ExcelUtills.getCell(i, 2);
		RegLoginPage.clickLoginUsername(driver);
		RegLoginPage.sendKeysLoginUsername(driver, data);
		// Password
		data = ExcelUtills.getCell(i, 4);
		RegLoginPage.clickLoginPassword(driver);
		RegLoginPage.sendKeysLoginPassword(driver, data);
		// Log in button
		RegLoginPage.clickLogInButton(driver);

	}

	/*
	 * if user is logged in successfully, logs out and log in with new user, If log
	 * in is not successful, it tries to log in with different credentials from
	 * excel sheet
	 */
	public static void LogIn(WebDriver driver) throws Exception {
		// Setting excel file
		ExcelUtills.setExcelFile(PathClass.FILE_PATH + PathClass.FILE_NAME, PathClass.SHEETL);
		for (int i = 1; i < ExcelUtills.getWSheet().getLastRowNum() + 1; i++) {
			LogInUserExcel(driver, i);
			if (driver.getCurrentUrl().equals(HomePage.HOME_URL)) {
				HomePage.clickLogOut(driver);
			} else
				RegLoginPage.navigateToRegLoginPage(driver);

		}
	}

	public static void LogInScanner(WebDriver driver) throws IOException {
		// Username
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite UserName: ");
		String userName = sc.nextLine();
		RegLoginPage.clickLoginUsername(driver);
		RegLoginPage.sendKeysLoginUsername(driver, userName);
		
		System.out.println("Unesite password: ");
		String password = sc.nextLine();
		// Password
		RegLoginPage.clickLoginPassword(driver);
		RegLoginPage.sendKeysLoginPassword(driver, password);
		
		// Log in button
		RegLoginPage.clickLogInButton(driver);
	}
}