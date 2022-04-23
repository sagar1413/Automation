package POM_Page_Factory_Practise;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
	
	// 3 Step
	
	//1)  Declaration - you have to declare your web element
	
	//2) Initialization - you have to initialize your webelement using page factory -> initelements
	
	
	//3) Usage - you have to write down methods for every indivisual verification point
	
	
	
	/*
	 * Declaration
	 * object repository
	 * @FindBy (xpath="value") private WebElement webelement name
	 */
	
	@FindBys ({@FindBy (xpath="//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li")}) private List<WebElement> footerlinks;
	@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy (xpath="//img[@alt='Facebook']") private WebElement fblogo;
	@FindBy (xpath="//a[@aria-label='Already have an account?']") private WebElement alreadyacc;
	@FindBy (name="firstname") private WebElement firstname;
	@FindBy (name="lastname") private WebElement sirname;
	@FindBy (name="reg_email__") private WebElement mobile_email;
	@FindBy (name="reg_passwd__") private WebElement password;
	@FindBy (name="birthday_day") private WebElement birthday;
	@FindBy (name="birthday_month") private WebElement birthmonth;
	@FindBy (name="birthday_year") private WebElement birthyear;
	@FindBy (xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy (xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy (name="websubmit") private WebElement submit;
	
	// initialization - you have to create class constructor==> pagefactory.initelements
	
	public RegistrationPage(WebDriver drriver) {
		
		PageFactory.initElements(drriver, this);
	}
	
	//usage== Methods==testing methods// Assertions + actions
	//rules-->> Method Name-->> action->Domain Name->Page->Element=>> NomenClature--> camel case
	
	
	//click on signup button
	
	public void verifyFacebookSignupFooterLinks()
	{
	Assert.assertEquals(footerlinks.size(), 30);
	Reporter.log("verifyFacebookSignupFooterLinks",true);
	}
	
	public void clickFacebookSignupLink()
	{
		signuplink.click();
	}
	
	// verify facebook logo
	
	public void verifyFacebookRegistrationPageFblogo()
	{
		Assert.assertTrue(fblogo.isDisplayed(), "FB Logo is not Displayed");
	}
	
	// verify already having account link

	
	public void verifyFacebookRegistrationPageAlreadyAccount()
	{
		Assert.assertTrue(alreadyacc.isDisplayed(), "FB Already having Account is not Displayed");
	}
	
	//set firstname
	
	public void setFacebookRegistrationPageFirstName()
	{
		firstname.sendKeys("Sagar");
	}
	
	//set lastname
	
		public void setFacebookRegistrationPagelastName()
		{
			sirname.sendKeys("ghodke");
		}
		
	//set mobile/email
		
		public void setFacebookRegistrationPageMobileEmail()
		{
			mobile_email.sendKeys("8698081020");
		}
	
		//set Password
		
		public void setFacebookRegistrationPagePassword()
		{
			password.sendKeys("123434sfsf");
		}
	
		//set birthday
		
		public void setFacebookRegistrationPageBirthday()
		{
			Select day=new Select(birthday);
			day.selectByIndex(13);
			Assert.assertTrue(birthday.isDisplayed());
		}
		
		//set birthmonth
		
		public void setFacebookRegistrationPageBirthMonth()
		{
			Select month=new Select(birthmonth);
			month.selectByVisibleText("Mar");
			Assert.assertTrue(birthday.isDisplayed());
			Assert.assertEquals(month.getFirstSelectedOption().getText(),"Mar" );
		}
		
		//set birthyear
		
		public void setFacebookRegistrationPageBirthdayYear()
		{
			Select year=new Select(birthyear);
			year.selectByVisibleText("1994");
		}
		
		public void setFacebookRegistrationPageGender(String gender)
		{
			if (gender.equalsIgnoreCase("male"))
			{
				gender_male.click();
			}
			else if(gender.equalsIgnoreCase("female"))
			{
				gender_female.click();
			}
			else
			{
				System.out.println("Wrong Gender Selected");
			}
		}
		
		public void setFacebookRegistrationPageSignUpButton()
		{
			Assert.assertTrue(submit.isDisplayed(), null);
		}

}
