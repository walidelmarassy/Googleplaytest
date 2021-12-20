package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Myappspage {
    private WebDriver driver;

    private By categoryButton=By.id("action-dropdown-parent-Categories");
    private By myappsAlert=By.linkText("My apps");



    public Myappspage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCategoryButton(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(categoryButton).click();
    }
    public EducationPage clickonmyapps(){
        Clicklink("Education");
        return new EducationPage(driver);
    }

    private void Clicklink(String linkText){
        driver.findElement(By.linkText(linkText)).click();


    }
    public String getAlertText(){
        return   driver.findElement(myappsAlert).getText();
    }

}
