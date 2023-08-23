package BusProject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() throws ParseException //parse exception is used for exception handling
    {
        //Using Scanner class we are getting the details from the passenger
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the passenger name= ");
        passengerName=scanner.next();
        System.out.println("Enter the Bus number= ");
        busNo= scanner.nextInt();
        System.out.println("Enter the date in dd-mm-yyyy = ");//date will be received as string it has to be converted to date format
        String dateInput = scanner.next();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yyyy");// Using the SimpleDateFormat class we are converting the string into date format
        date=dateFormat.parse(dateInput);
    }

    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)// Creating a method to availability of the bus
    {
        int capacity=0;

        for(Bus bus:buses) {
            //Finding the capacity of the bus by using for each block so that it will check each buses in the list
            if (bus.getBusNo()==busNo){
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        //To find the booking availability using for each block so that it will check each booking in the list
        for (Booking b:bookings){
            if (b.busNo== busNo && b.date.equals(date)){
                //checking if the old booking busno,date & new booking busno,date are same
                booked++;

            }
        }
        //compare the booked and capacity variable and return the boolean value
     return booked<capacity?true:false;
    }

}
