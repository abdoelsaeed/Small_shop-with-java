/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision_on_oop;

/**
 *
 * @author abdoe
 */
public class Hourly_Employee extends Employee implements Displayable{
    double Houre_rate;
    int Number_of_hours;

    public Hourly_Employee() {
    }

    @Override
    public String toString() {
        return "Hourly_Employee{" + "Houre_rate=" + Houre_rate + ", Number_of_hours=" + Number_of_hours + '}';
    }

 

    public Hourly_Employee(double Houre_rate, int Number_of_hours, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.Houre_rate = Houre_rate;
        this.Number_of_hours = Number_of_hours;
    }

    public double getHoure_rate() {
        return Houre_rate;
    }

    public void setHoure_rate(double Houre_rate) {
        this.Houre_rate = Houre_rate;
    }

    public int getNumber_of_hours() {
        return Number_of_hours;
    }

    public void setNumber_of_hours(int Number_of_hours) {
        this.Number_of_hours = Number_of_hours;
    }
    
@Override
   public double Earning()
   {
   return Houre_rate *  Number_of_hours;
   }
    
   public void Displayalldetails()
   {System.out.println(super.toString());
   System.out.println(toString());
   }
    public void DisplayEarning()
    {
        System.out.println("Earning = "+Earning());
    }
}
