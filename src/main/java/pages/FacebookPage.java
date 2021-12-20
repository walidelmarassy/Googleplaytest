package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FacebookPage {
    WebDriver driver;
    private By icondisplayed=By.xpath("//a[@href ='/store/apps/details?id=com.facebook.katana']");


    public FacebookPage(WebDriver driver) {
        this.driver = driver;
    }
    public void checkeelmentdisplayed(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(icondisplayed).isDisplayed();
    }



}
