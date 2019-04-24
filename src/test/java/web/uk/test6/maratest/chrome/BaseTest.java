package web.uk.test6.maratest.chrome;

import helper.factory.WebDriverSingleton;
import org.testng.annotations.*;
import pages.MainPage;

import java.net.MalformedURLException;
import java.util.Locale;
import java.util.ResourceBundle;


public class BaseTest {

    Locale locale;
    ResourceBundle exampleBundle;
    MainPage mainPage;



    @BeforeSuite
    public  void setUp() throws MalformedURLException {

        locale = new Locale("en");
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        mainPage = new MainPage("chrome");
        mainPage.open(locale);


    }


    @AfterSuite
    public void tearDown()  {
        mainPage.close();
    }
}
