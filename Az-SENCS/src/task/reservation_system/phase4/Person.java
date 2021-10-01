package task.reservation_system.phase4;

public abstract class Person {

      private String name;

      protected Person(String name) {
            this.name = name;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      @Override
      public String toString() {

            return " name " + name;
      }

}
