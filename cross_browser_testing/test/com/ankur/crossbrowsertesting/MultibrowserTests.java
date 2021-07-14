package com.ankur.crossbrowsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static com.ankur.crossbrowsertesting.Browser.CHROME;
import static com.ankur.crossbrowsertesting.Browser.FIREFOX;
import static com.ankur.crossbrowsertesting.OS.MAC;

public class MultibrowserTests {

    private SeleniumService seleniumService;

    private String browser;

    private WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browser) {
        seleniumService = new SeleniumService();
        System.out.println("browser parameter  - "+browser);
        this.browser = browser;

        Browser enumBrowser=null;
        if(browser.equalsIgnoreCase("chrome")){
            enumBrowser=CHROME;
        }else if(browser.equalsIgnoreCase("firefox")){
            enumBrowser=FIREFOX;
        }
        System.out.println("enumBrowser = "+enumBrowser);
        driver = seleniumService.loadDriver(MAC,enumBrowser);
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("http://localhost:3080/shop/");
        driver.findElement(By.id("uid")).click();
        driver.findElement(By.id("uid")).sendKeys("java");
        driver.findElement(By.id("pid")).click();
        driver.findElement(By.id("pid")).sendKeys("java");
        driver.findElement(By.id("loginId")).click();
        Thread.sleep(2000);
        System.out.println("Page title = "+driver.getTitle());
    }

    @AfterClass
    public void cleanup(){
        driver.close();
    }

}
