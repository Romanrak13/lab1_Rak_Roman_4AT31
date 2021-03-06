package test_aqa.ui;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;

public class stackoverflow {
    WebDriver driver;

    @BeforeTest
    void initDriver(){
        String driverPath = "C:\\Users\\RomanRak\\IdeaProjects\\lab1_Rak_Roman_4AT31\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        driver = new ChromeDriver();
    }

    @Test
    void stackOverflowTest() {

        driver.get("https://stackoverflow.com/questions");

        WebElement tagsText = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/nav/ol/li[2]/ol/li[3]/a/div/div"));

        WebElement activeText = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/a[2]/div"));

        Assert.assertTrue(tagsText.isDisplayed());
        Assert.assertTrue(activeText.isDisplayed());


        Assert.assertEquals(tagsText.getText(), "Tags");
        Assert.assertEquals(activeText.getText(), "Active");

    }


    @AfterTest
    void CloseDriver(){
        driver.close();
        driver.quit();
    }
}