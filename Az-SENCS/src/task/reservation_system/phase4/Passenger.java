package task.reservation_system.phase4;

public class Passenger extends Person {

      public static final int NONE = 2;
      public static final int WINDOW = 0;
      public static final int ASILE = 1;

      private int seatPref = NONE;
      private long passport;

      public Passenger(String name) {
            super(name);

      }

      public Passenger(String name, long passport) {
            this(name);
            this.passport = passport;
      }

      public Passenger(String name, long passport, int seatPref) {
            this(name, passport);
            this.seatPref = seatPref;
      }

      public int getSeatPref() {
            return seatPref;
      }

      public void setSeatPref(int seatPref) {
            this.seatPref = seatPref;
      }

      public long getPassport() {
            return passport;
      }

      public void setPassport(long passport) {
            this.passport = passport;
      }

      public static int getNone() {
            return NONE;
      }

      public static int getWindow() {
            return WINDOW;
      }

      public static int getAsile() {
            return ASILE;
      }

      @Override
      public String toString() {
            return super.toString() + "passport number" + passport + "seatPref" + seatPref;
      }

}
