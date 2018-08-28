package com.qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.globals.Globals;

public class AddToCartObjects extends Globals {

	public AddToCartObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Define the page Objects

	@FindBy(xpath = ".//*[@id='Mens']/span[1]")
	public WebElement mens;
	
	@FindBy(xpath = "/html/body/header/div[3]/div/div[3]/div/ul/li[3]/ul/li[1]/a/span")
	//@FindBy(xpath = "//div[@class='submenu-content-container']")
	public WebElement mensBlackShoes;
	
	
	@FindBy(xpath = ".//*[@id='productsCatalog']/li[1]/div/div[2]/a/img")
	public WebElement firstBlackShoe;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[1]")
	public WebElement firstSizeBox;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[2]")
	public WebElement SecondSizeBox;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[3]")
	public WebElement thirdSizeBox;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[4]")
	public WebElement fourthSizeBox;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[5]")
	public WebElement fifthSizeBox;
	
	@FindBy(xpath = ".//*[@id='content']/div[5]/div[1]/div[1]/div/div[4]/div[1]/div[2]/div[1]/div/span[6]")
	public WebElement sixthSizeBox;
	
	@FindBy(xpath = ".//*[@id='pdp-add-tocart-btn']")
	public WebElement addTocartButtonPDP;
	
	@FindBy(xpath = "//a[@title='SHOPPING BAG']")
	public WebElement addTocartIconPDP;
	
	@FindBy(xpath = ".//*[@id='items_minicart_overlay_1']/div[@class='product-info col-sm-8 col-md-8']/a[1]")
	public WebElement removeMinicartSymbol;
	
	@FindBy(xpath = "//button[@class='btn remove-item cart-pop-btn']")
	public WebElement removeMinicartButton;

	/*@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'All New')]")
	public WebElement allNew;

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Dresses & Jumpsuits')]")
	public WebElement dressAndJumpsuits;

	@FindBy(xpath = "//a[@id='jumpsuit']")
	public WebElement jumpsuits;

	@FindBy(xpath = "//*[@id='maxi']")
	public WebElement maxi;

	@FindBy(xpath = "//*[@id='productsCatalog']/li[2]/div/div[2]/a ")
	public WebElement PLP;

	@FindBy(xpath = "//*[@id='plus']/i")
	public WebElement increaseItem;

	
	 * @FindBy(xpath="//div[starts-with(@class, 'product-')]") public WebElement
	 * PLPTwo;
	 

	@FindBy(xpath = "//*[@id='productsCatalog']/li[1]/div/div[2]/a")
	public WebElement PLPTwo;

	// @FindBy(xpath="//span[contains(text(),'XS')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[1]")
	public WebElement selectSizeXS;

	// @FindBy(xpath="//span[contains(text(),'S')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[2]")
	public WebElement selectSizeS;

	// @FindBy(xpath="//span[contains(text(),'M')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[3]")
	public WebElement selectSizeM;

	// @FindBy(xpath="//span[contains(text(),'L')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[4]")
	public WebElement selectSizeL;

	// @FindBy(xpath="//span[contains(text(),'XL')]")
	@FindBy(xpath = "//*[@id='pdp_productdetail']/div[2]/div[1]/div[2]/span[5]")
	public WebElement selectSizeXL;

	@FindBy(xpath = "//a[@id='midi']")
	public WebElement madi;

	@FindBy(xpath = "//a[@id='mini']")
	public WebElement mani;

	@FindBy(xpath = "//a[@id='skater']")
	public WebElement skaters;

	@FindBy(xpath = "//a[@id='shift']")
	public WebElement shifts;

	@FindBy(xpath = "//a[@id='bodycon']")
	public WebElement bodycon;

	// Adding to cart from PDP
	@FindBy(xpath = "//button[@id='pdp-add-tocart-btn']")
	public WebElement addTocartButton;

	@FindBy(xpath = "//*[@id='page']/header/div/div/div/div[4]/div/div[1]/div[1]")
	public WebElement cartIcon_PDP;

	@FindBy(xpath = "//*[@id=\"mini-cart-drobdwon\"]/div[4]/div[4]/div[1]/a")
	public WebElement viewCartButton_PDP;

	// @FindBy(xpath="//*[@id=\"items_minicart_overlay_1\"]/div[2]/a")
	@FindBy(xpath = "//a[@title='Remove items']")
	public WebElement removeFromMiniCartSymbol;

	@FindBy(xpath = "//button[@class='btn remove-item cart-pop-btn']")
	public WebElement removeFromMiniCartButton;

	//@FindBy(xpath = "//*[@id='items_overlay_1']/div[6]/a")
	@FindBy(xpath = "//a[@class='fa fa-times show-alert-cartremoval']")
	public WebElement removeFromCartSymbol;

	@FindBy(xpath = "//button[@class='btn remove-item cart-pop-btn']")
	public WebElement removeFromCartButton;

	// Adding to cart from Quick View

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Tops & Tees')]")
	public WebElement topsAnTees;

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Skirts & Shorts')]")
	public WebElement skirtsAndShorts;

	@FindBy(xpath = "//*[@id='productsCatalog']/li[1]/div/div[2]/a")
	public WebElement skirtsPLP;

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Trousers & Leggings')]")
	public WebElement trousersAndLeggings;

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Jeans')]")
	public WebElement jeans;

	@FindBy(xpath = "//h3[@class='widgettitle'][contains(text(),'Jackets & Sweaters')]")
	public WebElement jacketsAndSweaters;

	@FindBy(xpath = "//span[contains(text(),'Accessories')]")
	public WebElement accessories;
	
	@FindBy(xpath = "//div[@class='wishlistadded']")
	public WebElement removeMiniCartMsg;
	
	@FindBy(xpath = "")
	public WebElement removeCartMsg;*/

	// Size Handling

	/*public void PDPsizeSelect() {

		if (firstBlackShoe.isEnabled()) {

			firstBlackShoe.click();
			System.out.println("Extra Small size is selected");

		}

		else if (SecondSizeBox.isEnabled()) {
			SecondSizeBox.click();
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
	}

	public void QuickviewSelectsize() {

		if (selectSizeXS.isEnabled()) {

			selectSizeXS.click();
			System.out.println("Extra Small size is selected");

		}

		else if (selectSizeS.isEnabled()) {
			selectSizeS.click();
			System.out.println("Small size is selected");

		} else if (selectSizeM.isEnabled()) {
			selectSizeM.click();
			System.out.println("Medium size is selected");
		} else if (selectSizeL.isEnabled()) {
			selectSizeL.click();
			System.out.println("Large size is selected");
		}

		else {
			System.out.println("Product is Out of stock");
		}

	}

	
	 * public void PDPsizeSelect(){
	 * 
	 * if( selectsizePdpsmall.isEnabled()) {
	 * 
	 * selectsizePdpsmall.click(); System.out.println("Small size is selected");
	 * 
	 * }
	 * 
	 * else if(selectsizePdpmedium.isEnabled()) { selectsizePdpmedium.click();
	 * System.out.println("Medium size is selected");
	 * 
	 * } else if(selectsizePdplarge.isEnabled()) { selectsizePdplarge.click();
	 * System.out.println("Large size is selected"); } else
	 * if(selectsizePdpxl.isEnabled()) { selectsizePdpxl.click();
	 * System.out.println("XL size is selected"); } else
	 * if(selectsizePdpxxl.isEnabled()) { selectsizePdpxxl.click();
	 * System.out.println("XXL size is selected"); } else {
	 * System.out.println("Product is Out of stock"); }
	 * 
	 * }
	 */

}
