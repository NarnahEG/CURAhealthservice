package bookTests;

import curaHealth.CuraHealthObjects;
import io.qameta.allure.Description;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class bookTestsCura {
    CuraHealthObjects cura = new CuraHealthObjects();

    @BeforeTest
    public void launchPage(){
        cura.launcher();
    }
    @Test
    @Description("Appointment Confirmation " +
            "Please be informed that your appointment has been booked as following:")
    public void bookAptProcedure(){
        cura.appointLaunch();
        cura.loginDetails();
        cura.fillAptForm();
    }
    @AfterTest
    public void closePage(){
        cura.logoutDetails();
        cura.tear();
    }
}
