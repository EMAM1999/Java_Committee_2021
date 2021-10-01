/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package Projects.oop.R29F;

import java.util.ArrayList;

public class Department {

      int dep_number;
      String dep_name;
      ArrayList<Employee> employeeList;

      public Department() {
      }

      public Department(int dep_number, String dep_name, ArrayList<Employee> employeeList) {
            this.dep_number = dep_number;
            this.dep_name = dep_name;
            this.employeeList = employeeList;
      }

      public Department(int dep_number, String dep_name) {
            this.dep_number = dep_number;
            this.dep_name = dep_name;
            employeeList = new ArrayList<Employee>();
      }

      public String getDep_name() {
            return dep_name;
      }

      public void setDep_name(String dep_name) {
            this.dep_name = dep_name;
      }

      public int getDep_number() {
            return dep_number;
      }

      public void setDep_number(int dep_number) {
            this.dep_number = dep_number;
      }

      public ArrayList<Employee> getEmployeeList() {
            return employeeList;
      }

      public void setEmployeeList(ArrayList<Employee> employeeList) {
            this.employeeList = employeeList;
      }

      public void addEmployee(Employee e) {
            employeeList.add(e);
      }

      public void removeEmployee(int index) {
            employeeList.remove(index);
      }

      public int getEmployeesNmber() {
            return employeeList.size();
      }

      public void printBasicData() {
            for ( int i = 0; i < employeeList.size(); i++ ) {
                  System.out.println(employeeList.get(i).getSsn() + " " + employeeList.get(i).getName() + " "
                          + employeeList.get(i).getGen() + " " + employeeList.get(i).getAddress());
            }
      }

      public void printAllData() {
            for ( int i = 0; i < employeeList.size(); i++ ) {
                  //casting from base class to sub class
                  // type of object ? -> instanceof 
                  if ( employeeList.get(i) instanceof salariedEmployee ) {
                        //casting from employee to salaried employee
                        ((salariedEmployee)employeeList.get(i)).DisplayAllDetails();
                  }
                  if ( employeeList.get(i) instanceof HourlyEmployee ) {
                        //casting from employee to Hourly employee
                        ((HourlyEmployee)employeeList.get(i)).DisplayAllDetails();
                  }
                  if ( employeeList.get(i) instanceof commissionEmployee ) {
                        //casting from employee to commission Employee
                        ((commissionEmployee)employeeList.get(i)).DisplayAllDetails();
                  }
            }
      }
}
