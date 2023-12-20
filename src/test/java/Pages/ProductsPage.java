package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import static Test.SeleniumTest.*;

public class ProductsPage {

    public static String formal_shoes_xpath = "/html/body/div[2]/center/h2";

    public static String formal_shoes_dropdown = "/html/body/div[2]/center/div/i[1]";

    public static String formal_shoes_firstname = "//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]";

    public static String sports_shoes_xpath = "/html/body/div[3]/center/h2";

    public static String sports_shoes_dropdown = "/html/body/div[3]/center/div/i[1]";

    public static String sports_shoes_firstname = "/html/body/div[3]/table/tbody/tr[1]/td[1]";

    public static String sneakers_shoes_xpath = "/html/body/div[4]/center/h2";

    public static String sneakers_shoes_dropdown = "/html/body/div[4]/center/div/i[1]";

    public static String sneakers_shoes_firstname = "/html/body/div[4]/table/tbody/tr[1]/td[1]";


    public static void formal_shoes_verifyTitle(){
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formal_shoes_xpath)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);
        if (expectedTitleFS.equals(actualTitleFS)){
            test.log(Status.PASS, "Test Passed for title verification of Formal Shoes   ");
        }
    }

    public static void sports_shoes_verifyTitle(){
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sports_shoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
        if (expectedTitleSS.equals(actualTitleSS)){
            test.log(Status.PASS, "Test Passed for title verification of Sport Shoes   ");
        }
    }

    public static void sneakers_shoes_verifyTitle(){
        String expectedTitleSK = "Sneakers";
        String actualTitleSK = driver.findElement(By.xpath(sneakers_shoes_xpath)).getText();
        Assert.assertEquals(expectedTitleSK, actualTitleSK);
        if (expectedTitleSK.equals(actualTitleSK)){
            test.log(Status.PASS, "Test Passed for title verification of Sneakers Shoes   ");
        }
    }

    public static void firstFormal_shoes_name_verify(){
        driver.findElement(By.xpath(formal_shoes_dropdown)).click();
        String expectedFirstFormalShoeTitle = "   Classic Cheltenham";
        String actualFirstFormalShoeTitle = driver.findElement(By.xpath(formal_shoes_firstname)).getText();
        Assert.assertEquals(expectedFirstFormalShoeTitle, actualFirstFormalShoeTitle);
        if (expectedFirstFormalShoeTitle.equals(actualFirstFormalShoeTitle)){
            test.log(Status.PASS, "Test Passed for title verification of First Formal Shoes   ");
        }
    }

    public static void firstSports_shoes_name_verify(){
        driver.findElement(By.xpath(sports_shoes_dropdown)).click();
        String expectedFirstSportsShoeTitle = "   Ultimate";
        String actualFirstSportsShoeTitle = driver.findElement(By.xpath(sports_shoes_firstname)).getText();
        Assert.assertEquals(expectedFirstSportsShoeTitle, actualFirstSportsShoeTitle);
        if (expectedFirstSportsShoeTitle.equals(actualFirstSportsShoeTitle)){
            test.log(Status.PASS, "Test Passed for title verification of First Sports Shoes   ");
        }
    }

    public static void firstSneakers_shoes_name_verify(){
        driver.findElement(By.xpath(sneakers_shoes_dropdown)).click();
        String expectedFirstSneakerShoeTitle = "   Archivo";
        String actualFirstSneakerShoeTitle = driver.findElement(By.xpath(sneakers_shoes_firstname)).getText();
        Assert.assertEquals(expectedFirstSneakerShoeTitle, actualFirstSneakerShoeTitle);
        if (expectedFirstSneakerShoeTitle.equals(actualFirstSneakerShoeTitle)){
            test.log(Status.PASS, "Test Passed for title verification of First Sneaker Shoes   ");
        }else {
            test.log(Status.FAIL, "Test Failed for title verification of First Sneaker Shoes   ");
        }
    }



}
