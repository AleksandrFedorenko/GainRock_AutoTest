package LoginGainRock;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentTest.ParentTest;

public class Login extends ParentTest {

    @Test
    public void  StartEarningToday(){
    gainRockPage.sendKeysTextInputUsername("GainRockUser");
    gainRockPage.sendKeysTextInputEmail("");
    gainRockPage.clickOnCheckSingUpForm();
    gainRockPage.clickOnStartEarningToday();
    /*Assert*/
    }
}
