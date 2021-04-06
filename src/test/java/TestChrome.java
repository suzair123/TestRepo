import pageObject.LoginScreen;
import utils.ConfigReader;

import java.io.IOException;
import java.util.Properties;


public class TestChrome extends ConfigReader {

    public static void main(String[] args) throws InterruptedException, IOException {

        Properties prop;
        prop = fileReader("\\src\\main\\resources\\testData.properties");

        LoginScreen ls = new LoginScreen();
        ls.openHomePage();
        String dashboard = ls.validCredentials(prop.getProperty("username"),prop.getProperty("password"));

        if(dashboard.equalsIgnoreCase("Admin")) System.out.println("Pass");
        else System.out.println("Fail");
    }
}
