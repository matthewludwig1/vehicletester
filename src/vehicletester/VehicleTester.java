/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

import javax.swing.*;

public class VehicleTester {
  
    public static void main(String[] args) {
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0);
    //Show Vehicle Info
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Try to drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Try to add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);
    
    int pass = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of passengers"
            + " boarding this trip?"));
    int fare = Integer.parseInt(JOptionPane.showInputDialog("What is the fare in $?"));
    
    int fuelCost = Integer.parseInt(JOptionPane.showInputDialog("What is the price of fuel "
            + "in $/L?"));
    car1.getTotalCost(pass, fare, fuelCost);
  }
}