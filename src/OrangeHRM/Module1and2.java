package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Module1and2 {
    WebDriver driver=null;
    String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Test
    public void TC1_driver(){
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver= new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test
    public void TC2_login(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        Actions action= new Actions(driver);
        action.sendKeys(Keys.TAB);
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        action.sendKeys(Keys.ENTER).perform();

    }

    @Test
    public void TC3_ValidatingMyInfo(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement myIn= driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
        myIn.click();
    }

    @Test
    public void TC4_ValidatingPersonalDetails(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement pDetails= driver.findElement(By.xpath("//*[@class='orangehrm-tabs-item --active']"));
        pDetails.click();

        WebElement fName=driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
        fName.clear();
       fName.sendKeys("Hari");

        WebElement lName=driver.findElement(By.name("lastName"));
        lName.clear();
        lName.sendKeys("Vinay");
    }



}
