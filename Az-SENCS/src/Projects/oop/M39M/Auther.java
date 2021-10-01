package Projects.oop.M39M;

public class Auther {

      private static int NumOfObject = 0;
      final int id;
      private String name;
      private String phone;
      private String email;
      private boolean isDeleted;

      public Auther(String name, String phone, String email) {
            NumOfObject++;
            isDeleted = false;
            this.id = NumOfObject;
            this.name = name;
            this.phone = phone;
            this.email = email;
      }

      public void setIsDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
      }

      public boolean isIsDeleted() {
            return isDeleted;
      }

      public String getEmail() {
            return email;
      }

      public int getId() {
            return id;
      }

      public String getName() {
            return name;
      }

      public static int getNumOfObject() {
            return NumOfObject;
      }

      public String getPhone() {
            return phone;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public void setName(String name) {
            this.name = name;
      }

      public void setPhone(String phone) {
            this.phone = phone;
      }

}
