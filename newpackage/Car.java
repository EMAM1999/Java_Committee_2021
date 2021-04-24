/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**

 @author EMAM
 */
public class Car {


          private final String carId;
          private final String brand;
          private final int fuelType;
          private final int productionYear;
          private final boolean isAutomatic;
          private final boolean isAvailable;
          private String note;



          public Car() {
                    this.carId = null;
                    this.brand = null;
                    this.fuelType = 0;
                    this.productionYear = 0;
                    this.isAutomatic = false;
                    this.isAvailable = false;
          }



          public Car(Car c) {
                    this.carId = c.carId;
                    this.brand = c.brand;
                    this.fuelType = c.fuelType;
                    this.productionYear = c.productionYear;
                    this.isAutomatic = c.isAutomatic;
                    this.isAvailable = c.isAvailable;
          }



          public Car(String carId , String brand , int fuelType , int productionYear , boolean isAutomatic , boolean isAvailable) {
                    this.carId = carId;
                    this.brand = brand;
                    this.fuelType = fuelType;
                    this.productionYear = productionYear;
                    this.isAutomatic = isAutomatic;
                    this.isAvailable = isAvailable;
          }



          public String getBrand() {
                    return brand;
          }



          public String getCarId() {
                    return carId;
          }



          public int getFuelType() {
                    return fuelType;
          }



          public String getNote() {
                    return note;
          }



          public void setNote(String note) {
                    this.note = note;
          }



          public int getProductionYear() {
                    return productionYear;
          }



          public boolean isAvailable() {
                    return isAvailable;
          }



          public void printInfo() {
                    System.out.println("Car ID: " + this.carId);
                    System.out.println("Car brand: " + this.brand);
                    System.out.println("Fuel Type: " + this.fuelType);
                    System.out.println("Production Year: " + this.productionYear);
                    System.out.println("Is automatic: " + this.isAutomatic);
                    System.out.println("Is available: " + this.isAvailable);
                    System.out.println("Note: " + this.note);
          }



          public boolean search(String brand) {
                    return this.brand.equals(brand);
          }

}

class test {


          public static void main(String[] args) {
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter the number of cars: ");
                    int carsNo = in.nextInt();
                    Car[] cars = new Car[carsNo];
                    firstFunction(cars , carsNo);
                    System.out.println("Are you want to search for car info? ");
                    boolean search = in.nextBoolean();
                    if ( search ) {
                              System.out.println("Enter the brand: ");
                              String brand = in.next();
                              secondFunction(cars , carsNo , brand);
                    }
                    System.out.println("Are you want to see all available cars? ");
                    boolean see = in.nextBoolean();
                    if ( see ) {
                              thirdFunction(cars , carsNo);
                    }
          }



          public static void firstFunction(Car[] cars , int carNumber) {
                    Scanner in = new Scanner(System.in);
                    for ( int i = 0 ; i < carNumber ; i++ ) {
                              System.out.println("Enter the id: ");
                              String id = in.next();
                              System.out.println("Enter the brand: ");
                              String brand = in.next();
                              System.out.println("Enter fuel type: ");
                              int type = in.nextInt();
                              System.out.println("Enter production year: ");
                              int year = in.nextInt();
                              System.out.println("Is automatic: ");
                              boolean auto = in.nextBoolean();
                              System.out.println("Is available: ");
                              boolean available = in.nextBoolean();
                              cars[i] = new Car(id , brand , type , year , auto , available);
                    }
          }



          public static void secondFunction(Car[] cars , int carNumber , String brandType) {
                    int number = 0;
                    for ( int i = 0 ; i < carNumber ; i++ ) {
                              if ( cars[i].search(brandType) ) {
                                        number++;
                                        cars[i].printInfo();
                              }
                    }
                    if ( number == 0 ) {
                              System.out.println("The brand does not exist");
                    }
          }



          public static void thirdFunction(Car[] cars , int carNumber) {
                    for ( int i = 0 ; i < carNumber ; i++ ) {
                              if ( cars[i].isAvailable() ) {
                                        cars[i].printInfo();
                              }
                    }
          }

}
// ambiguous invocation
