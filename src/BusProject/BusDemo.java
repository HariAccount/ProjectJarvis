package BusProject;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public static void main(String[] args) throws ParseException {

        ArrayList<Bus> buses= new ArrayList<Bus>(); //Storing the buses and their info in an Arraylist
        ArrayList<Booking> bookings= new ArrayList<Booking>();// Storing the booking and availability details in an Array list

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,50));
        buses.add(new Bus(3,false,48));

        for (Bus b:buses) //Using forEach we are displaying all the bus infos
        {
            b.displayBusInfo();

        }

        int opt = 1;
        Scanner scanner = new Scanner(System.in); //creating an object for the scanner class in order to capture the input using "in" class

        while (opt == 1) //Using while loop inorder to perform the task if the input is 1
        {
            System.out.println("For booking enter 1 and for exit enter 2: ");
            opt= scanner.nextInt();
            if(opt==1) {
               Booking booking=new Booking();
               if(booking.isAvailable(bookings,buses)){
                   //Checking the availability using both the Arraylist
                   bookings.add(booking);
                   System.out.println("Your Booking is Confirmed");
               }else System.out.println("Sorry!! Bus is full. Try another bus or date");
            }
            else {
                System.out.println("Thank You for using the app");
            }


        }
    }
}
