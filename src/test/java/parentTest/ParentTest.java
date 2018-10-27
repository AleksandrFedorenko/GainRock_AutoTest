package parentTest;

import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.core.Is.is;

public class ParentTest {
    protected WebDriver driver;

    public GainRockPage gainRockPage;

    @Before
    public void setUp() {
        File fileGC = new File("./drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileGC.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}