package Test;

import Pages.HomePage;
import Pages.ProductsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumTest {

    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest test;
    public static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.click_online_Products_Link();
    }

    @AfterSuite
    public static void clean(){
        extent.flush();
    }

    @AfterTest
    public void Teardown(){
        driver.quit();
    }

    @Test(priority = 1)
    void validateTitles_OnlineProducts(){
        test = extent.createTest("validate Titles on Products Page");
        ProductsPage.formal_shoes_verifyTitle();
        ProductsPage.sports_shoes_verifyTitle();
        ProductsPage.sneakers_shoes_verifyTitle();
        extent.flush();
    }

    @Test(priority = 2)
    void validateFirstFormalShoesName(){
        test = extent.createTest("validate Formal shoe Title");
        ProductsPage.firstFormal_shoes_name_verify();
    }

    @Test(priority = 3)
    void validateFirstSportsShoesName(){
        test = extent.createTest("validate Sports shoe Title");
        ProductsPage.firstSports_shoes_name_verify();
    }

    @Test(priority = 4)
    void validateFirstSneakersShoesName(){
        test = extent.createTest("validate Sneaker shoe Title");
        ProductsPage.firstSneakers_shoes_name_verify();
    }

}
