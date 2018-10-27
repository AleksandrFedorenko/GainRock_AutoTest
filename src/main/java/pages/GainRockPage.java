package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GainRockPage extends ParentPage {


    @FindBy(id = "username")
    WebElement _username;

    @FindBy(id = "email")
    WebElement _email;

    @FindBy(id = "signupform-terms")
    WebElement _singupform;

    @FindBy(className = "btn ")
    WebElement _btnSubmit;

    public GainRockPage(WebDriver driver) {
        super(driver);
    }

    public void openKoshikPage() {
        try {
            driver.get("https://dev.gainrock.com");
        } catch (Exception e) {
            Assert.fail("Can not open GainRock");
        }
    }

    public void sendKeysTextInputUsername(String username){
        actionsWithOurWebElements.enterTextInToInput(_username, username);
    }

    public void sendKeysTextInputEmail(String email){
        actionsWithOurWebElements.enterTextInToInput(_email, email);
    }

    public void clickOnCheckSingUpForm(){
        actionsWithOurWebElements.clickOnWebElement(_singupform);
    }

    public void clickOnStartEarningToday(){
        actionsWithOurWebElements.clickOnWebElement(_btnSubmit);
    }
    }
