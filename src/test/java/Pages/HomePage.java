package Pages;

import org.openqa.selenium.By;

import static Test.SeleniumTest.driver;

public class HomePage {

    public static String hamburger_menu_xpath = "//*[@id='menuToggle']/input";

    public static String online_Products_Link = "//*[@id='menu']/a[3]/li";

    public static void click_hamburger_menu(){

        driver.findElement(By.xpath(hamburger_menu_xpath)).click();

    }

    public static void click_online_Products_Link() throws InterruptedException{

        Thread.sleep(2000);
        driver.findElement(By.xpath(online_Products_Link)).click();

    }
}
