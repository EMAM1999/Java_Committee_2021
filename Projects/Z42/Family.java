/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.Z42;

import java.util.Scanner;


public class Family {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("what is the number of families ? ");
        int num=in.nextInt();
        for(int i=0;i<num;i++){
           
            System.out.print("Enter the name of father : ");
            String name1=in.next();
            System.out.print("Enter the age of father : ");
            int age=in.nextInt();
            System.out.print("Enter the name of wife : ");
            String name2=in.next();
            System.out.print("Enter the number of sons : ");
            int sons=in.nextInt();
            Father father=new Father(name1, age, name2, sons);
            System.out.println("father name is : "+father.getName());
            System.out.println("father age is : "+father.getAge()+"year");
            System.out.println("father wife name : "+father.getNameOfWife());
            System.out.println("muber of sons is : "+father.getCountOfsons());
            
            for(int j=0;j<sons;j++){
                
                System.out.print("Enter the name of son : ");
                String name3=in.next();
                System.out.print("Enter the age of son : ");
                int age2=in.nextInt();
                System.out.print("Enter the educational level of son : ");
                String level=in.next();
                System.out.print("Enter the educational year of son : ");
                String year=in.next();
                Son son=new Son(name3, age2, level, year);
                System.out.println("son name is : "+son.getName());
                System.out.println("son age is : "+son.getAge()+"year");
                System.out.println("son educational level is : "+son.getEducationalLevel());
                System.out.println("son educational year is : "+son.getEducationalYear());
                
            }
        }
    }
}