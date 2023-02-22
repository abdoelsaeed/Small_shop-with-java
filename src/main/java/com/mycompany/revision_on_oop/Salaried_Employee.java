/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision_on_oop;

/**
 *
 * @author abdoe
 */
public class Salaried_Employee extends Employee implements Displayable{
    double Salary;
    double bouns;
    double Deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(double Salary, double bouns, double Deduction, String name, int SSN, String address, Gender sex) {
        super(name, SSN, address, sex);
        this.Salary = Salary;
        this.bouns = bouns;
        this.Deduction = Deduction;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDeduction() {
        return Deduction;
    }

    public void setDeduction(double Deduction) {
        this.Deduction = Deduction;
    }

@Override/*abstract*/
 public double Earning()
 {
     
 return (Salary+bouns)-Deduction;
 }

    @Override
    public String toString() {
        return "Salaried_Employee{" + "Salary=" + Salary + ", bouns=" + bouns + ", Deduction=" + Deduction + '}';
    }
  
 /*inter face*/
    public void Displayalldetails()
    {
    System.out.println(super.toString());
     System.out.println(" "+toString());
    }
    
    public void DisplayEarning()
    {System.out.println("Earning = "+Earning());}
}
