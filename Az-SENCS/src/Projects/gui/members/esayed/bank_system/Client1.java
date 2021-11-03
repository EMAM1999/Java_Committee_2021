package Projects.gui.members.esayed.bank_system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author M.Sabry
 */
import java.util.Date;
public class Client1 {
    private final   String name;
    private final   String email ;
    private final   String phone;
    private final   String password;
    private final   String id;
    static int size;
    private   static int i=253;
    private   static int j=579;
    private Date date=new Date();
    private double seposition;
    private double withdraw;
    public Client1(String name, String email, String phone,double seposition) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.seposition+=seposition;
        size++;
        this.id="(abc*)"+(i++)+"#$@";
        this.password="saA"+(j++)+"_$#@";
        System.out.println("Your id="+id+"\nYour password="+password+"\nDate:"+getDate());
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSeposition() {
        return seposition;
    }

    public void setSeposition(double seposition) {
        this.seposition += seposition;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
    
}
