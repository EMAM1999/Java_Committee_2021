package task.reservation_system.phase4;

public abstract class Seat {

      private int rowNumber;
      private int columnNumber;
      private String seatNumber;
      private Passenger passenger;

      protected Seat(String seatNumber) {
            this.seatNumber = seatNumber;
      }

      public int getRowNumber() {
            return rowNumber;
      }

      public void setRowNumber(int rowNumber) {
            this.rowNumber = rowNumber;
      }

      public int getColumnNumber() {
            return columnNumber;
      }

      public void setColumnNumber(int columnNumber) {
            this.columnNumber = columnNumber;
      }

      public String getSeatNumber() {
            return seatNumber;
      }

      public void setSeatNumber(String seatNumber) {
            this.seatNumber = seatNumber;
      }

      public Passenger getPassenger() {
            return passenger;
      }

      public void setPassenger(Passenger passenger) {
            this.passenger = passenger;
      }

      @Override
      public String toString() {
            return "rowNumber" + rowNumber + "columnNumber" + columnNumber + "seatNumber" + seatNumber;
      }

}
