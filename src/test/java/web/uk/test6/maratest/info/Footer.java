package web.uk.test6.maratest.info;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Footer extends BaseTest {


    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие AboutUs in Footer
    public void translationAboutUs() {

        assertEquals(mainPage.getAboutUs(), exampleBundle.getString("about_us"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие PrivacyPolicy in Footer
    public void translationPrivacyPolicy() {

        assertEquals(mainPage.getPrivacyPolicy(), exampleBundle.getString("privacy_policy"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Responsible Gaming in Footer
    public void translationResponsibleGambling() {

        assertEquals(mainPage.getResponsibleGambling(), exampleBundle.getString("responsible_gambling"));

    }



}