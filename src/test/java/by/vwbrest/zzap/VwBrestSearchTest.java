package by.vwbrest.zzap;

import base.BaseTest;
import by.vwbrest.zzap.utils.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VwBrestSearchTest extends BaseTest {
    @Test
    public void searchTest() {
        HomePage homePage = new HomePage();
        homePage.homePageOpen();
        homePage.inputSearchLineSendKeys("GIP06035");
        homePage.buttonSearchClick();
        Assertions.assertEquals("GIP06035", homePage.getSearchResultArticle(),"error: article not value!");
    }

    @Test
    public void errorTest(){
        String article = "GIP0603";
        HomePage homePage = new HomePage();
        homePage.homePageOpen();
        homePage.inputSearchLineSendKeys(article);
        homePage.buttonSearchClick();
        Assertions.assertEquals(Util.getExpectedErrorMessageFor(article), homePage.getDivErrorMessage(), "Error text message");
    }
}
