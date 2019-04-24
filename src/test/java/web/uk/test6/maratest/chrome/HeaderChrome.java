package web.uk.test6.maratest.chrome;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderChrome extends BaseTest {


    @Test(groups = { "headerTest" })
    //наличие Sport in Header
    public void translationSportInHeader() {

        Assert.assertEquals(mainPage.getSport_label_header(),exampleBundle.getString("sport_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Live in Header
    public void translationLiveInHeader() {

        Assert.assertEquals(mainPage.getLive_label_header(),exampleBundle.getString("live_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Toto in Header
    public void translationTotoInHeader() {

        Assert.assertEquals(mainPage.getToto_label_header(),exampleBundle.getString("toto_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Casino in Header
    public void translationCasinoInHeader() {

        Assert.assertEquals(mainPage.getCasino_label_header(),exampleBundle.getString("casino_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Live Casino in Header
    public void translationLiveCasinoInHeader() {

        Assert.assertEquals(mainPage.getLiveCasino_label_header(),exampleBundle.getString("live_casino_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Constructor in Header
    public void translationConstructorCasinoInHeader() {

        Assert.assertEquals(mainPage.getConstructor_label_header(),exampleBundle.getString("constructor_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Bingo in Header
    public void translationBingoInHeader() {

        Assert.assertEquals(mainPage.getBingo_label_header(),exampleBundle.getString("bingo_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Financials in Header
    public void translationFinancialInHeader() {

        Assert.assertEquals(mainPage.getFinancials_label_header(),exampleBundle.getString("financial_label_header"));

    }

    @Test(groups = { "headerTest" })
    //наличие Lost Password in Header
    public void translationLostPassword() {

        Assert.assertEquals(mainPage.getLost_password(),exampleBundle.getString("lost_password"));

    }

    @Test(groups = { "headerTest" })
    //наличие Help in Header
    public void translationHelp() {

        Assert.assertEquals(mainPage.getHelp(),exampleBundle.getString("help"));

    }

    @Test(groups = { "headerTest" })
    //наличие Language in Header
    public void translationLanguage() {

        Assert.assertEquals(mainPage.getLanguage(),exampleBundle.getString("language"));

    }

    @Test(groups = { "headerTest" })
    //наличие Results&Statistic in Header
    public void translationResults() {

        Assert.assertEquals(mainPage.getResults(),exampleBundle.getString("results"));

    }

    @Test(groups = { "headerTest" })
    //наличие Settings in Header
    public void translationSettings() {

        Assert.assertEquals(mainPage.getSettings(),exampleBundle.getString("settings"));

    }

    @Test(groups = { "headerTest" })
    //наличие Mobile in Header
    public void isMobilePresent() {

        Assert.assertTrue(mainPage.isMobileIconPresent());

    }


    @Test(groups = { "headerTest" })
    //наличие Maraathon in Header
    public void isMarathonPresent() {

        Assert.assertTrue(mainPage.isMarathonIconPresent());

    }
}


