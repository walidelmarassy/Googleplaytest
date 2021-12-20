package myapps;

import automationtest.Basetest;
import org.testng.annotations.Test;
import pages.EducationPage;
import pages.FacebookPage;
import pages.Myappspage;
import pages.TedaPage;

import static org.testng.Assert.assertTrue;

public class Facebooktest extends Basetest {
    @Test
    public void Facebooktest(){
        FacebookPage facebookPage= homePage.setname("facebook");
facebookPage.checkeelmentdisplayed();

    }

}
