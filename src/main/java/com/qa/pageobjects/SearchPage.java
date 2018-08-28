package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.globals.Globals;

public class SearchPage extends Globals {
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Define the page Objects

	@FindBy(xpath = "//a[@class='search-icon']")
	public WebElement searchIcon;

	@FindBy(xpath = ".//*[@id='searchInput']")
	public WebElement searchBox;

	@FindBy(xpath = "")
	public WebElement searchButton;
	
	@FindBy(xpath = "//div[@class='unstructuredHeroBanner-cta']/a[1]")
	public WebElement womenUnstructured;
	
	@FindBy(xpath = "//div[@class='unstructuredHeroBanner-cta']/a[2]")
	public WebElement menUnstructured;
	
	@FindBy(xpath = "//div[@class='unstructuredHeroBanner-cta']/a[3]")
	public WebElement discoverMore;
	
	@FindBy(xpath = ".//*[@id='main-menu']//a/img[@title='Clarks']")
	public WebElement ClarksTitle;
	
	@FindBy(xpath = "//a[contains(text(),'SHOP WOMENS')]")
	public WebElement saleShopMens;
	
	@FindBy(xpath = "//a[contains(text(),'SHOP MENS')]")
	public WebElement saleShopWomens;
	
	@FindBy(xpath = "//a[contains(text(),'SHOP BOYS')]")
	public WebElement saleShopBoys;
	
	@FindBy(xpath = "//a[contains(text(),'SHOP GIRLS')]")
	public WebElement saleShopGirls;
	
	@FindBy(xpath = "//img[@alt=' Buy Clarks Cloudsteppers Footwear Range For Men']")
	public WebElement mensCloudStepper;
	
	@FindBy(xpath = "//img[@alt=' Buy Clarks Cloudsteppers Footwear Range For Women']")
	public WebElement womensCloudStepper;
	
	@FindBy(xpath = "//img[@alt='Buy Formal Shoes For Men']")
	public WebElement mensSmart;
	
	/*@FindBy(xpath = "//h1[@class='e_catalogtitle']")
	public WebElement searchResult;

	@FindBy(xpath = "//h1[@class='e_catalogtitle']")
	public WebElement searchResultTwo;

	// Banner object
	@FindBy(xpath = "//*[contains(@class, 'owl-dot active')]")
	public WebElement bannerSlider;

	@FindBy(xpath = "//img[@class='new-in-banner']")
	public WebElement bannerNewIn;

	// @FindBy(xpath="//*[@id='page']/header/div/div/div/div[2]/div[2]/a/img")
	@FindBy(xpath = "//a[@title='Coverstory – https://www.coverstory.co.in']/img")
	public WebElement coverstoryName;

	@FindBy(xpath = "//*[starts-with(@id, 'myCarousel')]")
	public WebElement bannerOne;

	@FindBy(xpath = "//*[contains(@class, 'new-in-banner')]")
	public WebElement bannerTwo;
	
	@FindBy(xpath = "//a[contains(text(),'dresses')]")
	public WebElement bannerThree1;
	
	@FindBy(xpath = "//a[contains(text(),'skirts')]")
	public WebElement bannerThree2;
	
	@FindBy(xpath = "//a[contains(text(),'tops')]")
	public WebElement bannerThree3;
	
	@FindBy(xpath = "//a[contains(text(),'jeans')]")
	public WebElement bannerThree4;
	
	@FindBy(xpath = "//a[contains(text(),'trousers')]")
	public WebElement bannerThree5;
	
	@FindBy(xpath = "//a[contains(text(),'jackets')]")
	public WebElement bannerThree6;
	
	@FindBy(xpath = "//img[@src='//www.coverstory.co.in/media/cms/home/homepage_new/AW_17.png']")
	public WebElement lookBook1;
	
	@FindBy(xpath = "//img[@src='//www.coverstory.co.in/media/cms/home/homepage_new/SS_18.png']")
	public WebElement lookBook2;
	
	@FindBy(xpath = ".//*[@id='content-lookbook-homenew']/div/div/div[1]/a/img")
	public WebElement blog1;
	
	@FindBy(xpath = "//h2[contains(text(),'SPRING SUMMER ' 18')]")
	public WebElement blog2;*/

}