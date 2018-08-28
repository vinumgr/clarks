package com.qa.testcases;


import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Constants;
import com.qa.globals.Globals;
import com.qa.pageobjects.LoginPageobjects;
import com.qa.pageobjects.SearchPage;

public class TestSearch extends Globals {

	public class TestAccount extends Globals {
		@BeforeTest
		public void launchUrl() throws Exception {
			System.setProperty("browser", "Chrome");
			setUp();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			browserNav(QA_ClarksURL);
		}

		// Search page with Login
		@Test(priority = 0)

		public void search() throws Exception {
			SearchPage search = new SearchPage(driver);
			LoginPageobjects lgin = new LoginPageobjects(driver);
			// Login with email
			//CommonMethods.loginViaEmail();
			//WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon);
			Thread.sleep(3000);
			//Wait(search.searchIcon, 30);
			// Create object of WebDriverWait class
			search.searchIcon.click();
			search.searchBox.click();
			search.searchBox.sendKeys("black shoes");
			search.searchBox.sendKeys(Keys.ENTER);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/catalog/?q=black%20shoes");
			Reporter.log("Black shoe search successful", true);
			search.searchIcon.click();
			search.searchBox.click();
			search.searchBox.sendKeys("casuals");
			search.searchBox.sendKeys(Keys.ENTER);
			Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/catalog/?q=casuals");
			Reporter.log("casuals shoe search successful", true);

		}	

		@AfterTest
		public void closeBrowser() {
			browserClose();
		}

	}
}