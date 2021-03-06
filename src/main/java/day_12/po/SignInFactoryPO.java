package day_12.po;

import day_12.decorator.Button;
import day_12.decorator.Input;
import day_12.decorator.MyFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInFactoryPO {

    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input")
    Input loginArea;

    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input")
    Input passwordArea;

    @FindBy(xpath = "/html/body/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button")
    Button signInButton;

    private WebDriver driver;

    public SignInFactoryPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver), this);
    }

    public void goToSite() {
        driver.get("https://www.instagram.com/");
    }

    public HomeFactoryPO clickSignIn() {
        this.insertLogin();
        this.insertPassword();
        signInButton.click();
        return new HomeFactoryPO(driver);
    }

    public void insertLogin() {
        loginArea.put("test.test@gmail.com");
    }

    public void insertPassword() {
        passwordArea.put("1qaz!QAZ");
    }
}
