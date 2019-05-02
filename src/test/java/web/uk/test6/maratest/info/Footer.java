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

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Terms and Conditions in Footer
    public void translationTermsAndConditions() {

        assertEquals(mainPage.getTermsAndConditions(), exampleBundle.getString("terms_and_conditions"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Contact Us in Footer
    public void translationContactUs() {

        assertEquals(mainPage.getContactUs(), exampleBundle.getString("contact_us"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Payments in Footer
    public void translationPayments() {

        assertEquals(mainPage.getPayments(), exampleBundle.getString("payments"));

    }

    @Test(groups = {"footerTestChrome", "footerTestOpera", "footerTestFirefox"})
    //наличие Mobile Site in Footer
    public void translationMobileSite() {

        assertEquals(mainPage.getMobileSite(), exampleBundle.getString("mobile_site"));

    }



}