package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class AgentPage {
	public WebDriver driver;
	
	
	public AgentPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement username;

	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	public void userEmail(String stremail) {
		
		username.sendKeys(stremail);
		
	}
	public void userPassword(String strpass) {
		
		password.sendKeys(strpass);
		
	}
	public void clickLogin() {
		login.click();
		
	}
	@FindBy(linkText="Hotels")
	private WebElement hotels;
	
	@FindBy(xpath="//span[@id='select2-hotels_city-container'and @role='textbox']")
	private WebElement cityname;
	
	@FindBy(xpath="//input[@aria-controls='select2-hotels_city-results']")
	private WebElement sendcityname;
	
	@FindBy(xpath="//span[@class='select2-results']")
	List<WebElement> options;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement search;
	
	public void clickHotels() {
		hotels.click();
		
	}
	public void clickCityName() {
		cityname.click();
		
	}
	
	public void strCityName(String strcity) {
		sendcityname.sendKeys(strcity);
		
	}
	
	public void selectOption() throws InterruptedException {
		for(int i = 0; i<=options.size()-1; i++) {
            if(options.get(i).getText().contains("Sindal")) {
            	Thread.sleep(5000);
            	options.get(i).click();
            	Thread.sleep(3000);
               break;
            }
		}
	}
	public void clickSearch() {
		search.click();
	}
}
