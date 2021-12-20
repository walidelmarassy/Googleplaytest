package automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Homepage;

public class Basetest {
    WebDriver driver;
    protected Homepage homePage;
    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://play.google.com/");
        homePage=new Homepage(driver);


    }
//    @AfterClass
//    public void teardown(){
//        driver.quit();
//    }

}


