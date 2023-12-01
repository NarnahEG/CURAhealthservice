package curaHealth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CuraHealthObjects {
    WebDriver driver;

    WebDriverWait wait;

    public void launcher() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Selectors.curaLink);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }


    public void appointLaunch(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.appointButton)));
        driver.findElement(By.cssSelector(Selectors.appointButton)).click();
    }

    public void loginDetails(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.userField)));
        driver.findElement(By.cssSelector(Selectors.userField)).sendKeys(Selectors.userName);
        driver.findElement(By.cssSelector(Selectors.pwdField)).sendKeys(Selectors.password);
        driver.findElement(By.cssSelector(Selectors.login)).click();
    }

    public void fillAptForm(){
        driver.findElement(By.cssSelector(Selectors.facility)).sendKeys(Selectors.hongKong);
        driver.findElement(By.cssSelector(Selectors.healthType)).click();
        driver.findElement(By.cssSelector(Selectors.dateField)).sendKeys(Selectors.date);
        driver.findElement(By.cssSelector(Selectors.commentField)).sendKeys(Selectors.comment);
        driver.findElement(By.cssSelector(Selectors.bookButton)).click();
    }

    public void logoutDetails(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.hamburg)));
        driver.findElement(By.cssSelector(Selectors.hamburg)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Selectors.sideBarNav)));
        driver.findElement(By.cssSelector(Selectors.logoutIcon)).click();
    }
    public void tear(){
        driver.quit();
    }

}

