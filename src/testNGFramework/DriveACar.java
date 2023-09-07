package testNGFramework;

import org.testng.annotations.Test;

public class DriveACar {

    @Test(priority =0) //Prioritizing the test case priority attribute or keyword is used
    public void startTheCar(){
        System.out.println("Insert the key and start the car");
    }
    @Test(enabled = false) //To skip this testcase enabled attribute or keyword is used
    public void startTheMusic(){
        System.out.println("Turn on the music");
    }

    @Test(priority =1)
    public void putFirstGear(){
        System.out.println("Press the clutch and place the First gear");
    }

    @Test(priority =2)
    public void putSecondGear(){
        System.out.println("Press the clutch and place the Second gear");
    }

    @Test(priority =3)
    public void putThirdGear(){
        System.out.println("Press the clutch and place the Third gear");
    }

    @Test(priority =4)
    public void putFourthGear(){
        System.out.println("Press the clutch and place the Fourth gear");
    }
}
