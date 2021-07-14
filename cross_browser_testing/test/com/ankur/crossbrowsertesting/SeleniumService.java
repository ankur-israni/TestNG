package com.ankur.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.ankur.crossbrowsertesting.Browser.CHROME;
import static com.ankur.crossbrowsertesting.Browser.FIREFOX;
import static com.ankur.crossbrowsertesting.OS.MAC;
import static com.ankur.crossbrowsertesting.OS.WINDOWS;

public class SeleniumService {

    private static final String MAC_DRIVER_DIRECTORY="/usr/local/bin/";
    private static final String MAC_CHROME_DRIVER = MAC_DRIVER_DIRECTORY + "chromedriver";
    private static final String MAC_FIREFOX_DRIVER=MAC_DRIVER_DIRECTORY +"geckodriver";
    private static final String WINDOWS_DRIVER_DIRECTORY = ".\\resources\\";
    private static final String WINDOWS_FIREFOX_DRIVER = WINDOWS_DRIVER_DIRECTORY + "geckodriver_win64.exe";
    private static final String WINDOWS_CHROME_DRIVER = WINDOWS_DRIVER_DIRECTORY + "chromedriver.exe";


    public WebDriver loadDriver(OS os, Browser browser){
        WebDriver driver = null;

        if(browser==CHROME){
            driver = new ChromeDriver();
            if(os==MAC){
                System.setProperty("webdriver.chrome.driver", MAC_CHROME_DRIVER);
            }else if(os==WINDOWS){
                System.setProperty("webdriver.chrome.driver", WINDOWS_CHROME_DRIVER);
            }
        }else if(browser==FIREFOX){
            driver = new FirefoxDriver();
            if(os==MAC){
                System.setProperty("webdriver.gecko.driver", MAC_FIREFOX_DRIVER);
            }else if(os==WINDOWS){
                System.setProperty("webdriver.gecko.driver", WINDOWS_FIREFOX_DRIVER);
            }
        }

//
//        if(os==MAC){
//            if(browser==CHROME){
//                System.setProperty("webdriver.chrome.driver", MAC_CHROME_DRIVER);
//
//            }else if(browser==FIREFOX){
//                System.setProperty("webdriver.gecko.driver", MAC_FIREFOX_DRIVER);
//
//            }
//        }else if(os==WINDOWS){
//            if(browser==CHROME){
//                System.setProperty("webdriver.chrome.driver", WINDOWS_CHROME_DRIVER);
//            }else if(browser==FIREFOX){
//                System.setProperty("webdriver.gecko.driver", WINDOWS_FIREFOX_DRIVER);
//            }
//        }

        return driver;
    }

}
