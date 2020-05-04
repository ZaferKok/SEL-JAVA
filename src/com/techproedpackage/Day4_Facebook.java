package com.techproedpackage;

//        use css third technique;
//        Create a class : Face_Login_Page
//        1. go to https://www.facebook.com/
//        2. Test if below username and password is valid.
//        username="testusername"
//        password="testpassword"
//        Step 1. locate the username box
//        Step 2/ locate the password box
//        Step 3. locate teh signin button
//        Ste4 4. click on the sign in button

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
        WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
        emailTextBox.sendKeys("testusername");
//<input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
        WebElement passwordTextBox = driver.findElement(By.cssSelector("input#pass"));
        passwordTextBox.sendKeys("testpassword");
//<input value="Giriş Yap" aria-label="Giriş Yap" data-testid="royal_login_button" type="submit" id="u_0_b">
        WebElement loginButton = driver.findElement(By.cssSelector("input#u_0_b"));
        //loginButton.click();



//        SING IN
//        Using the same class
//        1.Find the webelements of
//        "Sign Up"
//        "Connect with friends and the world around you on Facebook."
//        2.Locate and send text to
//        "First name"=testfirstname
//        "Last name"=testlastname
//        "Mobiel number or email"=test@gmail.com
//        "New Password"=testpassword

//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" value="" aria-required="true" placeholder="" aria-label="Adın" id="u_0_m">
        WebElement firstname = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
        firstname.sendKeys("testfirstname");
//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="lastname" value="" aria-required="true" placeholder="" aria-label="Soyadın" id="u_0_o">
        WebElement lastname = driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
        lastname.sendKeys("testlastname");
//<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Cep telefonu numarası veya e-posta" id="u_0_r">
        WebElement email = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
        email.sendKeys("test@gmail.com");
//<input type="password" class="inputtext _58mg _5dba _2ph-" data-type="password" autocomplete="new-password" name="reg_passwd__" aria-required="true" placeholder="" aria-label="Yeni şifre" id="u_0_w" aria-autocomplete="list">
        WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        password.sendKeys("testpassword");
//<input type="radio" class="_8esa" name="sex" value="1" id="u_0_6">
        WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        male.click();
        WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
    }
}
