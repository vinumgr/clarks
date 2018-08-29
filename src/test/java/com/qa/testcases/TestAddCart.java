package com.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.AddToCartObjects;
import com.qa.pageobjects.AddToWishlist_PO;
import com.qa.pageobjects.LoginPageobjects;
import com.qa.pageobjects.QuickViewObjects;
import com.qa.pageobjects.SearchPage;

public class TestAddCart extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_ClarksURL);
	}

	// Remove from minicart

	@Test(priority = 0)

	public void RemoveFromMinicart() throws Exception {
		boolean outOfStock = false;
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AddToCartObjects addcart = new AddToCartObjects(driver);
		lgin.cookiesButton.click();
		CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		moveToElement(addcart.mens);
		Thread.sleep(5000);
		addcart.mensBlackShoes.click();
		addcart.firstBlackShoe.click();
		if (!elementHasClass(addcart.firstSizeBox, "disabled")) {
			addcart.firstSizeBox.click();
			System.out.println("Extra Small size is selected");

		} else if (!elementHasClass(addcart.SecondSizeBox, "disabled")) {
			addcart.SecondSizeBox.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.thirdSizeBox, "disabled")) {
			addcart.thirdSizeBox.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.fourthSizeBox, "disabled")) {
			addcart.fourthSizeBox.click();
			System.out.println("Large size is selected");

		} else if (!elementHasClass(addcart.fifthSizeBox, "disabled")) {
			addcart.fifthSizeBox.click();
			System.out.println("Large size is selected");
			
		} else if (!elementHasClass(addcart.sixthSizeBox, "disabled")) {
			addcart.sixthSizeBox.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
			 Thread.sleep(3000);
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.addTocartButton);
			addcart.addTocartButtonPDP.click();
			Reporter.log("Item added to mini cart successfully", true);
			Thread.sleep(5000);
			// WebDriverExplicitWait(driver, 10, "Xpath",
			// Constants.cartIcon_PDP);
			moveToElement(addcart.addTocartIconPDP);
			Thread.sleep(3000);
			// WebDriverExplicitWait(driver, 10, "Xpath",
			// Constants.removeFromMiniCartSymbol);
			addcart.removeMinicartSymbol.click();
			addcart.removeMinicartButton.click();
			/*
			 * Assert.assertEquals("",
			 * lgin.loginButton.getAttribute("innerText").trim(),
			 * "Text not matched | ");
			 */
			Reporter.log("Item removed from mini cart successfully", true);
		}

	}

	// Add to cart and Remove from main cart
	@Test(priority = 1)

	public void RemoveFromCart() throws Exception {
		boolean outOfStock = false;
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AddToCartObjects addcart = new AddToCartObjects(driver);
		lgin.cookiesButton.click();
		CommonMethods.loginViaEmail();
		Thread.sleep(5000);
		moveToElement(addcart.mens);
		Thread.sleep(5000);
		addcart.mensBlackShoes.click();
		addcart.firstBlackShoe.click();
		if (!elementHasClass(addcart.firstSizeBox, "disabled")) {
			addcart.firstSizeBox.click();
			System.out.println("Extra Small size is selected");

		} else if (!elementHasClass(addcart.SecondSizeBox, "disabled")) {
			addcart.SecondSizeBox.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.thirdSizeBox, "disabled")) {
			addcart.thirdSizeBox.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.fourthSizeBox, "disabled")) {
			addcart.fourthSizeBox.click();
			System.out.println("Large size is selected");

		} else if (!elementHasClass(addcart.fifthSizeBox, "disabled")) {
			addcart.fifthSizeBox.click();
			System.out.println("Large size is selected");
			
		} else if (!elementHasClass(addcart.sixthSizeBox, "disabled")) {
			addcart.sixthSizeBox.click();
			System.out.println("Large size is selected");
			
		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}
		if (!outOfStock) {
			 Thread.sleep(3000);
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.addTocartButton);
			addcart.addTocartButtonPDP.click();
			Reporter.log("Item added from main cart successfully", true);
			Thread.sleep(7000);
			addcart.addTocartIconPDP.click();
			Thread.sleep(7000);
			addcart.removeFromCartSymbol.click();
			 Thread.sleep(7000);
			WebDriverExplicitWait(driver, 30, "Xpath", Constants.removeFromCartButton);
			addcart.removeFromCartButton.click();
			Reporter.log("Item removed from main cart successfully", true);

		}
	}

	// Add to cart
	@Test(priority = 2)

	public void AddToCart() throws Exception {
		AddToCartObjects addcart = new AddToCartObjects(driver);
		boolean outOfStock = false;
		CommonMethods.loginViaEmail();
		Thread.sleep(7000);
		addcart.cartIcon_PDP.click();
		moveToElement(addcart.removeFromMiniCartSymbol);
	while(addcart.removeFromMiniCartSymbol.isEnabled()){
		addcart.removeFromMiniCartSymbol.click();
		Thread.sleep(3000);
		addcart.removeFromMiniCartButton.click();
		Thread.sleep(7000);
		addcart.cartIcon_PDP.click();
		Thread.sleep(7000);
		}
	}	
		Thread.sleep(5000);
		// WebDriverExplicitWait(driver, 10, "Xpath", Constants.clothing);
		moveToElement(addcart.clothing);
		// Thread.sleep(2000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.dressAndJumpsuits);
		addcart.dressAndJumpsuits.click();
		addcart.jumpsuits.click();
		// scrollBottom();
		// Thread.sleep(6000);
		WebDriverExplicitWait(driver, 10, "Xpath", Constants.PLPTwo);
		addcart.PLPTwo.click();

		// Thread.sleep(5000);
		if (!elementHasClass(addcart.selectSizeXS, "disabled")) {
			addcart.selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeS, "disabled")) {
			addcart.selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (!elementHasClass(addcart.selectSizeM, "disabled")) {
			addcart.selectSizeM.click();
			System.out.println("Medium size is selected");

		} else if (!elementHasClass(addcart.selectSizeL, "disabled")) {
			addcart.selectSizeL.click();
			System.out.println("Large size is selected");

		} else {
			System.out.println("Product is Out of stock");
			outOfStock = true;
		}

		if (!outOfStock) {
			// Thread.sleep(3000);
			// WebDriverExplicitWait(driver, 10, "Xpath",
			// Constants.addTocartButton);
			addcart.addTocartButton.click();
			Thread.sleep(7000);
			// WebDriverExplicitWait(driver, 10, "Xpath",
			// Constants.cartIcon_PDP);
			addcart.cartIcon_PDP.click();
			// Thread.sleep(3000);
			WebDriverExplicitWait(driver, 10, "Xpath", Constants.viewCartButton_PDP);
			addcart.viewCartButton_PDP.click();
			// captureScreen();
		}
	}



	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}