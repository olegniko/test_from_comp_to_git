package helper.factory;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverSingleton {


    public static WebDriver init(String browser) throws MalformedURLException {

        WebDriverFactory factory;


        if("info".equalsIgnoreCase(browser)){

            factory = new ChromeDriverFactory();

       }
        else if("firefox".equalsIgnoreCase(browser)) {

            factory = new FirefoxDriverFactory();

       }
        else if("opera".equalsIgnoreCase(browser)) {

            factory = new OperaDriverFactory();

        }
        else if("edge".equalsIgnoreCase(browser)) {

            factory = new EdgeDriverFactory();

        }
        else{

            factory = new ChromeDriverFactory();

        }



        return factory.create();

    }

    public static void kill(WebDriver driver) {

        driver.close();
    }
}

