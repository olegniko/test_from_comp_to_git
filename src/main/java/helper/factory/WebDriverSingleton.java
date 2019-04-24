package helper.factory;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverSingleton {


    public static WebDriver init(String browserName) throws MalformedURLException {

        WebDriverFactory factory;


        if("chrome".equalsIgnoreCase(browserName)){

            factory = new ChromeDriverFactory();

       }
        else if("firefox".equalsIgnoreCase(browserName)) {

            factory = new FirefoxDriverFactory();

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

