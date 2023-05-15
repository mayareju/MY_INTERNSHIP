package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AgentPage;


public class StepPage {
	public WebDriver driver;
	public AgentPage agent;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		driver=new ChromeDriver();
		agent=new AgentPage(driver);
		
	}

	@When("user open url {string}")
	public void user_open_url(String url) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	}

	@When("User enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) throws InterruptedException {
		Thread.sleep(2000);
		agent.userEmail(Email);
		Thread.sleep(2000);
	    agent.userPassword(Password);
	}

	@When("click Login button")
	public void click_login_button() throws InterruptedException {
		Thread.sleep(2000);
		agent.clickLogin();
	  
	}

	@When("user click on Hotels Link")
	public void user_click_on_hotels_link() throws InterruptedException {
		Thread.sleep(2000);
	   agent.clickHotels();
	}

	@Then("agent page url should contain {string}")
	public void agent_page_url_should_contain(String title) throws InterruptedException {
		Thread.sleep(2000);
		if(driver.getCurrentUrl().contains(title)){
	    	Assert.assertTrue(true);}
		else {
			Assert.assertTrue(false);
		}
	}

	@When("user can enter {string} on city name field")
	public void user_can_enter_on_city_name_field(String cityname) throws InterruptedException {
		Thread.sleep(5000);
		agent.clickCityName();
		Thread.sleep(5000);
		agent.strCityName(cityname);
		Thread.sleep(8000);
		agent.selectOption();
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		Thread.sleep(2000);
	    agent.clickSearch();
	}

	@Then("agent page title should contain {string}")
	public void agent_page_title_should_contain(String title) throws InterruptedException {
		Thread.sleep(3000);
		String actual = driver.getTitle();
		Assert.assertEquals(title, actual);
	}

}
