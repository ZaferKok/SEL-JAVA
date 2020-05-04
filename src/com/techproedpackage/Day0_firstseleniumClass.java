package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day0_firstseleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");

        // creating chrome webdriver
        WebDriver driver=new ChromeDriver();

        // going to the website using get(); method
        driver.get("https://www.boeing.com/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // to close the webdriver we use close() or quit()
        // what is the difference between close() and quit()
        // close() is closing only the current page but quit() all pages
        driver.close();
    }
}
