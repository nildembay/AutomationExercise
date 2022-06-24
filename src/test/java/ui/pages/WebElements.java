package ui.pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class WebElements {

    Faker faker=new Faker();

    private WebDriver driver=Driver.getDriver();
    By sign_in_button=By.xpath("//a[@href='/login']");
    By name=By.name("name");
    By newUserSignUpText=By.xpath("//h2[text()='New User Signup!']");
    By registerEmail=By.xpath("(//input[@name='email'])[2]");

    By signupButton=By.xpath("(//button[@class='btn btn-default'])[2]");

    By enterAccountInformationText=By.xpath("//*[text()='Enter Account Information']");

    By genderTitle=By.id("id_gender2");
    By password_crate=By.id("password");
    By dayDropdown=By.id("days");
    By monthDropdown=By.id("months");

    By yearDropdown=By.id("years");

    By checkbox1=By.id("newsletter");
    By checkbox2=By.id("optin");

    By firstName=By.id("first_name");
    By lasttName=By.id("last_name");
    By address1=By.id("address1");
    By country=By.id("country");
    By state=By.id("state");
    By city=By.id("city");
    By zipcode=By.id("zipcode");
    By mobile_number=By.id("mobile_number");
    By createAccountButton=By.xpath("(//button[@class='btn btn-default'])[1]");

    By accountCreatedText=By.xpath("//*[text()='Account Created!']");

    By contiuneButton=By.xpath("//a[@class='btn btn-primary']");

    By verifyLogin=By.xpath("//*[text()=' Logged in as ']");

    By deleteAccountButton=By.xpath("//a[@href='/delete_account']");

    By deleteOnayButton= By.xpath("//button[@class='btn btn-danger']");

    public void click_sign_in(){
        driver.findElement(sign_in_button).click();
    }

    public void newUserSignUpText(String text){
        Assert.assertEquals(driver.findElement(newUserSignUpText).getText(),text);
    }

    public void registrerNameGir(String ad){
        driver.findElement(name).sendKeys(ad);
    }

    public void registrerEmailGir(String email){
        driver.findElement(registerEmail).sendKeys(email);
    }

    public void signUpButton_click(){
        driver.findElement(signupButton).click();
    }

    public void enterAccountInformationVerify(String text){
        Assert.assertEquals(driver.findElement(enterAccountInformationText).getText(),text);

    }

    public void select_Gender(){
        driver.findElement(genderTitle).click();
    }
    public void password_create(){
        driver.findElement(password_crate).sendKeys("12345ab");
    }

    public void selectDay(){
        Select selectday=new Select(driver.findElement(dayDropdown));
        selectday.selectByIndex(12);
    }
    public void selectMonth(){
        Select selectmonth=new Select(driver.findElement(monthDropdown));
        selectmonth.selectByVisibleText("April");
    }
    public void selectYear(){
        Select selectyear=new Select(driver.findElement(yearDropdown));
        selectyear.selectByValue("1980");
    }

    public void selectNewsLetterCheck(){
        if (!driver.findElement(checkbox1).isSelected()) {
            driver.findElement(checkbox1).click();
        }

    }
    public void selectUniformOptions(){
        if (!driver.findElement(checkbox2).isSelected()) {
            driver.findElement(checkbox2).click();
        }
    }


    public void sendFirstName(){
        driver.findElement(firstName).sendKeys(faker.name().firstName());
    }

    public void sendLastName(){
        driver.findElement(lasttName).sendKeys(faker.name().lastName());
    }

    public void sendAdress(){
        driver.findElement(address1).sendKeys(faker.address().streetAddress());
    }
    public void sendState(){
        driver.findElement(state).sendKeys(faker.address().state());
    }

    public void sendCity(){
        driver.findElement(city).sendKeys(faker.address().city());
    }

    public void sendZipCode(){
        driver.findElement(zipcode).sendKeys(faker.address().zipCode());
    }

    public void sendMobileNumber(){
        driver.findElement(mobile_number).sendKeys(faker.phoneNumber().phoneNumber());
    }
    public void selectCountry(){
        Select selectcountry=new Select(driver.findElement(country));
        selectcountry.selectByVisibleText("United States");
    }

    public void createAccount(){
        driver.findElement(createAccountButton).click();
    }

    public void verifyAccountCreated(String text){
        Assert.assertTrue(driver.findElement(accountCreatedText).getText().equalsIgnoreCase(text));
    }
    public void selectContinue(){
        driver.findElement(contiuneButton).click();
    }

    public void verifyLoginText(){
        Assert.assertTrue(driver.findElement(verifyLogin).isDisplayed());
    }

    public void deleteAccount(){
        driver.findElement(deleteAccountButton).click();
        driver.findElement(deleteOnayButton).click();
    }
}
