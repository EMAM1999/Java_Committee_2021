/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;
import java.util.Scanner;

/**

 @author EMAM
 */
public class FlightSeatReservationSystem {

      static String green = "\033[2;32m";
      static String red = "\033[2;31m";
      static String resetColor = "\033[0m";

      static Scanner in = new Scanner(System.in);
      static Passenger[][] economySeats = new Passenger[25][6];
      static Passenger[][] businessSeats = new Passenger[3][4];

      public static void main(String[] args) {
            displayWelcome();
LOOP:       while ( true ) {
                  displayMenu();
                  int c = getChoise(in);
                  displaySeatsDetails();
                  switch ( c ) {
                        case 1: System.out.println("Reserve One Seat");
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
                  displaySeparator();
            }
      }

      private static void displayWelcome() {
            System.out.println("\t\tWelcome to Sky Reservation System");
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

      private static void displayBusinessSeatsDetails() {
            char characters[] = { 'A', 'C', 'D', 'F' };
            for ( int i = 0; i < businessSeats.length; i++ ) {
                  for ( int j = 0; j < businessSeats[i].length; j++ ) {
                        System.out.print(businessSeats[i][j] == null ? green : red);
                        System.out.printf("%c%02d%s", characters[j], (i + 1), (j == 1 ? "      " : "    "));
                        System.out.print(resetColor);
                  }
                  System.out.println("");
            }
      }

      private static void displayEconomySeatsDetails() {
            char characters[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
            int blus = 6;
            for ( int i = 0; i < economySeats.length; i++ ) {
                  if ( i + blus == 13 ) {
                        blus++;
                  }
                  for ( int j = 0; j < economySeats[i].length; j++ ) {
                        System.out.print(economySeats[i][j] == null ? green : red);
                        System.out.printf("%c%02d%s", characters[j], (i + blus), (j == 2 ? "    " : " "));
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

      private static void reserveBusinessSeat() {
            displayBusinessSeatsDetails();
            if ( isAllSeatsReserved(businessSeats) ) {
                  System.out.println("All business seats are sold out");
            } else {
                  System.out.println("Enter the seat number");
                  String num = in.next().toUpperCase();
                  int[] indexes = seatNumToIndexes(num);
                  if ( indexes == null ) {
                        displayError();
                  } else {
                        int i = indexes[0];
                        int j = indexes[1];
                        if ( businessSeats[i][j] != null ) {
                              System.out.println("The seat has been reserved before");
                        } else {
                              Passenger passenger = getNewPassenger();
                              businessSeats[i][j] = passenger;
                              System.out.println("The reservation is successful");
                        }
                  }
            }
//            displayNumberOfReservedSeats(seats);
      }

      private static void reserveEconomySeat() {
            displayEconomySeatsDetails();
            if ( isAllSeatsReserved(economySeats) ) {
                  System.out.println("All business seats are sold out");
            } else {
                  System.out.println("Enter the seat number");
                  String num = in.next().toUpperCase();
                  int[] indexes = seatNumToIndexes(num);
                  if ( indexes == null ) {
                        displayError();
                  } else {
                        int i = indexes[0];
                        int j = indexes[1];
                        if ( economySeats[i][j] != null ) {
                              System.out.println("The seat has been reserved before");
                        } else {
                              Passenger passenger = getNewPassenger();
                              economySeats[i][j] = passenger;
                              System.out.println("The reservation is successful");
                        }
                  }
            }
//            displayNumberOfReservedSeats(seats);
      }

      private static void reserveSeat() {
            System.out.println("1. business\n2. economy");
            String n = in.next();
            switch ( n ) {
                  case "1": reserveBusinessSeat();
                        break;
                  case "2": reserveEconomySeat();
                        break;
                  default:
                        displayError();
            }
      }

      private static void displaySeatsDetails() {
            displayBusinessSeatsDetails();
            System.out.println("----------\t----------");
            displayEconomySeatsDetails();
      }

      private static boolean isAllSeatsReserved(Passenger[][] seats) {
            for ( Passenger[] seatRaw: seats ) {
                  for ( Passenger seatReserved: seatRaw ) {
                        if ( seatReserved == null ) {
                              return false;
                        }
                  }
            }
            return true;
      }

      private static void displaySeparator() {
            System.out.println("==============================");
      }

      private static void displayError() {
            System.out.println("Wrong Input !!");
      }

      private static void searchPassenger(String by) {
            switch ( by ) {
                  case "seat": {
                        System.out.println("Enter the seat number");
                        String num = in.next();
                        int indexs[] = seatNumToIndexes(num);
                        if ( indexs == null ) {
                              displayError();
                        } else {
                              int i = indexs[0];
                              int j = indexs[1];
                              switch ( indexs[2] ) {
                                    case 1:
                                          if ( businessSeats[i][j] == null ) {
                                                System.out.println("No Passenger reserved in " + num);
                                          } else {
                                                businessSeats[i][j].printInfo();
                                          }
                                          break;
                                    case 2:
                                          if ( economySeats[i][j] == null ) {
                                                System.out.println("No Passenger reserved in " + num);
                                          } else {
                                                economySeats[i][j].printInfo();
                                          }
                              }
                        }
                  }
                  break;
                  case "name": {
                        System.out.println("Enter name :: ");
                        String name = in.next();
                        for ( Passenger[] raw: businessSeats ) {
                              for ( Passenger passenger: raw ) {
                                    if ( passenger != null
                                            && (passenger.getFirstName().equalsIgnoreCase(name)
                                            || passenger.getLastName().equalsIgnoreCase(name)) ) {
                                          passenger.printInfo();
                                          return;
                                    }
                              }
                        }
                        for ( Passenger[] raw: economySeats ) {
                              for ( Passenger passenger: raw ) {
                                    if ( passenger != null
                                            && (passenger.getFirstName().equalsIgnoreCase(name)
                                            || passenger.getLastName().equalsIgnoreCase(name)) ) {
                                          passenger.printInfo();
                                          return;
                                    }
                              }
                        }
                  }
                  break;
                  case "passport": {
                        System.out.println("Enter passport number :: ");
                        long passport = in.nextLong();
                        for ( Passenger[] raw: businessSeats ) {
                              for ( Passenger passenger: raw ) {
                                    if ( passenger != null && passenger.getPassportNumber() == passport ) {
                                          passenger.printInfo();
                                          return;
                                    }
                              }
                        }
                        for ( Passenger[] raw: economySeats ) {
                              for ( Passenger passenger: raw ) {
                                    if ( passenger != null && passenger.getPassportNumber() == passport ) {
                                          passenger.printInfo();
                                          return;
                                    }
                              }
                        }
                  }
                  break;
                  case "all": {
                        char[] characters = { 'A', 'C', 'D', 'F' };
                        for ( int i = 0; i < businessSeats.length; i++ ) {
                              for ( int j = 0; j < businessSeats[i].length; j++ ) {
                                    System.out.println("(" + characters[j] + (i + 1) + ")");
                                    businessSeats[i][j].printInfo();
                              }
                        }
                        for ( int i = 0; i < economySeats.length; i++ ) {
                              for ( int j = 0; j < economySeats[i].length; j++ ) {
                                    System.out.println("(" + ('A' + j) + (i + 1) + ")");
                                    economySeats[i][j].printInfo();
                              }
                        }
                  }
                  break;
                  default:
                        throw new IllegalArgumentException(by);
            }
      }

      private static int[] seatNumToIndexes(String num) {
            if ( num == null || num.length() < 2 ) {
                  return null;
            }
            int business = 1;
            int economy = 2;
            int type = 0;
            num = num.toUpperCase();
            int i = Integer.parseInt(num.substring(1));
            int j = 0;
            if ( i >= 1 && i <= 3 ) {
                  type = business;
                  i--;
                  switch ( num.charAt(0) ) {
                        case 'F': j++;
                        case 'D': j++;
                        case 'C': j++;
                        case 'A': break;
                        default:
                              return null;
                  }
            } else if ( i >= 6 && i <= 31 || i != 13 ) {
                  type = economy;
                  i -= 6;
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
            return new int[] { i, j, type };
      }
}
