/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.reservation_system.phase3;

/**

 @author EMAM
 */
public class EconomySeat extends Seat {

      public static final String FOOD_CHICKEN = "Chicken";
      public static final String FOOD_FISH = "Fish";
      public static final String DRINK_COLA = "Cola";
      public static final String DRINK_JUICE = "Juice";
      // either Chicken or Fish
      private String FoodPreferences;
      // either Cola or Juice
      private String drinkPreferences;

      public EconomySeat(int _rawNumber, char _columnNumber, Passenger _passenger, String _FoodPreferences, String _drinkPreferences) {
            super(_rawNumber, _columnNumber, _passenger);
            this.FoodPreferences = _FoodPreferences;
            this.drinkPreferences = _drinkPreferences;
      }

      public EconomySeat(int _rawNumber, char _columnNumber) {
            super(_rawNumber, _columnNumber);
      }

      public String getFoodPreferences() {
            return FoodPreferences;
      }

      public void setFoodPreferences(String _FoodPreferences) {
            this.FoodPreferences = _FoodPreferences;
      }

      public String getDrinkPreferences() {
            return drinkPreferences;
      }

      public void setDrinkPreferences(String _drinkPreferences) {
            this.drinkPreferences = _drinkPreferences;
      }

      @Override
      public String toString() {
            return "EconomySeat {"
                    + super.toString() + ", "
                    + "Food :: " + getFoodPreferences() + ", "
                    + "Drink :: " + getDrinkPreferences() + "}";
      }

}
