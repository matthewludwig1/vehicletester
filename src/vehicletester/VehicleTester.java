/*
    Matt Ludwig
    04-29-2019
    This is a modified version of the vehicle tester client code
 */

package vehicletester;

import javax.swing.*;

public class Vehicletester {
  
    public static void main(String[] args) {
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0);
    double fare, fuelCost, profit;
    //Show Vehicle Info
    int pass = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount of passengers"
            + " boarding this trip?"));
     fare = Double.parseDouble(JOptionPane.showInputDialog("What is the fare in $?"));
    
     fuelCost = Double.parseDouble(JOptionPane.showInputDialog("What is the price of fuel "
            + "in $/L?"));
    
    
    System.out.println("Passengers: " + pass);
    System.out.println("Fare $" + fare);
    System.out.println("Fuel Cost: $" + fuelCost + "/L");

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
    
    System.out.println("Revenue = " + car1.getRevenue(pass, fare));
    System.out.println("Cost = " + car1.getTotalCost(fuelCost));
    profit = (car1.getRevenue(pass, fare) - car1.getTotalCost(fuelCost));
    System.out.println("Profit = " + profit);
  }
}
