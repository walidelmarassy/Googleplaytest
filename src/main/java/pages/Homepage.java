package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Homepage {
    private WebDriver driver;
    private By searchField=By.name("q");


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public Myappspage clickonmyapps(){
        Clicklink("Apps");
        return new  Myappspage(driver);
    }

    private void Clicklink(String linkText){
        driver.findElement(By.linkText(linkText)).click();


    }
    public FacebookPage setname(String ted){
        driver.findElement(searchField).sendKeys(ted, Keys.ENTER);
return new FacebookPage(driver);
    }
}
