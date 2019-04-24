package web.uk.test6.maratest.firefox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginChrome extends BaseTestFirefox {


    @Test(priority = 30)
    //наличие captcha
    public void login1() {

        mainPage.login("olegeng44", "Password2");
        Assert.assertTrue(mainPage.isCaptcha_proverochnyi_cod());

    }



}
