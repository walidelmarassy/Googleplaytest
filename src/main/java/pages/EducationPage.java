package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class EducationPage {
    WebDriver driver;
    private By educationAlert=By.className("TwyJFf");
    private By searchField=By.name("q");
    private By tedIcon=By.xpath("//a[@href ='/store/apps/details?id=com.ted.android']");



    public EducationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setname(String ted){
        driver.findElement(searchField).sendKeys(ted, Keys.ENTER);

    }
    public TedaPage clickTedIcon(){
        driver.findElement(tedIcon).click();
        return new  TedaPage(driver);


    }
    public String getEducationAlertText(){
        return   driver.findElement(educationAlert).getText();
    }




}
