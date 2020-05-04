package com.techproedpackage;



//        Create a class : CheckBox_RadioButton
//        Create main method and complete the following task.
//        Go to https://the-internet.herokuapp.com/checkboxes
//        Locate the elements of checkboxes
//        Then click on checkbox1 if box is not selected
//        Then click on checkbox2 if box is not selected

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_CheckBox_RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/CIMBOM/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //Check all teh checkbox if it is checked or uncheck

        //isSelected() method returns true if box is selected. It returns false, if box is not selected
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        System.out.println(checkBox1.isSelected());
        if (!checkBox1.isSelected()){//the first checkbox is not selected=>true
            checkBox1.click();
        }else{
            System.out.println("Already Checked");
        }System.out.println(checkBox1.isSelected());


        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        System.out.println(checkBox2.isSelected());
        if (!checkBox2.isSelected()){//checkbox 2 is not selected=>false
            checkBox2.click();
        }else {
            System.out.println("Already checkBox2 is Checked");
        }System.out.println(checkBox2.isSelected());





    }
}
