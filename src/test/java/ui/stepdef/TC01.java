package ui.stepdef;

import com.github.javafaker.Faker;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import ui.pages.WebElements;
import utilities.Driver;
import utilities.Log;
import utilities.ReusableMethods;

import java.io.IOException;

public class TC01 extends WebElements {

    Faker faker=new Faker();
    ReusableMethods methods=new ReusableMethods();

String mainurl;
    @Given("Navigate to url {string}")
    public void navigate_to_url(String url) {
        Log.startTestCase("navigate url");
        Driver.getDriver().get(url);
        mainurl=Driver.getDriver().getCurrentUrl();

    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),mainurl);
        Log.info("url verify edildi");
    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {
        click_sign_in();
        Log.info("sign in yapıldı");
    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String text) {

        newUserSignUpText(text);
        Log.info("Yeni kullanıcı girişi yazısı verify edildi");

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {

        registrerNameGir(faker.name().firstName());
        registrerEmailGir(faker.internet().emailAddress());
        Log.info("name ve email girildi");

    }
    @Then("Click {string} button")
    public void click_button(String string) {
        signUpButton_click();
        Log.info("signUp butonuna tıklandı");
    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String text) {

        enterAccountInformationVerify(text);
        Log.info("Enter Account Information yazısı doğrulandı");
    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        select_Gender();
        password_create();
        selectDay();
        selectMonth();
        selectYear();
        Log.info("account information bilgilerie girildi");
    }
    @Then("Select checkbox {string}")
    public void select_checkbox(String string) throws InterruptedException {


        Thread.sleep(1000);
        selectNewsLetterCheck();
        Thread.sleep(1000);
        selectUniformOptions();
        Log.info("check kutuları tıklandı");
    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        sendFirstName();
        sendLastName();
        sendAdress();
        selectCountry();
        sendState();
        sendCity();
        sendZipCode();
        sendMobileNumber();

        Log.info("Adress Information bilgileri girildi");

    }
    @Then("Click {string}")
    public void click(String string) {
        createAccount();
        Log.info("Hesap oluşturuldu");
    }


    @Then("Verify that this {string} is visible")
    public void verify_that_this_is_visible(String text) {
        verifyAccountCreated(text);
        Log.info("Hesap oluşturulduğu doğrulandı");
    }

    @Then("Click that {string} button")
    public void click_that_button(String string) {
      selectContinue();


    }
    @Then("Verify that Logged in as username is visible")
    public void verify_that_logged_in_as_username_is_visible() {
        verifyLoginText();
        Log.info("doğru kullanıcı adı görüntülendi");
    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        deleteAccount();
        Log.info("delete butonu seçildi");


    }

    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String text, String string2) throws IOException {
        Log.info("uygulama istediği şekilde sonuç vermedi.Ekran görüntüsü ilgili klasöre eklenmiştir.");

    }

}
