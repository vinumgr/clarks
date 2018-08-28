package com.qa.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qa.globals.CommonMethods;
import com.qa.globals.Globals;
import com.qa.pageobjects.SearchPage;

public class TestBannerClick extends Globals {
	@BeforeTest
	public void launchUrl() throws Exception {
		System.setProperty("browser", "Chrome");
		setUp();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		browserNav(QA_ClarksURL);
	}

	// Banner click in home page
	@Test(priority = 0)

	public void BannerOne() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		 CommonMethods.loginViaEmail();
		 Thread.sleep(10000);
		search.womenUnstructured.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Womens-AllStyles/Womens-Unstructured/");
		Reporter.log("womenUnstructured Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		search.menUnstructured.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Mens-AllStyles/Mens-Unstructured/");
		Reporter.log("MenUnstructured Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		search.discoverMore.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/unstructured/");
		Reporter.log("MenUnstructured Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
	}

	// Banner click in home page
	@Test(priority = 1)

	public void SalesBanner() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		//CommonMethods.loginViaEmail();
		List<WebElement> shopWomenList = driver.findElements(By.xpath("//a[contains(text(),'SHOP WOMENS')]"));
		shopWomenList.get(5).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Womens-AllStyles/?discount_percent=10-100");
		Reporter.log("Womens Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		List<WebElement> shopMenList = driver.findElements(By.xpath("//a[contains(text(),'SHOP MENS')]"));
		shopMenList.get(5).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Mens-AllStyles/?discount_percent=10-100");
		Reporter.log("Mens Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		List<WebElement> shopGirlsList = driver.findElements(By.xpath("//a[contains(text(),'SHOP GIRLS')]"));
		shopGirlsList.get(4).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Girls-AllStyles/?discount_percent=10-100");
		Reporter.log("Girls Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		List<WebElement> shopBoysList = driver.findElements(By.xpath("//a[contains(text(),'SHOP BOYS')]"));
		shopBoysList.get(4).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Boys-AllStyles/?discount_percent=10-100");
		Reporter.log("Boys Button clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		
	}

	@Test(priority = 2)

	public void BannerclickWithLoginTwo() throws Exception {
		SearchPage search = new SearchPage(driver);
		// Login with email
		// CommonMethods.loginViaEmail();
		search.mensCloudStepper.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Mens-AllStyles/Men-Cloudsteppers/");
		Reporter.log("mensCloudStepper clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		search.womensCloudStepper.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Womens-AllStyles/Women-Cloudsteppers/");
		Reporter.log("womensCloudStepper clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
		search.mensSmart.click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.clarks.in/Mens-AllStyles/color-Black--Brown/?type=Shoes&sub_type=Lace&upper_material=Leather&sort=nameasc&dir=asc");
		Reporter.log("womensCloudStepper clicked without Login", true);
		Thread.sleep(5000);
		search.ClarksTitle.click();
	}

	

	// Closing the Browser:
	@AfterTest
	public void closeBrowser() {
		browserClose();
	}

}