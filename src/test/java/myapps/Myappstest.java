package myapps;

import automationtest.Basetest;
import org.testng.annotations.Test;
import pages.EducationPage;
import pages.Myappspage;
import pages.TedaPage;

import static org.testng.Assert.assertTrue;

public class Myappstest extends Basetest {
    @Test
    public void Testgooleplay(){
        Myappspage myappspage= homePage.clickonmyapps();
        myappspage.clickCategoryButton();
        assertTrue(myappspage.getAlertText().contains("My apps"),"text is incorrect");
        EducationPage educationPage=myappspage.clickonmyapps();
       // assertTrue(educationPage.getEducationAlertText().contains("Education"),"text is incorrect");
        educationPage.setname("TED");
        TedaPage tedaPage=educationPage.clickTedIcon();
        assertTrue(tedaPage.getTedtetx().contains("TED"),"text is incorrect");






    }

}
