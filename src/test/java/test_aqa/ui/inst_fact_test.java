package test_aqa.ui;


        import org.testng.annotations.AfterTest;
        import org.testng.annotations.Test;
        import day_12.BaseUITest;
        import day_12.InstagramFactoryBO;

public class inst_fact_test extends BaseUITest {

    @Test()
    void InstagramPOTest() {
        InstagramFactoryBO instagramBo = new InstagramFactoryBO(driver);

        instagramBo.goToSite();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        instagramBo.signIn();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        instagramBo.verifyHomePageIsOpen();
    }


    @AfterTest
    void CloseDriver(){
        driver.close();
        driver.quit();
    }
}

