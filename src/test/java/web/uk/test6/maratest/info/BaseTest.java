package web.uk.test6.maratest.info;

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
    @Parameters({"language","browser"})
    public  void setUp(String language,String browser) throws MalformedURLException {

        locale = new Locale(language);
        exampleBundle = ResourceBundle.getBundle("ResourceBundle",locale);
        mainPage = new MainPage(browser);
        mainPage.open(locale);


    }


    @AfterSuite
    public void tearDown()  {
        mainPage.close();
    }
}
