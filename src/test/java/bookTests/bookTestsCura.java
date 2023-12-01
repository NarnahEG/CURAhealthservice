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
    @Description("Appointment Confirmation!\n " +
            "Please be informed that your appointment has been booked as following:\n" +
            "\n Facility: " +
            "Hongkong CURA Healthcare Center\n" +
            "\n" +
            "Apply for hospital readmission: " +
            "No\n" +
            "\n" +
            "Healthcare Program: " +
            "None\n" +
            "\n" +
            "Visit Date: " +
            "01/01/2024\n" +
            "\n" +
            "Comment: " +
            "I want to finish on time")
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
