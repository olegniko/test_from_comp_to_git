package web.uk.test6.maratest.firefox;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTestFirefox {

    Locale locale;
    ResourceBundle exampleBundle;
    MainPage mainPage;



    @BeforeSuite
    public  void setUp() throws MalformedURLException {

        locale = new Locale("en");
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        mainPage = new MainPage("firefox");
        mainPage.open(locale);


    }


    @AfterSuite
    public void tearDown()  {
        mainPage.close();
    }
}
