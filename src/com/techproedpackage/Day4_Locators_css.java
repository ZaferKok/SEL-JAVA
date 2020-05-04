package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        /*Create a class : Locators_css
        Create main method and complete the following task.
        When user goes to http://a.testaddressbook.com/sign_in
        Locate the elements of email textbox,password textbox, and signin button
        Enter below username and password then click sign in button
        Username :  testtechproed@gmail.com
        Password : Test1234!
        USE CSS SELECTOR TO LOCATE ELEMENTS*/

//                css = tagName[attribute name='value’']
//                driver.findElement(By.cssSelector("input[name='session[email]']"));
//                css="tagName#id value" or just css="#id value"=>This works for id value only
//                driver.findElement(By.cssSelector("input#session_email"));
//                css="tagName.class value" or just css=".class value"=>This works for class value only
//                driver.findElement(By.cssSelector("input.form-control"));


public class Day4_Locators_css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://a.testaddressbook.com/sign_in");
// <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");
//<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordBox = driver.findElement(By.cssSelector("input[id='session_password']"));
        WebElement passwordBox2 = driver.findElement(By.cssSelector("input#session_password"));
        passwordBox2.sendKeys("Test1234!");
//<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signInButton = driver.findElement(By.cssSelector("input[data-test='submit']"));
        WebElement signInButton2= driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        signInButton2.click();

    }
}
