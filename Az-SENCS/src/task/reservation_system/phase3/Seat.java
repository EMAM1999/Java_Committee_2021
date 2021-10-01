/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;

/**

 @author EMAM
 */
public abstract class Seat {

      private int rawNumber;
      private char columnNumber;
      private String seatNumber;
      private Passenger passenger;

      public Seat(int _rawNumber, char _columnNumber) {
            this(_rawNumber, _columnNumber, null);
      }

      public Seat(int _rawNumber, char _columnNumber, Passenger _passenger) {
            this.rawNumber = _rawNumber;
            this.columnNumber = _columnNumber;
            this.seatNumber = this.columnNumber + "" + this.rawNumber;
            this.passenger = _passenger;
      }

      public char getColumnNumber() {
            return columnNumber;
      }

      public Passenger getPassenger() {
            return passenger;
      }

      public void setPassenger(Passenger _passenger) {
            this.passenger = _passenger;
      }

      public int getRawNumber() {
            return rawNumber;
      }

      public String getSeatNumber() {
            return seatNumber;
      }

      @Override
      public String toString() {
            return "Seat {"
                    + "Seat number :: " + getSeatNumber() + ", "
                    + "passenger details :: " + passenger
                    + "}";
      }

      boolean isReserved() {
            return passenger != null;
      }

}
