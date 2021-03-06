package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//        Create a new class : GoogleSeachTest
//        Create main method and complete the following task.
//        When user goes to https://www.google.com/
//        Search for “porcelain teapot”
//        And print how many related results displayed on Google
//        And click on Shopping
//        Then click on the first result
//        Then when user click on the first “Visit site” link
//        Then the link should open

public class Day2_GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();
        WebElement searchResult=driver.findElement(By.id("result-stats"));
        System.out.println("RESULT : "+searchResult.getText());
        //Clicking on Shopping
        driver.findElement(By.partialLinkText("Shopping")).click();
        //Or I can use below combination
//        WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
//        shopping.click();
        driver.findElement(By.className("xsRiS")).click();
    }
}
