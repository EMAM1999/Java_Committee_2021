/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A33F.v2;

public class client extends person {

      private String email;

      public client(String email, String phone, String gender, String name) {
            super(phone, gender, name);
            this.email = email;
      }

      public client() {

      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      @Override
      public String toString() {
            super.toString();
            return "email is" + email;
      }

}
