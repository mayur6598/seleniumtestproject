package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.Base;
import pageObject.LoginPageObj;
import pageObject.NaukariPageObj;


public class NaukariStepDef {
	WebDriver driver;
	LoginPageObj lp;
	NaukariPageObj pp;
	WebDriverWait wait=new WebDriverWait(Base.getDriver(),Duration.ofSeconds(15));
	
	@Given("I navigate to Naukri Application")
	public void i_navigate_to_naukri_application() {
		lp=new LoginPageObj(Base.getDriver());
		lp.selectLogin();
		
	}

	@Given("enter the credentials")
	public void enter_the_credentials() {
		lp.enterCredentials("mayur.patil4164@gmail.com", "Mayur@98");
		lp.selectLoginButton();
	}
	@Given("I naviagte to my profile")
	public void i_naviagte_to_my_profile() {
		pp=new NaukariPageObj(Base.getDriver());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("View")));
	    pp.clickViewProfile();
	    //pp.closeChat();
	}
	@Given("Click on carrer profile")
	public void click_on_carrer_profile() throws InterruptedException {
	    pp.clickCarrerProfile();
	    Thread.sleep(3000);
	    pp.editCarrerProfile();
	    boolean res=pp.verifyFormIsPresent();
	    assertTrue(res);
	}
	@When("I click on {string}, select\\/deslect a {string}")
	public void i_click_on_select_deslect_a(String string, String string2) throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("locationSugg")));
		Thread.sleep(4000);
		pp.clickForLocation();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Chennai']/i")));
	    boolean isSelected=pp.isLocationSelected();
	    if(isSelected)
	    {
	    	pp.addLocation();
	    	System.out.print("Added Chennai to location prefernce");
	    }
	    else
	    {
	    	pp.addLocation();
	    	System.out.print("Removed Chennai to location prefernce");
	    }
	    pp.clickLocationLabel();
	}
	@When("clcik on save button")
	public void clcik_on_save_button() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("saveDesiredProfile")));
		pp.clickcpSaveButton();
	}
	@Then("I should see profile updated as {string}")
	public void i_should_see_message(String exp_text) {
	    String msg=pp.verifyProfileUpdateStatus();
	    assertTrue(msg.contains(exp_text));
	}
	@When("Click on {string} in resume")
	public void click_on_in_resume(String string) {
	    pp.clickUpdateLink();
	}

	@When("I click on resume that has to be uploaded")
	public void i_click_on_resume_that_has_to_be_uploaded() throws InterruptedException, AWTException {
	    pp.uploadResume();
	    Thread.sleep(5000);
	}

	@Then("Resume should br uploaded successfully")
	public void resume_should_br_uploaded_successfully() {
	    String name=pp.validateResumeName();
	    assertTrue(name.contains("Mayur_Resume.docx"));
	    
	}
}
