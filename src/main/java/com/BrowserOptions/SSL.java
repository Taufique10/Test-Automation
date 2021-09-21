package com.BrowserOptions;

import com.Base.BaseTesting;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL extends BaseTesting {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
        driver=new ChromeDriver(opt);

        openURL("https://cacert.com/");
    }
}
