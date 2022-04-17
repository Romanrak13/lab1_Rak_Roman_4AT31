package day_12;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import day_12.po.HomeFactoryPO;
import day_12.po.SignInFactoryPO;

public class InstagramFactoryBO {
    private WebDriver driver;

    HomeFactoryPO homeFactoryPO;
    SignInFactoryPO signInFactoryPO;

    public InstagramFactoryBO(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSite() {
        signInFactoryPO = new SignInFactoryPO(this.driver);
        signInFactoryPO.goToSite();
    }

    public void signIn() {
        homeFactoryPO = signInFactoryPO.clickSignIn();
    }

    public void verifyHomePageIsOpen() {
        Assert.assertTrue(homeFactoryPO.isOpen());
    }
}
