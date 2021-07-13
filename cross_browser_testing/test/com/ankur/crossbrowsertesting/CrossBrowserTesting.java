package com.ankur.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTesting {


    private static final String MAC_DRIVER_DIRECTORY="/usr/local/bin/";
    private static final String MAC_CHROME_DRIVER = MAC_DRIVER_DIRECTORY + "chromedriver";
    private static final String MAC_FIREFOX_DRIVER=MAC_DRIVER_DIRECTORY +"geckodriver";

    private static final String WINDOWS_DRIVER_DIRECTORY = ".\\resources\\";
    private static final String WINDOWS_FIREFOX_DRIVER = WINDOWS_DRIVER_DIRECTORY + "geckodriver_win64.exe";
    private static final String WINDOWS_CHROME_DRIVER = WINDOWS_DRIVER_DIRECTORY + "chromedriver.exe";



    @Test
   public void test(){
        WebDriver driver = loadChromeDriver(OSType.MAC);
        driver.get("http://localhost:3080/shop/");
    }

    public  WebDriver loadChromeDriver(OSType osType) {
        if(osType==OSType.MAC) {
            System.setProperty("webdriver.chrome.driver", MAC_CHROME_DRIVER);
        }else if(osType==OSType.WINDOWS) {
            System.setProperty("webdriver.chrome.driver", WINDOWS_CHROME_DRIVER);
        }
        return new ChromeDriver();
    }

    public  WebDriver loadFirefoxDriver(OSType osType) {
        if(osType==OSType.WINDOWS) {
            System.setProperty("webdriver.gecko.driver", WINDOWS_FIREFOX_DRIVER);
        }else if(osType==OSType.MAC) {
            System.setProperty("webdriver.gecko.driver", MAC_FIREFOX_DRIVER);
        }

        return new FirefoxDriver();
    }

}
