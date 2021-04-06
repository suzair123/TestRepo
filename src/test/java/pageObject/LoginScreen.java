package pageObject;

import base.BaseClass;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginScreen extends BaseClass {
    WebDriver driver;

   public LoginScreen(){
        driver = getDriver();
    }

    public String validCredentials(String Username, String Pass) throws InterruptedException {
        driver.findElement(By.id("txtUsername")).click();
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(Pass);
        driver.findElement(By.name("Submit")).click();
        //String invalidText = driver.findElement(By.id("spanMessage")).getText();
        String dashboard = driver.findElement(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']//*[contains(text(),'Admin')]")).getText();
//        driver.findElement(By.linkText("Admin")).click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        WebDriverWait dropdown1 = new WebDriverWait(driver,20);
//        dropdown1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]//*[contains(text(),\"Admin\"")));
//        Thread.sleep(2000);
//        driver.findElement(By.partialLinkText("My")).click();
        return dashboard;
    }
}
