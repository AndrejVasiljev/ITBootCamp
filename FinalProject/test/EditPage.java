package test;

import org.openqa.selenium.WebDriver;

import page.NewPost;

public class EditPage {
	public static void editPost(WebDriver driver, int i, String name, String location, String pTransport,
			String description) {
		// Click on more options buttons ...
		NewPost.clickMore(driver, 0);

		// Edit post
		NewPost.clickEdit(driver, 0);

		// Edit name of post
		NewPost.clickEName(driver);
		NewPost.sendKeysEName(driver, name);

		// Edit Location
		NewPost.clickELocation(driver);
		NewPost.sendKeysELocation(driver, location);

		// Chose Transport
		NewPost.selectEPTransport(driver, pTransport);

		// Description
		NewPost.clickEDescription(driver);
		NewPost.sendKeysEOpis(driver, description);

		// Clicking on edited post confirm button
		NewPost.clickEPostButton(driver);
	}
}
