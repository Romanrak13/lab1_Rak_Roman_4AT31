package test_aqa.ui;

        import org.testng.annotations.AfterTest;
        import org.testng.annotations.Test;
        import day_11.InstagramBo;
        import day_12.BaseUITest;

public class inst_test extends BaseUITest {

    @Test()
    void InstagramPOTest() {
        InstagramBo instagramBo = new InstagramBo(driver);

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