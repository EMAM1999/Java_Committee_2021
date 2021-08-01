/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A33F.v1;

//client extend from person becouse it has som commen traits  
public class client extends Person {

      String email;

      public client() {
            super();
      }

      public client(String email, int id, String name, String phone, String Gander) {
            super(id, name, phone, Gander);
            this.email = email;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public void printf() {
            super.print_extra_info();
            System.out.println("Email of client is: " + getEmail());
      }

}
