/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision_on_oop;

/**
 *
 * @author abdoe
 */
public class CommissionEmployee extends Employee implements Displayable{
    double Gross_sales;
    double Commission_rate;

    public CommissionEmployee() {
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "Gross_sales=" + Gross_sales + ", Commission_rate=" + Commission_rate + '}';
    }

    public CommissionEmployee(double Gross_sales, double Commission_rate, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.Gross_sales = Gross_sales;
        this.Commission_rate = Commission_rate;
    }

    public double getGross_sales() {
        return Gross_sales;
    }

    public void setGross_sales(double Gross_sales) {
        this.Gross_sales = Gross_sales;
    }

    public double getCommission_rate() {
        return Commission_rate;
    }

    public void setCommission_rate(double Commission_rate) {
        this.Commission_rate = Commission_rate;
    }
    
    public double Earning()
    {
    return Gross_sales* Commission_rate;
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
