package StepsDef;

import LocatorsOfThePage.Locatorsofregisterpage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class StepDefintions {
    Locatorsofregisterpage Loc1 = new Locatorsofregisterpage();
    ChromeDriver driver;

    @Given("user enter the website")
    public void enter_Website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://codenboxautomationlab.com/registration-form/");
        driver.manage().window().maximize();
    }

    @And("user enter firstname")
    public void enter_firstname() {
        Loc1.first_name_loc(driver).sendKeys("Osama");

    }

    @And("user enter lastname")
    public void enter_lastname() {
        Loc1.last_name_loc(driver).sendKeys("Mohamed");

    }

    @And("user enter valid-email")
    public void enter_email() {
        Loc1.email_loc(driver).sendKeys("osama.mohamed1032000@gmail.com");
    }

    @And("user enter mobile numnber")
    public void enter_mobilenumber() {

        Loc1.phone_loc(driver).sendKeys("01003416978");
    }

    @And("user choose how you hear about us")
    public void choose_how_you_hear_About_us() {
        Loc1.hear_about_us_loc(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nf-field-15")));

    }

    @And("user click on register button")
    public void clicking() {
        driver.findElement(By.id("nf-field-15")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/main/article/div")));

    }


    @Then("user login successfully")
    public void checking_login() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div/main/article/div")));
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/article/div")).isDisplayed());
    }
}

