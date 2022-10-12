package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegistrationPage {
//Declaration=> webelements
	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;
	@FindBy(xpath="//a[@title='Sign up for Facebook']") private WebElement signuplink;
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(xpath="//input[@type='password']") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;
	@FindBy(name="birthday_month") private WebElement birthmonth;
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
//initialization

public RegistrationPage(WebDriver driver) {
PageFactory.initElements(driver,this);	
}

//usage

public void ClickFacebookSignupLink() {
	signuplink.click();
}
public void VerifyFacebookRegistrationPageFblogo() {
Assert.assertTrue(reg_fblogo.isDisplayed(),"The facebook logo on registration page is not displyed");
}
public void VerifyFacebookRegistrationPageAlreadyAccount() {
Assert.assertTrue(already_acc.isDisplayed(),"The already having an account option on registration page is not displyed");
Assert.assertEquals(already_acc.getText(), "Already have an account?");
}
public void SetFacebookRegistrationpageFirstname(String fn) {
	firstname.sendKeys(fn);
}
public void SetFacebookRegistrationpageLastname() {
	surname.sendKeys("patil");
}
public void SetFacebookRegistrationPageMobileEmail() {
	mob_email.sendKeys("ak@gmail.com");
}
public void SetFacebookRegistrationPagepassword() {
	password.sendKeys("ak@123");
}
public void SetFacebookRegistrationPageBirthday() {
	Select bday=new Select(birthdate);
	Assert.assertTrue(birthdate.isDisplayed(), "Birth date drop down is not displyed");
    Assert.assertFalse(birthdate.isSelected(), "Birth date is selected");
    bday.selectByVisibleText("8");
}
public void SetFacebookRegistrationPageBirthmonth() {
	Select bmonth=new Select(birthmonth);
	Assert.assertTrue(birthmonth.isDisplayed(), "Birth month drop down is not displyed");
    Assert.assertFalse(birthmonth.isSelected(), "Birth month is selected");
    bmonth.selectByVisibleText("Oct");
}
public void SetFacebookRegistrationPageBirthyear() {
	Select byear=new Select(birthyear);
	Assert.assertTrue(birthyear.isDisplayed(), "Birth year drop down is not displyed");
    Assert.assertFalse(birthyear.isSelected(), "Birth year is selected");
    byear.selectByVisibleText("1995");
}
public void setFacebookRegistrationPageGender(String gender) {
	if(gender.equalsIgnoreCase("male")){
		gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("please select valid input");
		}
	    }
public void ClickFacebookRegistrationPageSubmitButton() {
	submitbtn.click();
}
}
