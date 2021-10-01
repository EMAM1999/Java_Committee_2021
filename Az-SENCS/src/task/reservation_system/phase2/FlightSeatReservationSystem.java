/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase2;
import java.util.Scanner;

/**

 @author EMAM
 */
public class FlightSeatReservationSystem {

      static String green = "\033[2;32m";
      static String red = "\033[2;31m";
      static String resetColor = "\033[0m";

      static Scanner in = new Scanner(System.in);
      static Passenger[][] seats = {
            { null, null, null, null },
            { null, null, null, null },
            { null, null, null, null },
            {},
            {},
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            {},
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null },
            { null, null, null, null, null, null }, };

      public static void main(String[] args) {
            displayWelcome();
LOOP:       while ( true ) {
                  displayMenu();
                  int c = getChoise(in);
                  System.out.print("\t\t>>> ");
                  switch ( c ) {
                        case 1: System.out.println("Reserve One Seat");
                              displaySeatsDetails();
                              reserveSeat();
                              break;
                        case 2: System.out.println("Display Passenger Info");
                              searchPassenger("seat");
                              break;
                        case 3: System.out.println("Search for a passenger by name");
                              searchPassenger("name");
                              break;
                        case 4: System.out.println("Search for passenger by passport number.");
                              searchPassenger("passport");
                              break;
                        case 5: System.out.println("Passengers List and there seat numbers");
                              searchPassenger("all");
                              break;
                        case 6: System.out.println("Good Bye 👋");
                              break LOOP;
                        default:
                              displayError();
                  }
                  System.out.println("==============================");
            }
      }

      private static void displayWelcome() {
            System.out.println("\t\t>>> Welcome to Sky Reservation System");
      }

      private static void displayMenu() {
            System.out.println("choose\n"
                    + "1. To reserve one seat (economy or business)\n"
                    + "2. To display the passenger information\n"
                    + "3. To search for a passenger by first or last name\n"
                    + "4. To search for passenger by passport number\n"
                    + "5. To print a list of the passengers and there seat numbers\n"
                    + "6. To exit\n"
            );
      }

      private static int getChoise(Scanner in) {
            System.out.println("\t\tEnter your choice (1 - 6) ?");
            int c = in.nextInt();
            return c;
      }

      private static void displaySeatsDetails() {
            char businessCharacters[] = { 'A', 'C', 'D', 'F' };
            for ( int i = 0; i < 3; i++ ) {
                  for ( int j = 0; j < seats[i].length; j++ ) {
                        System.out.print(seats[i][j] == null ? green : red);
                        System.out.printf("%c%02d%s", businessCharacters[j], (i + 1), (j == 1 ? "      " : "    "));
                        System.out.print(resetColor);
                  }
                  System.out.println("");
            }
            char economyCharacters[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
            for ( int i = 3; i < seats.length; i++ ) {
                  for ( int j = 0; j < seats[i].length; j++ ) {
                        System.out.print(seats[i][j] == null ? green : red);
                        System.out.printf("%c%02d%s", economyCharacters[j], (i + 1), (j == 2 ? "    " : " "));
                        System.out.print(resetColor);
                  }
                  System.out.println("");
            }
      }

      private static Passenger getNewPassenger() {
            System.out.println("Enter the first name :: ");
            String firstName = in.next();
            System.out.println("Enter the last name :: ");
            String lastName = in.next();
            System.out.println("Enter the gender (m/f) :: ");
            String gender = in.next();
            System.out.println("Enter the passportNumber :: ");
            long passportNumber = in.nextLong();
            System.out.println("Enter the nationality :: ");
            String nationality = in.next();
            System.out.println("Has visa ?? ");
            boolean visa = in.nextBoolean();
            return new Passenger(firstName, lastName, gender, passportNumber, nationality, visa);
      }

      private static String indexesToSeatNum(int i, int j) {
            String seatNum = "" + (i + 1);
            String seatChar = "";
            String type = "";
            if ( i < 3 ) {
                  String[] chars = { "A", "C", "D", "F" };
                  type = "business";
                  seatChar = chars[j];
            } else {
                  type = "economy";
                  seatChar = (char)('A' + j) + "";
            }
            return "(" + seatChar + seatNum + ") <" + type + ">";
      }

      private static void reserveSeat() {
            if ( isAllSeatsReserved() ) {
                  System.out.println("All Seats Reserved");
            } else {
                  System.out.println("Enter Seat Number :: ");
                  String n = in.next();
                  int[] indexes = seatNumToIndexes(n);
                  if ( indexes == null ) {
                        displayError();
                  } else {
                        int i = indexes[0];
                        int j = indexes[1];
                        if ( seats[i][j] != null ) {
                              System.out.println("The seat has been reserved before");
                        } else {
                              seats[i][j] = getNewPassenger();
                        }
                  }
            }
      }

      private static boolean isAllSeatsReserved() {
            for ( Passenger[] seatRaw: seats ) {
                  for ( Passenger seatReserved: seatRaw ) {
                        if ( seatReserved == null ) {
                              return false;
                        }
                  }
            }
            return true;
      }

      private static void displayError() {
            System.out.println("Wrong Input !!");
      }

      private static void searchPassenger(String by) {
            switch ( by ) {
                  case "seat": {
                        System.out.println("Enter the seat number");
                        String num = in.next();
                        int indexes[] = seatNumToIndexes(num);
                        if ( indexes == null ) {
                              displayError();
                        } else {
                              int i = indexes[0];
                              int j = indexes[1];
                              if ( seats[i][j] == null ) {
                                    System.out.println("No Passenger reserved in " + num);
                              } else {
                                    seats[i][j].printInfo();
                              }
                        }
                  }
                  break;
                  case "name": {
                        System.out.println("Enter name :: ");
                        String name = in.next();
                        for ( int i = 0; i < seats.length; i++ ) {
                              for ( int j = 0; j < seats[i].length; j++ ) {
                                    if ( seats[i][j] != null
                                            && (seats[i][j].getFirstName().equalsIgnoreCase(name)
                                            || seats[i][j].getLastName().equalsIgnoreCase(name)) ) {
                                          System.out.println("Seat Number :: " + indexesToSeatNum(i, j));
                                          seats[i][j].printInfo();
                                          return;
                                    }
                              }
                        }
                  }
                  break;
                  case "passport": {
                        System.out.println("Enter passport number :: ");
                        long passport = in.nextLong();
                        for ( int i = 0; i < seats.length; i++ ) {
                              for ( int j = 0; j < seats[i].length; j++ ) {
                                    if ( seats[i][j] != null
                                            && seats[i][j].getPassportNumber() == passport ) {
                                          System.out.println("Seat Number :: " + indexesToSeatNum(i, j));
                                          seats[i][j].printInfo();
                                          return;
                                    }
                              }
                        }
                  }
                  break;
                  case "all": {
                        for ( int i = 0; i < seats.length; i++ ) {
                              for ( int j = 0; j < seats[i].length; j++ ) {
                                    if ( seats[i][j] != null ) {
                                          System.out.println("Seat Number :: " + indexesToSeatNum(i, j));
                                          seats[i][j].printInfo();
                                    }
                              }
                        }
                  }
                  break;
            }
      }

      private static int[] seatNumToIndexes(String num) {
            if ( num == null || num.length() < 2 ) {
                  return null;
            }
            num = num.toUpperCase();
            int i = Integer.parseInt(num.substring(1));
            int j = 0;
            if ( i >= 1 && i <= 3 ) {
                  switch ( num.charAt(0) ) {
                        case 'F': j++;
                        case 'D': j++;
                        case 'C': j++;
                        case 'A': break;
                        default:
                              return null;
                  }
            } else if ( i >= 6 && i <= 31 && i != 13 ) {
                  switch ( num.charAt(0) ) {
                        case 'F': j++;
                        case 'E': j++;
                        case 'D': j++;
                        case 'C': j++;
                        case 'B': j++;
                        case 'A': break;
                        default:
                              return null;
                  }
            } else {
                  return null;
            }

            return new int[] { i - 1, j };
      }
}
