package LocatorsOfThePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locatorsofregisterpage {
    public WebElement first_name_loc(WebDriver drv1) {
        return drv1.findElement(By.id("nf-field-17"));
    }

    public WebElement last_name_loc(WebDriver drv1) {
        return drv1.findElement(By.id("nf-field-18"));
    }

    public WebElement email_loc(WebDriver drv1) {
        return drv1.findElement(By.id("nf-field-19"));


    }

    public WebElement phone_loc(WebDriver drv1) {
        return drv1.findElement(By.id("nf-field-20"));

    }

    public WebElement hear_about_us_loc(WebDriver drv1) {
     return    drv1.findElement(By.id("nf-label-class-field-23-1"));

    }
//    public WebElement register_loc(WebDriver drv1){
//        return drv1.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/article/div/div[1]/div/div[4]/form/div/div[2]/nf-fields-wrap/nf-field[13]/div/div[2]/div/div[2]/input"));
//    }

}

//public WebElement password_loc(WebDriver drv1){
//        return drv1.findElement(By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/form/div[5]/div/input"));
//}
//
//public WebElement not_Robot_loc(WebDriver drv1){
//        return drv1.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]"));
//}
//}
