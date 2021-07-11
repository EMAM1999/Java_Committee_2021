/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.Z42;


public class Person {
    private String name;
    private int age;
    public Person(){//default constructor.
    }
    public Person(String myName,int myAge){
        this.name=myName;
        this.age=myAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
