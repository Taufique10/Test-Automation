package com.BrowserOptions;

import com.Base.BaseTesting;

public class BasicAuthentication extends BaseTesting {

    public static void main(String[] args) {

        launch_chrome();
        openURL("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

}
