package me.afua.demo;

import java.util.ArrayList;
import java.util.Collections;

/*
* This is the bare minimum - create an app that allows you to start, stop and accelerate cars.
*
* */
public class SimpleCarApp {
    public static void main(String[] args) throws InterruptedException {

        //Set up the first car


        //Set up the second car


        //Make the first car pass the second car

        //

        //Traffic simulation
        Thread.sleep(1000);
    }

    public static void simulateTraffic(ArrayList<Vehicle> allVehicles)
    {
        Collections.shuffle(allVehicles);
        for(Vehicle eachVehicle : allVehicles)
        {
            if(eachVehicle.getClass().getSimpleName().toLowerCase()=="car")
            {
                System.out.println("The car is moving at "+eachVehicle.getSpeed()+ " which is within the speed limit.");
            }

       }

    }
}

