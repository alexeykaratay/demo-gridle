package by.vwbrest.zzap;

import by.yandex.search.singleton.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    private String inputSearchLineLocator = "pcode";
    private String buttonSearchLocator = "//button[@name='go']";
    private String spanArticleLocator = "//span[@class='article-number']";
    private String divErrorMessageLocator = "//div[@class='fr-alert fr-alert-warning alert-noResults']";

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public void homePageOpen() {
        driver.get("https://zzap.vw-brest.by");
    }

    public void inputSearchLineSendKeys(String searchLine) {
        driver.findElement(By.id(inputSearchLineLocator)).sendKeys(searchLine);
    }

    public void buttonSearchClick() {
        driver.findElement(By.xpath(buttonSearchLocator)).click();
    }

    public String getSearchResultArticle() {
        WebElement resultBrand = driver.findElement(By.xpath(spanArticleLocator));
        return resultBrand.getText();
    }

    public String getDivErrorMessage() {
        return driver.findElement(By.xpath(divErrorMessageLocator)).getText();
    }


}
