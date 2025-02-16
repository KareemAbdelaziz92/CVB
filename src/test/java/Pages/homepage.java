package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.GUI.WebDriver;

import io.grpc.xds.shaded.io.envoyproxy.pgv.validate.Validate;
import io.qameta.allure.Step;

public class homepage {

	public SHAFT.GUI.WebDriver driver; 
	
	//Constructor 
	public homepage(SHAFT.GUI.WebDriver  driver) {

		this.driver = driver ; 
	}
	//Elements 
	
	private final By toogleEyeButton = By.id("toggle-password-button");
	private final By openAccountButton = By.id("open-account-button");
	private final By forgetUserNameLink = By.id("forget-username-button");
	private final By Home_Button = By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[1]/a");
	private final By rememberMeText = By.xpath("//label[contains(text(),'Remember Me')]");
	private final By set_Env = By.xpath("//button[text()='sit']");
	private final By link_Dashboard = By.xpath("//a[text()='Dashboard']");
	private final By mpin = By.xpath("//P[text()='MPIN']");
	private final By pinValue = By.xpath("//input[@data-input-otp-mse='0']");
	private final By rememberMeCheckBox = By.xpath("//button[@role=\"checkbox\"]");
	private final By mpinSetButton = By.id("mpin-set-submit-button");
	private final By mpinConfirmButton = By.id("mpin-confirm-submit-button");
	private final By subscriptionPopupSkipButton = By.id("subscription-popup-skip-button");
	private final By subscriptionPopupRenewButton = By.id("subscription-popup-renew-button");
    private final By termsAndCondition = By.xpath("//button[contains(text(),'Terms and conditions')]");
    private final By privacyPolicy = By.xpath("//button[contains(text(),'Privacy Policy')]");
    private final By onlineSecurityOverview = By.xpath("//button[contains(text(),'Online Security Overview')]");
}
