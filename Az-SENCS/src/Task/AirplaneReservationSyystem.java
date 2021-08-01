/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;
import java.util.Scanner;

/**

 @author EMAM
 */
public class AirplaneReservationSyystem {

      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            boolean[] economySeats = new boolean[24];
            boolean[] firstClassSeats = new boolean[3];
            displayWelcome();
LOOP:       while ( true ) {
                  displayMenu();
                  int c = getChoise(in);
                  switch ( c ) {
                        case 1: System.out.println("Reserve One Economy Seat");
                              economySeats = reserveSeat(in, economySeats, 'E');
                              break;
                        case 2: System.out.println("Reserve One First Class Seat");
                              firstClassSeats = reserveSeat(in, firstClassSeats, 'F');
                              break;
                        case 3: System.out.println("Remove One Reserved Economy Seat");
                              economySeats = removeSeat(in, economySeats, 'E');
                              break;
                        case 4: System.out.println("Remove One Reserved First Class Seat");
                              firstClassSeats = removeSeat(in, firstClassSeats, 'F');
                              break;
                        case 5: System.out.println("Seats Details");
                              displayDetails(firstClassSeats, economySeats);
                              break;
                        case 6: System.out.println("Good Bye 👋");
                              break LOOP;
                        default:
                              displayError();
                  }
                  displaySeparator();
            }
      }

      private static void displayWelcome() {
            System.out.println("\t\tWelcome to Sky Reservation System");
      }

      private static int getChoise(Scanner in) {
            System.out.println("\t\tEnter your choice (1 - 6) ?");
            int c = in.nextInt();
            return c;
      }

      private static void displayMenu() {
            System.out.println("choose\n"
                    + "1. To reserve one economy seat\n"
                    + "2. To reserve one first class seat \n"
                    + "3. To remove one reserved economy seat\n"
                    + "4. To remove one reserved first class seat\n"
                    + "5. To print reservation details\n"
                    + "6. To exit\n"
            );
      }

      private static boolean[] reserveSeat(Scanner in, boolean[] seats, char seatType) {
            displayDetails(seats, seatType);
            if ( isAllSeatsReserved(seats) ) {
                  System.out.println("All " + (seatType == 'E' ? "economy " : "first class ") + "seats are sold out");
            } else {
                  boolean reserved = true;
                  System.out.println("Enter the seat number");
                  int num = in.nextInt() - 1;
                  if ( num < 0 || num >= seats.length ) {
                        displayError();
                  } else if ( seats[num] == reserved ) {
                        System.out.println("The seat has been reserved before");
                  } else {
                        seats[num] = true;
                        System.out.println("The reservation is successful");
                  }
                  displayNumberOfReservedSeats(seats);
            }
            return seats;
      }

      private static boolean[] removeSeat(Scanner in, boolean[] seats, char seatType) {
            displayDetails(seats, seatType);

            boolean reserved = true;
            System.out.println("Enter the seat number");
            int num = in.nextInt() - 1;
            if ( num < 0 || num >= seats.length ) {
                  displayError();
            } else if ( seats[num] == reserved ) {
                  seats[num] = false;
                  System.out.println("The remove reservation is successful");
            } else {
                  System.out.println("The seats has not been reserved");
            }
            displayNumberOfReservedSeats(seats);
            return seats;
      }

      private static void displayDetails(boolean[] firstClassSeats, boolean[] economySeats) {
            displayDetails(firstClassSeats, 'F');
            System.out.println("----------\t----------");
            displayDetails(economySeats, 'E');
      }

      private static void displayDetails(boolean[] seats, char seatType) {
            String green = "\033[2;32m";
            String red = "\033[2;31m";
            String resetColor = "\033[0m";
            for ( int i = 0; i < seats.length; i++ ) {
                  if ( i == 0 ) {
                  } else if ( i % 4 == 0 ) {
                        System.out.print("\n");
                  } else if ( i % 2 == 0 ) {
                        System.out.print("\t");
                  }
                  System.out.print(seats[i] ? red : green);
                  System.out.printf("%c%02d ", seatType, (i + 1));
                  System.out.print(resetColor);
            }
            System.out.println();
      }
// \033[2;31m red
// \033[2;32m green

/////////////////////////////////////
      private static boolean isAllSeatsReserved(boolean[] seats) {
            for ( boolean seatReserved: seats ) {
                  if ( !seatReserved ) {
                        return false;
                  }
            }
            return true;
      }

      private static int displayNumberOfReservedSeats(boolean[] seats) {
            int count = 0;
            for ( boolean seatReserved: seats ) {
                  if ( seatReserved ) {
                        count++;
                  }
            }
            System.out.println("Reserved Seats  [ " + count + " ]");
            return count;
      }

      private static void displaySeparator() {
            System.out.println("==============================");
      }

      private static void displayError() {
            System.out.println("Wrong Input !!");
      }
/////////////////////////////////////

}
