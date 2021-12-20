package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TedaPage {
    WebDriver driver;
    private By tedalerttext=By.linkText("TED");

    public TedaPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTedtetx(){
        return   driver.findElement(tedalerttext).getText();
    }

}
