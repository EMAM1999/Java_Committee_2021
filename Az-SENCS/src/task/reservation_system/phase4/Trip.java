package task.reservation_system.phase4;
import java.util.Calendar;

public class Trip implements Comparable<Trip> {

      private Seat[][] seats = {
            { new FirstClass("A1"), new FirstClass("C1"), new FirstClass("D1"), new FirstClass("F1") },
            { new FirstClass("A2"), new FirstClass("C2"), new FirstClass("D2"), new FirstClass("F2") },
            { new FirstClass("A3"), new FirstClass("C3"), new FirstClass("D3"), new FirstClass("F3") },
            { new EconomyClass("A6"), new EconomyClass("B6"), new EconomyClass("C6"), new EconomyClass("D6"), new EconomyClass("E6"), new EconomyClass("F6") },
            { new EconomyClass("A7"), new EconomyClass("B7"), new EconomyClass("C7"), new EconomyClass("D7"), new EconomyClass("E7"), new EconomyClass("F7") },
            { new EconomyClass("A8"), new EconomyClass("B8"), new EconomyClass("C8"), new EconomyClass("D8"), new EconomyClass("E8"), new EconomyClass("F8") },
            { new EconomyClass("A9"), new EconomyClass("B9"), new EconomyClass("C9"), new EconomyClass("D9"), new EconomyClass("E9"), new EconomyClass("F9") },
            { new EconomyClass("A10"), new EconomyClass("B10"), new EconomyClass("C10"), new EconomyClass("D10"), new EconomyClass("E10"), new EconomyClass("F10") },
            { new EconomyClass("A11"), new EconomyClass("B11"), new EconomyClass("C11"), new EconomyClass("D11"), new EconomyClass("E11"), new EconomyClass("F11") },
            { new EconomyClass("A12"), new EconomyClass("B12"), new EconomyClass("C12"), new EconomyClass("D12"), new EconomyClass("E12"), new EconomyClass("F12") },
            { new EconomyClass("A14"), new EconomyClass("B14"), new EconomyClass("C14"), new EconomyClass("D14"), new EconomyClass("E14"), new EconomyClass("F14") },
            { new EconomyClass("A15"), new EconomyClass("B15"), new EconomyClass("C15"), new EconomyClass("D15"), new EconomyClass("E15"), new EconomyClass("F15") },
            { new EconomyClass("A16"), new EconomyClass("B16"), new EconomyClass("C16"), new EconomyClass("D16"), new EconomyClass("E16"), new EconomyClass("F16") },
            { new EconomyClass("A17"), new EconomyClass("B17"), new EconomyClass("C17"), new EconomyClass("D17"), new EconomyClass("E17"), new EconomyClass("F17") },
            { new EconomyClass("A18"), new EconomyClass("B18"), new EconomyClass("C18"), new EconomyClass("D18"), new EconomyClass("E18"), new EconomyClass("F18") },
            { new EconomyClass("A19"), new EconomyClass("B19"), new EconomyClass("C19"), new EconomyClass("D19"), new EconomyClass("E19"), new EconomyClass("F19") },
            { new EconomyClass("A20"), new EconomyClass("B20"), new EconomyClass("C20"), new EconomyClass("D20"), new EconomyClass("E20"), new EconomyClass("F20") },
            { new EconomyClass("A21"), new EconomyClass("B21"), new EconomyClass("C21"), new EconomyClass("D21"), new EconomyClass("E21"), new EconomyClass("F21") },
            { new EconomyClass("A22"), new EconomyClass("B22"), new EconomyClass("C22"), new EconomyClass("D22"), new EconomyClass("E22"), new EconomyClass("F22") },
            { new EconomyClass("A23"), new EconomyClass("B23"), new EconomyClass("C23"), new EconomyClass("D23"), new EconomyClass("E23"), new EconomyClass("F23") },
            { new EconomyClass("A24"), new EconomyClass("B24"), new EconomyClass("C24"), new EconomyClass("D24"), new EconomyClass("E24"), new EconomyClass("F24") },
            { new EconomyClass("A25"), new EconomyClass("B25"), new EconomyClass("C25"), new EconomyClass("D25"), new EconomyClass("E25"), new EconomyClass("F25") },
            { new EconomyClass("A26"), new EconomyClass("B26"), new EconomyClass("C26"), new EconomyClass("D26"), new EconomyClass("E26"), new EconomyClass("F26") },
            { new EconomyClass("A27"), new EconomyClass("B27"), new EconomyClass("C27"), new EconomyClass("D27"), new EconomyClass("E27"), new EconomyClass("F27") },
            { new EconomyClass("A28"), new EconomyClass("B28"), new EconomyClass("C28"), new EconomyClass("D28"), new EconomyClass("E28"), new EconomyClass("F28") },
            { new EconomyClass("A29"), new EconomyClass("B29"), new EconomyClass("C29"), new EconomyClass("D29"), new EconomyClass("E29"), new EconomyClass("F29") },
            { new EconomyClass("A30"), new EconomyClass("B30"), new EconomyClass("C30"), new EconomyClass("D30"), new EconomyClass("E30"), new EconomyClass("F30") },
            { new EconomyClass("A31"), new EconomyClass("B31"), new EconomyClass("C31"), new EconomyClass("D31"), new EconomyClass("E31"), new EconomyClass("F31") } };

      private String tripNumber;
      private String from;
      private String to;
      private Calendar date;

      public Trip(String tripNumber, String from, String to, Calendar date) {
            this.tripNumber = tripNumber;
            this.from = from;
            this.to = to;
            this.date = date;
      }

      public Calendar getDate() {
            return date;
      }

      public String getFrom() {
            return from;
      }

      public Seat[][] getSeats() {
            return seats;
      }

      public String getTo() {
            return to;
      }

      public String getTripNumber() {
            return tripNumber;
      }

      @Override
      public String toString() {
            return "seats" + seats + "trip number" + tripNumber + "from" + from + "to" + to + "date" + date;
      }

      public void reserveSeat(String seatNumber, Passenger passenger) {

      }

      @Override
      public int compareTo(Trip trip) {
            return this.getTripNumber().compareToIgnoreCase(trip.getTripNumber());
      }

      public boolean isSeatEmpty(String seatNumber) {
            Seat seat = getSeat(seatNumber);
            return (seat == null || seat.getPassenger() == null);
      }

      public Seat getSeat(String seatNumber) {
            seatNumber = seatNumber.trim();
            for ( Seat[] seatRaw: seats ) {
                  for ( Seat seat: seatRaw ) {
                        if ( seat.getSeatNumber().equalsIgnoreCase(seatNumber) ) {
                              return seat;
                        }
                  }
            }
            return null;
      }

}
