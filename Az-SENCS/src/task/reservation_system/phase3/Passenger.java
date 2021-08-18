/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;
import java.util.Date;

/**

 @author EMAM
 */
public class Passenger extends Person {

      public static final String SEAT_WINDOW = "Window";
      public static final String SEAT_AISLE = "Aisle";
      public static final String SEAT_NONE = "None";

      private String passportNumber;
      private String nationality;
      private boolean hasValidVISA;
      // could be Window, Aisle(رمم), or None
      private String flightSeatPreference;

      public Passenger(String _firstName, String _lastName, String _gender, Date _dateOfBirth, String _passportNumber, String _Nationality, boolean _hasValidVISA) {
            super(_firstName, _lastName, _gender, _dateOfBirth);
            this.passportNumber = _passportNumber;
            this.nationality = _Nationality;
            this.hasValidVISA = _hasValidVISA;
      }

      public Passenger(String _firstName, String _lastName, String _gender, Date _dateOfBirth, String _passportNumber, String _Nationality, boolean _hasValidVISA, String _flightSeatPreference) {
            this(_firstName, _lastName, _gender, _dateOfBirth, _passportNumber, _Nationality, _hasValidVISA);
            this.flightSeatPreference = _flightSeatPreference;
      }

      public String getFlightSeatPreference() {
            return flightSeatPreference;
      }

      public void setFlightSeatPreference(String _flightSeatPreference) {
            this.flightSeatPreference = _flightSeatPreference;
      }

      public String getNationality() {
            return nationality;
      }

      public String getPassportNumber() {
            return passportNumber;
      }

      public boolean isHasValidVISA() {
            return hasValidVISA;
      }

      @Override
      public String toString() {
            return "Passenger {"
                    + super.toString() + ", "
                    + "passport number :: " + passportNumber + ", "
                    + "nationality :: " + nationality + ", "
                    + "has valid VISA :: " + hasValidVISA + ", "
                    + "flight seat preference :: " + flightSeatPreference + "}";
      }

}
