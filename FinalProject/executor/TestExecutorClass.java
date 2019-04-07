package executor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.DeleteP;
import page.PostP;
import page.RegLoginPage;
import test.EditPage;
import test.LogInTest;
import test.RegistrationTest;

public class TestExecutorClass {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		RegLoginPage.openPage(driver);
		try {
			//RegistrationTest.registerNewUserScan(driver);
//			RegistrationTest.registerNewUser(driver, "s", "s", "s", "s@s", "s");
//			PostP.NewPostExcel(driver, 20);
//			PostP.NewPost(driver, "Kalis", "Bg","Car","lepiBg");
//			PostP.NewPost(driver, "Kalis", "Bg","Car","lepiBg");
			
			LogInTest.LogInScanner(driver);

//			DeleteP.deleteP(driver, 0,2);
//			EditPage.editPost(driver, 0, "ml", "dsd", "Car", "opis");
			PostP.NewPostScan(driver);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
