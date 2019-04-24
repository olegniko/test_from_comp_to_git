package pages;

import helper.factory.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import java.net.MalformedURLException;
import java.util.Locale;


public  class MainPage extends BasePage {


	public MainPage(String browserName) throws MalformedURLException {

		driver = WebDriverSingleton.init(browserName);
		PageFactory.initElements(driver, this);
	}

	public void open(Locale locale)  {

		String lan;

		if ( locale.getLanguage() == null) {
			lan = "en";
		}
		else
			lan=locale.getLanguage();

		String url = "https://web.uk.test6.maratest.info/%lan%/".replace("%lan%", lan);

		driver.get(url);
		driver.manage().window().maximize();
	}
	public void close()  {


		WebDriverSingleton.kill(driver);
	}

}
