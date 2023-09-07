package testNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuiteDemo // Suite is a collection of testCases
{
    WebDriver driver;
    long startTime;
    long endTime;
    @BeforeSuite //This will execute the functions within it before executing the testCases
    public void launchBrower(){
      startTime=System.currentTimeMillis(); //this currentTimeMillis method is used to calculate the current time of the browser
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();


    }

    @Test(priority = 0)
    public void openGoogle(){
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

    @Test(priority = 1)
    public void openAmazon(){
//        long startTime=System.currentTimeMillis();
//        System.setProperty("WebDriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.quit();
//        long endTime=System.currentTimeMillis();
//        long totalTime= endTime-startTime;
//        System.out.println("Total time in millisec= "+totalTime);

    }

    @Test(priority = 2)
    public void openNetflix(){
//        long startTime=System.currentTimeMillis();
//        System.setProperty("WebDriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver();
        driver.get("https://www.netflix.com/in/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.quit();
//        long endTime=System.currentTimeMillis();
//        long totalTime= endTime-startTime;
//        System.out.println("Total time in millisec= "+totalTime);

    }

    @AfterSuite //This will execute the functions within it after executing all the testCases
    public void closeBrower(){
        driver.quit();
        endTime=System.currentTimeMillis();
        long totalTime= endTime-startTime;
        System.out.println("Total time in millisec= "+totalTime);

    }
}
