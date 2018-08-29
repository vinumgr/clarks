package com.qa.globals;

import org.testng.Reporter;

import com.qa.datautitlities.Excelutility;
import com.qa.pageobjects.AccountPage;
import com.qa.pageobjects.LoginPageobjects;

public class CommonMethods extends Globals{
	public static void loginViaEmail() throws Exception{
		LoginPageobjects lgin = new LoginPageobjects(driver);
		AccountPage account = new AccountPage(driver);	
		 Thread.sleep(10000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.loginIcon); 
		lgin.loginIcon.click();
		Reporter.log("Email : Login Icon clicked", true);
		//lgin.loginButton.click();
		//Reporter.log("Email :Login button clicked", true);
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		Reporter.log("Email :Email entered", true);
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Reporter.log("Email :Password entered", true);
		 Thread.sleep(1000);
		//WebDriverExplicitWait(driver, 10, "Xpath", Constants.signInButton);
		lgin.signInButton.click();
		
	}
	
	public static void loginIntoEmail() throws Exception{
		LoginPageobjects lgin = new LoginPageobjects(driver);
		Thread.sleep(10000);
		lgin.loginIcon.click();
		//lgin.loginButton.click();
		log(Excelutility.excelData(2, 0, 0));
		lgin.loginInputId.sendKeys(Excelutility.excelData(2, 0, 0));
		log(Excelutility.excelData(2, 1, 0));
		lgin.loginInputPassword.sendKeys(Excelutility.excelData(2, 1, 0));
		Thread.sleep(1000);
		lgin.signInButton.click();
		Thread.sleep(1000);
		//lgin.loginIcon.click();
	}

}

