package com.BrowserOptions;

import com.Base.BaseTesting;
import com.RegistrationOpenCart.Registration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess extends BaseTesting {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions obj=new ChromeOptions();
        obj.setHeadless(true);
        driver=new ChromeDriver(obj);

        Registration.TestCase001();
        Registration.TestCase002();
    }
}
