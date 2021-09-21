package com.Navigation;

import com.Base.BaseTesting;

public class NavigationTest extends BaseTesting {

    public static void main(String[] args) {
        launch_chrome();
        openURL("https://youtube.com");
        smallWait();
        navigate_To();
        MediumWait();
        navigate_Back();
        LongWait();
        navigate_Forward();
    }

    public static void navigate_To(){
        driver.navigate().to("https://demo.opencart.com/");
    }
    public static void navigate_Back(){
        driver.navigate().back();
    }

    public static void navigate_Forward(){
        driver.navigate().forward();
    }
}
