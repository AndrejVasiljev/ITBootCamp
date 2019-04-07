package page;

import org.openqa.selenium.WebDriver;

public class DeleteP {
	// Deleting k posts 
	public static void deleteP(WebDriver driver, int i, int k) {
		for (int j = 0; j <= k; j++) {
			NewPost.clickMore(driver, i);
			NewPost.clickDelete(driver);
		}
	}
}
