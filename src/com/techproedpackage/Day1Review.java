package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
//    Create a new class : Day1Review
//    Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
//            Verify if the page URL contains youtube if not, print the right url.
//    Then Navigate to https://www.amazon.com/
//    Navigate back to youtube
//    Refresh the page
//    Navigate forward to amazon
//    Maximize the window
//    Then verify if page title includes “Amazon”, If not, print the correct title.
//            Verify if the page URL is https://www.amazon.com/, if not print the correct url
//    Quit the browser
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";

        if (actualYoutubeTitle.equals(expectedYoutubeTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Actual Youtube Title is " + actualYoutubeTitle);
        }

        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";

        if (actualYoutubeURL.contains(actualYoutubeURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("No, the title does not contain 'youtube' " + actualYoutubeURL);
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualAmazonTitle = driver.getTitle();
        String expectedAmazonTitle = "Amazon";

        if (actualAmazonTitle.contains(expectedAmazonTitle)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("The title of Amazon is : " + actualAmazonTitle);
        }

        String actualAmazonURL = driver.getCurrentUrl();
        String expectedAmazonURL = "https://www.amazon.com/";

        if (actualAmazonURL.equals(expectedAmazonURL)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("The URL of Amazon is : " + actualAmazonURL);
        }
        driver.quit();
    }
}
