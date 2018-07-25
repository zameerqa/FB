package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class OR  {
	
	protected static WebDriver driver;
	public OR(WebDriver driver) 
	{
		this.driver = driver;
		
	}

	//Cyclos Bank
	@FindBy(id="cyclosUsername") protected WebElement txtUsername;
	@FindBy(id="cyclosPassword") public WebElement txtPassword;
	@FindBy(xpath="//input[@value='Submit']") public WebElement btnSubmit;
	@FindBy(xpath="//span[text()='Logout']") public WebElement btnLogout;
	@FindBy(linkText="Account(s)") public WebElement lnkaccounts;
	@FindBy(linkText="My profile") public WebElement lnkprofile;
	@FindBy(xpath="//span[text()='Personal']") public WebElement btnPersonal;
	@FindBy(xpath="//span[text()='Profile']") public WebElement lnkProfile2;
	@FindBy(linkText="Payment") public WebElement lnkPayment;
	@FindBy(linkText="Contacts") public WebElement lnkcontacts;
	@FindBy(id="modifyButton") public WebElement btnchange;
	@FindBy(xpath="//input[@fieldname='mobilePhone']") public WebElement txtph;
	@FindBy(id="saveButton") public WebElement btnSave;
		
	
}