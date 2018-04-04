package me.afua.demo;

import java.util.Scanner;

public class UpscaledCarApp {

    public static void main(String[] args) {

        int speedLimit=0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the speed limit");
        speedLimit = keyboard.nextInt();

        //Using a default constructor
        Car firstCar = new Car();

        getDetails(firstCar);
        checkSpeed(firstCar,speedLimit);

        Car secondCar = new Car();
        getDetails(secondCar);

        System.out.println(firstCar.hasPassed(secondCar));

        MotorCycle theMoto = new MotorCycle();
        System.out.println("A "+theMoto.getClass().getSimpleName().toLowerCase()+" just crossed the road");
        getDetails(theMoto);
        checkSpeed(theMoto,speedLimit);

        firstCar.stopped();
        System.out.println("That was a near miss! The "+firstCar.getClass().getSimpleName().toLowerCase()+ "did not hit the "+theMoto.getBrand()+" "+theMoto.getClass().getSimpleName()+"! ");
    }

    public static void getDetails(Vehicle theVehicle)
    {
        String vehicleType="";

        if(theVehicle instanceof  Car)
            vehicleType = "car";

        if(theVehicle instanceof  MotorCycle)
            vehicleType = "motorcycle";

        Scanner sc = new Scanner(System.in);

        //Get brand
        System.out.println("Enter the brand of the "+vehicleType);
        theVehicle.setBrand(sc.nextLine());
        System.out.println("The "+vehicleType+" is a "+theVehicle.getBrand());

        //Start the vehicle
        theVehicle.started();

        //Set the speed
        System.out.println("Enter the current speed of the "+vehicleType+" (mph)");
        theVehicle.setSpeed(sc.nextInt());
        sc.nextLine();

        System.out.println("The vehicle is moving at "+theVehicle.getSpeed()+" mph ");

        //Accelerate
        System.out.println("The vehicle is about to accelerate. How much should it increase speed by? (mph)");
        theVehicle.accelerate(sc.nextInt());
        sc.nextLine();
        System.out.println("The vehicle is moving at "+theVehicle.getSpeed()+" mph \n\n");

    }

    public static void checkSpeed(Vehicle vehicle,int speedLimit)
    {
        Scanner keyboard = new Scanner(System.in);

        do{

            if(vehicle.getSpeed()<=speedLimit)
            {
                System.out.println("Keep going, you're fine.");
            }
            else{
                System.out.println("The speed limit is "+speedLimit+" miles per hour. You're going at "+vehicle.getSpeed()+" miles per hour Slow down!\n Enter the speed to decelerate by:");
                vehicle.decelerate(keyboard.nextInt());
            }

        }while(vehicle.getSpeed()>speedLimit);
    }
}
