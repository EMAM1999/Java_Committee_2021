/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.R29F;

public class TestProject {  // score = 99%

      /**
       @param args the command line arguments
       */
      public static void main(String[] args) {
            Department d = new Department(1, " sales");
            salariedEmployee s = new salariedEmployee(1500, 500, 50, "Mohamed", 1000, " Tanta ", Gender.male);
            d.addEmployee(s);
            HourlyEmployee h = new HourlyEmployee(60, 5, "Ahmed", 1100, "saudi", Gender.male);
            d.addEmployee(h);
            commissionEmployee c = new commissionEmployee(150.5, 0.5, "Reham", 5, "Tanta", Gender.female);
            d.addEmployee(c);
            System.out.println(d.getEmployeesNmber());
            d.removeEmployee(2);
            d.printBasicData();
            d.printAllData();

      }

}
