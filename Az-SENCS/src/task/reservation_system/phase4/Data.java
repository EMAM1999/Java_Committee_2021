/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**

 @author EMAM
 */
public class Data {

      public static ArrayList<Trip> trips;

      public static Trip getTrip(String tripNum) {
            tripNum = tripNum.trim();
            for ( Trip ele: trips ) {
                  if ( ele.getTripNumber().equalsIgnoreCase(tripNum) ) {
                        return ele;
                  }
            }
            return null;
      }

      public static void readTripsFile(String path) throws FileNotFoundException {
            Scanner in = new Scanner(new File(path));
            trips = new ArrayList<>();
            while ( in.hasNextLine() ) {
                  String line = in.nextLine();
                  String s[] = line.split("/");

                  int day = Integer.parseInt(s[3].split("-")[0]);
                  int month = Integer.parseInt(s[3].split("-")[1]);
                  int year = Integer.parseInt(s[3].split("-")[2]);
                  Calendar date = Calendar.getInstance();
                  date.set(year, month, day);

                  Trip trip = new Trip(s[0], s[1], s[2], date);
                  trips.add(trip);
            }
      }

      public static void readPassengersFile(String path) throws FileNotFoundException {
            Scanner in = new Scanner(new File(path));
            while ( in.hasNextLine() ) {
                  String line = in.nextLine();
                  String s[] = line.split("/");
// s[0] -> trip 
// s[1] -> name
// s[2] -> Passport
// s[3] -> Seat
                  String tripNum = s[0];
                  String name = s[1];
                  long passport = Long.parseLong(s[2]);
                  String SeatNum = s[3];
                  Passenger passenger = new Passenger(name, passport);
                  System.out.println(SeatNum + "->" + getTrip(tripNum).
                          getSeat(SeatNum));
                  getTrip(tripNum).
                          getSeat(SeatNum).
                          setPassenger(passenger);
            }
      }

      public static void writeTrips(String path) throws IOException {
            FileWriter file = new FileWriter(new File(path));
            trips.sort((t1, t2) -> t1.compareTo(t2));
            for ( Trip trip: trips ) {
                  file.write(trip.getTripNumber() + "\n");
                  Seat[][] seats = trip.getSeats();

                  file.write("\tFirst class\n");
                  for ( int i = 0; i < 3; i++ ) {
                        for ( Seat seat: seats[i] ) {
                              file.write("\t\t" + seat + "\n");
                        }
                  }
                  file.write("\tEconomy class\n");
                  for ( int i = 3; i < seats.length; i++ ) {
                        for ( Seat seat: seats[i] ) {
                              file.write("\t\t" + seat + "\n");
                        }
                  }
            }
      }
}
