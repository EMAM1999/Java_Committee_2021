/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;
import java.util.ArrayList;
import java.util.Date;

/**

 @author EMAM
 */
public class Trip {

      private final int FlightNumber;
      private final String fromAirportName;
      private final String toAirportName;
      private final double tripDistance;
      private final Date departureTime;
      private final Date arrivalTime;

      private final Seat[][] seats = new Seat[][] {
            { new FirstClassSeat(1, 'A'), new FirstClassSeat(1, 'C'), new FirstClassSeat(1, 'D'), new FirstClassSeat(1, 'F') },
            { new FirstClassSeat(2, 'A'), new FirstClassSeat(2, 'C'), new FirstClassSeat(2, 'D'), new FirstClassSeat(2, 'F') },
            { new FirstClassSeat(3, 'A'), new FirstClassSeat(3, 'C'), new FirstClassSeat(3, 'D'), new FirstClassSeat(3, 'F') },
            { new EconomySeat(6, 'A'), new EconomySeat(6, 'B'), new EconomySeat(6, 'C'), new EconomySeat(6, 'D'), new EconomySeat(6, 'E'), new EconomySeat(6, 'F') },
            { new EconomySeat(7, 'A'), new EconomySeat(7, 'B'), new EconomySeat(7, 'C'), new EconomySeat(7, 'D'), new EconomySeat(7, 'E'), new EconomySeat(7, 'F') },
            { new EconomySeat(8, 'A'), new EconomySeat(8, 'B'), new EconomySeat(8, 'C'), new EconomySeat(8, 'D'), new EconomySeat(8, 'E'), new EconomySeat(8, 'F') },
            { new EconomySeat(9, 'A'), new EconomySeat(9, 'B'), new EconomySeat(9, 'C'), new EconomySeat(9, 'D'), new EconomySeat(9, 'E'), new EconomySeat(9, 'F') },
            { new EconomySeat(10, 'A'), new EconomySeat(10, 'B'), new EconomySeat(10, 'C'), new EconomySeat(10, 'D'), new EconomySeat(10, 'E'), new EconomySeat(10, 'F') },
            { new EconomySeat(11, 'A'), new EconomySeat(11, 'B'), new EconomySeat(11, 'C'), new EconomySeat(11, 'D'), new EconomySeat(11, 'E'), new EconomySeat(11, 'F') },
            { new EconomySeat(12, 'A'), new EconomySeat(12, 'B'), new EconomySeat(12, 'C'), new EconomySeat(12, 'D'), new EconomySeat(12, 'E'), new EconomySeat(12, 'F') },
            { new EconomySeat(14, 'A'), new EconomySeat(14, 'B'), new EconomySeat(14, 'C'), new EconomySeat(14, 'D'), new EconomySeat(14, 'E'), new EconomySeat(14, 'F') },
            { new EconomySeat(15, 'A'), new EconomySeat(15, 'B'), new EconomySeat(15, 'C'), new EconomySeat(15, 'D'), new EconomySeat(15, 'E'), new EconomySeat(15, 'F') },
            { new EconomySeat(16, 'A'), new EconomySeat(16, 'B'), new EconomySeat(16, 'C'), new EconomySeat(16, 'D'), new EconomySeat(16, 'E'), new EconomySeat(16, 'F') },
            { new EconomySeat(17, 'A'), new EconomySeat(17, 'B'), new EconomySeat(17, 'C'), new EconomySeat(17, 'D'), new EconomySeat(17, 'E'), new EconomySeat(17, 'F') },
            { new EconomySeat(18, 'A'), new EconomySeat(18, 'B'), new EconomySeat(18, 'C'), new EconomySeat(18, 'D'), new EconomySeat(18, 'E'), new EconomySeat(18, 'F') },
            { new EconomySeat(19, 'A'), new EconomySeat(19, 'B'), new EconomySeat(19, 'C'), new EconomySeat(19, 'D'), new EconomySeat(19, 'E'), new EconomySeat(19, 'F') },
            { new EconomySeat(20, 'A'), new EconomySeat(20, 'B'), new EconomySeat(20, 'C'), new EconomySeat(20, 'D'), new EconomySeat(20, 'E'), new EconomySeat(20, 'F') },
            { new EconomySeat(21, 'A'), new EconomySeat(21, 'B'), new EconomySeat(21, 'C'), new EconomySeat(21, 'D'), new EconomySeat(21, 'E'), new EconomySeat(21, 'F') },
            { new EconomySeat(22, 'A'), new EconomySeat(22, 'B'), new EconomySeat(22, 'C'), new EconomySeat(22, 'D'), new EconomySeat(22, 'E'), new EconomySeat(22, 'F') },
            { new EconomySeat(23, 'A'), new EconomySeat(23, 'B'), new EconomySeat(23, 'C'), new EconomySeat(23, 'D'), new EconomySeat(23, 'E'), new EconomySeat(23, 'F') },
            { new EconomySeat(24, 'A'), new EconomySeat(24, 'B'), new EconomySeat(24, 'C'), new EconomySeat(24, 'D'), new EconomySeat(24, 'E'), new EconomySeat(24, 'F') },
            { new EconomySeat(25, 'A'), new EconomySeat(25, 'B'), new EconomySeat(25, 'C'), new EconomySeat(25, 'D'), new EconomySeat(25, 'E'), new EconomySeat(25, 'F') },
            { new EconomySeat(26, 'A'), new EconomySeat(26, 'B'), new EconomySeat(26, 'C'), new EconomySeat(26, 'D'), new EconomySeat(26, 'E'), new EconomySeat(26, 'F') },
            { new EconomySeat(27, 'A'), new EconomySeat(27, 'B'), new EconomySeat(27, 'C'), new EconomySeat(27, 'D'), new EconomySeat(27, 'E'), new EconomySeat(27, 'F') },
            { new EconomySeat(28, 'A'), new EconomySeat(28, 'B'), new EconomySeat(28, 'C'), new EconomySeat(28, 'D'), new EconomySeat(28, 'E'), new EconomySeat(28, 'F') },
            { new EconomySeat(29, 'A'), new EconomySeat(29, 'B'), new EconomySeat(29, 'C'), new EconomySeat(29, 'D'), new EconomySeat(29, 'E'), new EconomySeat(29, 'F') },
            { new EconomySeat(30, 'A'), new EconomySeat(30, 'B'), new EconomySeat(30, 'C'), new EconomySeat(30, 'D'), new EconomySeat(30, 'E'), new EconomySeat(30, 'F') },
            { new EconomySeat(31, 'A'), new EconomySeat(31, 'B'), new EconomySeat(31, 'C'), new EconomySeat(31, 'D'), new EconomySeat(31, 'E'), new EconomySeat(31, 'F') } };

      public Trip(int _FlightNumber, String _fromAirportName, String _toAirportName, double _tripDistance, Date _departureTime, Date _arrivalTime) {
            this.FlightNumber = _FlightNumber;
            this.fromAirportName = _fromAirportName;
            this.toAirportName = _toAirportName;
            this.tripDistance = _tripDistance;
            this.departureTime = _departureTime;
            this.arrivalTime = _arrivalTime;
      }

      public Date getArrivalTime() {
            return arrivalTime;
      }

      public Date getDepartureTime() {
            return departureTime;
      }

      public int getFlightNumber() {
            return FlightNumber;
      }

      public String getFromAirportName() {
            return fromAirportName;
      }

      public int getReservedSeatsNum() {
            return getReservedSeats().size();
      }

      public Seat[][] getSeats() {
            return seats;
      }

      public Seat getSeat(String seatNum, boolean lastName) {
            for ( Seat[] raw: seats ) {
                  for ( Seat seat: raw ) {
                        if ( lastName && seat.getPassenger().getLastName().equalsIgnoreCase(seatNum) ) {
                              return seat;
                        } else if ( !lastName && seat.getSeatNumber().equalsIgnoreCase(seatNum) ) {
                              return seat;
                        }
                  }
            }
            return null;
      }

      public String getToAirportName() {
            return toAirportName;
      }

      public double getTripDistance() {
            return tripDistance;
      }

      public boolean unReserveSeat(String passengerLastName) {
            Seat seat = getSeat(passengerLastName, true);
            if ( seat == null ) {
                  return false;
            }
            seat.setPassenger(null);
            return true;
      }

      public boolean reserveSeat(String seatNum, Passenger passenger) {
            Seat seat = getSeat(seatNum, false);
            if ( seat == null ) {
                  return false;
            }
            if ( seat.isReserved() ) {
                  return false;
            }
            seat.setPassenger(passenger);
            return true;
      }

      public Seat nextUnreservedFirstClassSeat() {
            for ( int i = 0; i < 3; i++ ) {
                  for ( Seat seat: seats[i] ) {
                        if ( !seat.isReserved() ) {
                              return seat;
                        }
                  }
            }
            return null;
      }

      public Seat nextUnreservedEconomySeat() {
            for ( int i = 3; i < seats.length; i++ ) {
                  for ( Seat seat: seats[i] ) {
                        if ( !seat.isReserved() ) {
                              return seat;
                        }
                  }
            }
            return null;

      }

      public boolean isReserved(String _seatNum) {
            Seat seat = getSeat(_seatNum, false);
            return seat != null && seat.isReserved();
      }

      @Override
      public String toString() {
            return "Trip {"
                    + "Flight Number " + getFlightNumber() + ", "
                    + "From : " + getFromAirportName() + ", "
                    + "To : " + getToAirportName() + ", "
                    + "Departure Time : " + getDepartureTime() + ", "
                    + "Arraival time : " + getArrivalTime() + ", "
                    + "Distance : " + getTripDistance() + "}";
      }

      public ArrayList<Seat> getReservedSeats() {
            ArrayList<Seat> reservedSeats = new ArrayList<>();
            for ( Seat[] raw: seats ) {
                  for ( Seat seat: raw ) {
                        if ( seat.isReserved() ) {
                              reservedSeats.add(seat);
                        }
                  }
            }
            return reservedSeats;
      }

}
