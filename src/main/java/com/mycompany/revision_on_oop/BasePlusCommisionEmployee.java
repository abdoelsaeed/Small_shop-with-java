/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision_on_oop;

/**
 *
 * @author abdoe
 */
public class BasePlusCommisionEmployee extends CommissionEmployee{
    double Base;

    public BasePlusCommisionEmployee() {
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" + "Base=" + Base + '}';
    }

    @Override
    public double Earning()
    {
    return Base + super.Earning();
    }
     public void Displayalldetails(){
  super.Displayalldetails();
   DisplayEarning();
   }
    public void DisplayEarning()
    {
        System.out.println("Earning = "+Earning());
    }
}
