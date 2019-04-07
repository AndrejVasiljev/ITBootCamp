package test;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.RegLoginPage;
import utils.PathClass;

public class RegistrationTest {
	// 1. Manual registration
	public static void registerNewUser(WebDriver driver, String firstName, String lastName, String userName,
			String email, String password) throws IOException {
		// First Name
		RegLoginPage.clickFirstName(driver);
		RegLoginPage.sendKeysFirstName(driver, firstName);
		// Last Name
		RegLoginPage.clickLastName(driver);
		RegLoginPage.sendKeysLastName(driver, lastName);
		// User Name
		RegLoginPage.clickRegisterUsername(driver);
		RegLoginPage.sendKeysRegisterUsername(driver, userName);
		// Email
		RegLoginPage.clickEmail(driver);
		RegLoginPage.sendKeysEmail(driver, email);
		// Password
		RegLoginPage.clickRegisterPassword(driver);
		RegLoginPage.sendKeysRegisterPassword(driver, password);
		// Register Button
		RegLoginPage.clickRegister(driver);

		LogInTest.LogInMain(driver, userName, password);
		// Tell us if user with username is registrated or not
		try {
			if (driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php"))
				System.out.println("User " + userName + " is registered");
			else
				System.out.println("User " + userName + " is not registered");

		} catch (Exception E) {
		}

	}

	// 2.Registrating users with data from excel sheet
	public static void RegisterUserExcel(WebDriver driver) throws IOException, Exception {
		utils.ExcelUtills.setExcelFile(PathClass.FILE_PATH + PathClass.FILE_NAME, "Registracija");
		for (int i = 1; i <= utils.ExcelUtills.getWSheet().getLastRowNum(); i++) {
			page.RegLoginPage.clickFirstName(driver);
			page.RegLoginPage.sendKeysFirstName(driver, utils.ExcelUtills.getCell(i, 0));

			page.RegLoginPage.clickLastName(driver);
			page.RegLoginPage.sendKeysLastName(driver, utils.ExcelUtills.getCell(i, 1));

			page.RegLoginPage.clickRegisterUsername(driver);
			page.RegLoginPage.sendKeysRegisterUsername(driver, utils.ExcelUtills.getCell(i, 2));

			page.RegLoginPage.clickEmail(driver);
			page.RegLoginPage.sendKeysEmail(driver, utils.ExcelUtills.getCell(i, 3));

			page.RegLoginPage.clickRegisterPassword(driver);
			page.RegLoginPage.sendKeysRegisterPassword(driver, utils.ExcelUtills.getCell(i, 4));

			page.RegLoginPage.clickRegister(driver);

			LogInTest.LogInUserExcel(driver, i);
			// It will print username of an user and tell us if it's successfully registered
			// or not
			try {
				if (driver.getCurrentUrl().equals("http://localhost/izlet/dashboard.php"))
					System.out.println("User " + utils.ExcelUtills.getCell(i, 2) + " is registered");
				else
					System.out.println("User " + utils.ExcelUtills.getCell(i, 2) + " is not registered");

			} catch (Exception E) {
			}
			HomePage.clickLogOut(driver);
		}
	}

	public static void registerNewUserScan(WebDriver driver) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite FirstName: ");
		String firstName = sc.nextLine();
		
		// First Name
		RegLoginPage.clickFirstName(driver);
		RegLoginPage.sendKeysFirstName(driver, firstName);
		
		System.out.println("Unesite LastName: ");
		String lastName = sc.nextLine();
		// Last Name
		RegLoginPage.clickLastName(driver);
		RegLoginPage.sendKeysLastName(driver, lastName);
		
		System.out.println("Unesite UserName: ");
		String userName = sc.nextLine();
		// User Name
		RegLoginPage.clickRegisterUsername(driver);
		RegLoginPage.sendKeysRegisterUsername(driver, userName);
		
		System.out.println("Unesite Email: ");
		String email = sc.nextLine();
		// Email
		RegLoginPage.clickEmail(driver);
		RegLoginPage.sendKeysEmail(driver, email);
		
		System.out.println("Unesite Password: ");
		String password = sc.nextLine();
		// Password
		RegLoginPage.clickRegisterPassword(driver);
		RegLoginPage.sendKeysRegisterPassword(driver, password);
		
		// Register Button
		RegLoginPage.clickRegister(driver);
		
		
	}
}
