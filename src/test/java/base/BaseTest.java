package base;

import by.yandex.search.singleton.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeEach
    public void beFore(){
        this.driver= Singleton.getDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void after() {
        Singleton.quitDriver();
    }

}
