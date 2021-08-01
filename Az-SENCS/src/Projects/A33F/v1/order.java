/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects.A33F.v1;

/**
 *
 * @author Asmaa
 */
public class order {
    int id;
    String date;
    boolean is_paid;
    Person p;
    product pro;

    public order(int id, String date, boolean is_paid, Person p, product pro) {
        this.id = id;
        this.date = date;
        this.is_paid = is_paid;
        this.p = p;
        this.pro = pro;
    }

    public order() {
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public Person getP() {
        return p;
    }

    public product getPro() {
        return pro;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public void setPro(product pro) {
        this.pro = pro;
    }
 public void print()
 {
     System.out.println("date of order is: "+getId()+" "+getDate()+" "+isIs_paid()+" "+getPro()+" "+getP());
 }

    int length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
