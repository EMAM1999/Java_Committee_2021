/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.oop.A33F.v1;

/**
 *
 * @author Asmaa
 */
public class employee extends Person {

    float salary;
String working_time;

    public employee(float salary, String working_time) {
        this.salary = salary;
        this.working_time = working_time;
    }

    public employee(int id, String name, String phone, String Gander) {
        super(id, name, phone, Gander);
    }

    public String getWorking_time() {
        return working_time;
    }

    public void setWorking_time(String working_time) {
        this.working_time = working_time;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

   
    public employee()
    {
        super();
    }

    public void printf()
    {
        super.print_extra_info();
        System.out.println("Salary of employee is: "+getSalary()+"\n"+"The Nomber of hours of working is: "+getWorking_time());    }
}
