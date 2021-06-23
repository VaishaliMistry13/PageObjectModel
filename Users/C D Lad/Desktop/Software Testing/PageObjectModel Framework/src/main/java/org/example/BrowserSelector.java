package org.example;

import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage{

    LoadProperty loadProperty = new LoadProperty();

    //String browsername = "chrome";
    String browserName = loadProperty.getProperty("browser");

    public void openBrowser() {

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\C D Lad\\Desktop\\Software Testing\\PageObjectModel Framework\\src\\test\\BrowserDriver\\chromedriver.exe");

            //initialize chromedriver
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\C D Lad\\Desktop\\Software Testing\\PageObjectModel Framework\\src\\test\\BrowserDriver\\geckodriver.exe");

            //initialize Firefoxdriver
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","C:\\Users\\C D Lad\\Desktop\\Software Testing\\PageObjectModel Framework\\src\\test\\BrowserDriver\\msedgedriver.exe");

            //initialize Edgedriver
            driver = new EdgeDriver();
        }
        else {
            System.out.println("Invalid Browser Name"+browserName);
        }

        // maximize browser window
        driver.manage().window().maximize();

        // apply the implicit wait for webdriver
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

}
