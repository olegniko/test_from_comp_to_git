package web.uk.test6.maratest.firefox;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderFirefox extends BaseTestFirefox {


    @Test(groups = { "headerTestFirefox" })
    //наличие Sport in Header
    public void translationSportInHeader() {

        Assert.assertEquals(mainPage.getSport_label_header(),exampleBundle.getString("sport_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Live in Header
    public void translationLiveInHeader() {

        Assert.assertEquals(mainPage.getLive_label_header(),exampleBundle.getString("live_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Toto in Header
    public void translationTotoInHeader() {

        Assert.assertEquals(mainPage.getToto_label_header(),exampleBundle.getString("toto_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Casino in Header
    public void translationCasinoInHeader() {

        Assert.assertEquals(mainPage.getCasino_label_header(),exampleBundle.getString("casino_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Live Casino in Header
    public void translationLiveCasinoInHeader() {

        Assert.assertEquals(mainPage.getLiveCasino_label_header(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Constructor in Header
    public void translationConstructorCasinoInHeader() {

        Assert.assertEquals(mainPage.getConstructor_label_header(),exampleBundle.getString("constructor_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Bingo in Header
    public void translationBingoInHeader() {

        Assert.assertEquals(mainPage.getBingo_label_header(),exampleBundle.getString("bingo_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Financials in Header
    public void translationFinancialInHeader() {

        Assert.assertEquals(mainPage.getFinancials_label_header(),exampleBundle.getString("financial_label_header"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Lost Password in Header
    public void translationLostPassword() {

        Assert.assertEquals(mainPage.getLost_password(),exampleBundle.getString("lost_password"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Help in Header
    public void translationHelp() {

        Assert.assertEquals(mainPage.getHelp(),exampleBundle.getString("help"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Language in Header
    public void translationLanguage() {

        Assert.assertEquals(mainPage.getLanguage(),exampleBundle.getString("language"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Results&Statistic in Header
    public void translationResults() {

        Assert.assertEquals(mainPage.getResults(),exampleBundle.getString("results"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Settings in Header
    public void translationSettings() {

        Assert.assertEquals(mainPage.getSettings(),exampleBundle.getString("settings"));

    }

    @Test(groups = { "headerTestFirefox" })
    //наличие Mobile in Header
    public void isMobilePresent() {

        Assert.assertTrue(mainPage.isMobileIconPresent());

    }


    @Test(groups = { "headerTestFirefox" })
    //наличие Maraathon in Header
    public void isMarathonPresent() {

        Assert.assertTrue(mainPage.isMarathonIconPresent());

    }
}


