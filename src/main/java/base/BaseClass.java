package base;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    private WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\broswerDrivers\\chromedriver.exe");
    }

    public BaseClass(){
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        driver = new ChromeDriver();
        return driver;
    }

    public void openHomePage(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
}
