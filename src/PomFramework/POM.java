package PomFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class POM {

    public static WebElement userName(WebDriver driver){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement user_Name= driver.findElement(By.name("username"));
        return user_Name;
    }

    public static WebElement password(WebDriver driver){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement password= driver.findElement(By.name("password"));
        return password;
    }

    public static WebElement clickingMyInfo(WebDriver driver){

        WebElement myIn= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
        return myIn;
    }
    public static WebElement clickPersonalDetails(WebDriver driver){

        WebElement pDetails= driver.findElement(By.xpath("//*[@class='orangehrm-tabs-item --active']"));
        return pDetails;
    }

    public static WebElement firstName(WebDriver driver){

        WebElement fName=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
        return fName;
    }

    public static WebElement lastName(WebDriver driver){
        WebElement lName=driver.findElement(By.name("lastName"));
        return lName;
    }
}
