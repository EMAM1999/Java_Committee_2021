/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**

 @author EMAM
 */
public class A320FlightTripReservationSystem {

      static String green = "\033[2;32m";
      static String red = "\033[2;31m";
      static String resetColor = "\033[0m";

      static ArrayList<Trip> trips = new ArrayList<>();
      static Scanner in = new Scanner(System.in);

      public static void main(String[] args) {
            while ( true ) {
                  System.out.println("0. To add a new trip");
                  System.out.println("1. To reserve a new empty seat");
                  System.out.println("2. To display the passenger information");
                  System.out.println("3. To search for a passenger");
                  System.out.println("4. To print a list of the seat’s passengers");
                  System.out.println("5. To cancel a passenger reservation");
                  System.out.println("7. To exit execution");
                  System.out.println("Enter your choice :: ");
                  int num = in.nextInt();
                  switch ( num ) {
                        case 0: addNewTrip();
                              break;
                        case 1: reserveNewSeat();
                              break;
                        case 2: displayPassengerInformation();
                              break;
                        case 3: searchForPassenger();
                              break;
                        case 4: printSeatsPassengers();
                              break;
                        case 5: cancelReservation();
                              break;
                        case 7: System.exit(0);
                              break;
                        default:
                              System.out.println("Wrong Input !!");
                  }
                  System.out.println("done 👍");
            }
      }

      private static void addNewTrip() {
            System.out.println("Enter The flight number :: ");
            int flightNum = in.nextInt();
            System.out.println("Enter The airport the trip goes from :: ");
            String fromAirport = in.next();
            System.out.println("Enter The airport the trip goes to :: ");
            String toAirport = in.next();
            System.out.println("Enter the distance :: ");
            double distance = in.nextDouble();
            System.out.println("Enter the departual time :: ");
            double departualTime = in.nextDouble();
            System.out.println("Enter the arrival time :: ");
            double arrivalTime = in.nextDouble();
            Trip t = new Trip(flightNum, fromAirport, toAirport, distance, departualTime, arrivalTime);
            trips.add(t);
      }

      private static void cancelReservation() {
            Trip trip = getTrip();
            if ( trip == null ) {
                  System.out.println("Wrong Input");
                  return;
            }
            System.out.println("Enter the last name of th passenger ::");
            String lastName = in.next();
            trip.unReserveSeat(lastName);
      }

      private static void displayPassengerInformation() {
            Trip trip = getTrip();
            if ( trip == null ) {
                  System.out.println("Wrong Input");
                  return;
            }
            System.out.println("Enter the seat number :: ");
            String seatNum = in.next();
            if ( trip.isReserved(seatNum) ) {
                  System.out.println(trip.getSeat(seatNum, false).getPassenger());
            } else {
                  System.out.println("The seat number " + seatNum + " is not reserved or not exist");
            }
      }

      private static void displayTrips() {
            for ( Trip trip: trips ) {
                  System.out.println(trip.getFlightNumber());
            }
      }

      private static Trip getTrip() {
            System.out.println("Flight number for all trips");
            displayTrips();
            System.out.println("Enter the flight number of a trip to reserve in :: ");
            int tripNum = in.nextInt();
            return searchTrips(tripNum);
      }

      private static void printSeatsPassengers() {
            Trip trip = getTrip();
            if ( trip == null ) {
                  System.out.println("Wrong Input");
            }
            ArrayList<Seat> seats = trip.getReservedSeats();
            boolean firstClassTyped = false;
            boolean economyTyped = false;
            for ( Seat seat: seats ) {
                  if ( seat.getRawNumber() <= 3 ) {
                        if ( !firstClassTyped ) {
                              System.out.println("FIRST-CLASS");
                              firstClassTyped = true;
                        }
                  } else {
                        if ( !economyTyped ) {
                              System.out.println("ECONOMY");
                              economyTyped = true;
                        }
                  }
                  System.out.println("\t" + seat.getSeatNumber() + "\n\t" + seat.getPassenger());
            }
      }

      private static void searchForPassenger() {
            Trip trip = getTrip();
            if ( trip == null ) {
                  System.out.println("Wrong Input");
                  return;
            }
            System.out.println("Enter the passenger last name :: ");
            String lastName = in.next();
            ArrayList<Seat> reservedSeats = trip.getReservedSeats();
            for ( Seat seat: reservedSeats ) {
                  if ( seat.getPassenger().getLastName().equalsIgnoreCase(lastName) ) {
                        System.out.println(seat);
                  }
            }
      }

      private static Trip searchTrips(int num) {
            for ( Trip trip: trips ) {
                  if ( trip.getFlightNumber() == num ) {
                        return trip;
                  }
            }
            return null;
      }

      private static void reserveNewSeat() {
            Trip trip = getTrip();
            if ( trip == null ) {
                  System.out.println("Wrong Input");
                  return;
            }
            System.out.println("1. first class\n2. economy");
            String seatType = in.next().toUpperCase();
            Seat seat = null;
            switch ( seatType ) {
                  case "1":
                  case "FIRST":
                  case "FIRST CLASS":
                        seatType = "first-class";
                        seat = trip.nextUnreservedFirstClassSeat();
                        break;
                  case "2":
                  case "ECONOMY":
                        seatType = "economy";
                        seat = trip.nextUnreservedEconomySeat();
                        break;
                  default: System.out.println("Wrong Input");
                        return;
            }
            if ( seat == null ) {
                  System.out.println("All " + seatType + " seats  in trip number (" + trip.getFlightNumber() + ") are reserved");
                  return;
            }
            System.out.println("Enter the passenger information :: ");
            Passenger newPassenger = getNewPassenger();
            switch ( seat.getColumnNumber() ) {
                  case 'A':
                  case 'F': newPassenger.setFlightSeatPreference(Passenger.SEAT_WINDOW);
                        break;
                  case 'C':
                  case 'D': newPassenger.setFlightSeatPreference(Passenger.SEAT_AISLE);
                        break;
                  default:
                        newPassenger.setFlightSeatPreference(Passenger.SEAT_NONE);
            }
            trip.reserveSeat(seat.getSeatNumber(), newPassenger);
            System.out.println("Reserving confirmed for "
                    + "flight number " + trip.getFlightNumber()
                    + " in " + seatType
                    + " seat number " + seat.getSeatNumber());
      }

//      private static void displaySeatsDetails(Trip trip) {
//            char businessCharacters[] = { 'A', 'C', 'D', 'F' };
//            for ( int i = 0; i < 3; i++ ) {
//                  for ( int j = 0; j < trip.getSeats()[i].length; j++ ) {
//                        System.out.print((trip.getSeats()[i][j] == null ? green : red));
//                        System.out.printf("%c%02d%s", businessCharacters[j], (i + 1), (j == 1 ? "      " : "    "));
//                        System.out.print(resetColor);
//                  }
//                  System.out.println("");
//            }
//            char economyCharacters[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
//            for ( int i = 3; i < trip.getSeats().length; i++ ) {
//                  for ( int j = 0; j < trip.getSeats()[i].length; j++ ) {
//                        System.out.print(trip.getSeats()[i][j] == null ? green : red);
//                        System.out.printf("%c%02d%s", economyCharacters[j], (i + 1), (j == 2 ? "    " : " "));
//                        System.out.print(resetColor);
//                  }
//                  System.out.println("");
//            }
//      }
      private static Passenger getNewPassenger() {
            System.out.println("Enter the first name :: ");
            String firstName = in.next();
            System.out.println("Enter the last name :: ");
            String lastName = in.next();
            System.out.println("Enter the gender (m/f) :: ");
            String gender = in.next();
            System.out.print("Enter the date of birth\nyear :: ");
            int year = in.nextInt();
            System.out.print("month :: ");
            int month = in.nextInt();
            System.out.print("day :: ");
            int day = in.nextInt();
            Date dateOfBirth = new Date(year, month, day);
            System.out.println("Enter the passportNumber :: ");
            String passportNumber = in.next();
            System.out.println("Enter the nationality :: ");
            String nationality = in.next();
            System.out.println("Has visa ?? ");
            boolean visa = in.nextBoolean();
            return new Passenger(firstName, lastName, gender, dateOfBirth, passportNumber, nationality, visa);
      }

}
