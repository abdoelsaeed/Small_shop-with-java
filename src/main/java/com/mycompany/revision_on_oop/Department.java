/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision_on_oop;
import java.util.ArrayList;
public class Department {
    int dno;
    String dname;
    ArrayList<Employee> emplist;

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
       emplist=new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void add_employee(Employee e)
    {
     emplist.add(e);
    }
    
    public void remove_employee(int x)
    {
    emplist.remove(x);
    }
    public int getemployeeaccount()
    {
    return emplist.size();
    }
    
    public void print_basic_data()
    {
    for(int i=0;i<emplist.size();i++)
    {
    System.out.println("{ ID = "+emplist.get(i).getSSN()+" , Name = "+emplist.get(i).getName()+" , Adress = "+emplist.get(i).getAddress()+"}");
    }
    }
    
    public void print_all_details()
    {
    for(int i=0;i<emplist.size();i++)
    {
    if(emplist.get(i) instanceof Salaried_Employee)
    
       ( (Salaried_Employee)emplist.get(i)).Displayalldetails();
    
    if(emplist.get(i) instanceof Hourly_Employee)   
   ( (Hourly_Employee)emplist.get(i)).Displayalldetails();
    
    if(emplist.get(i) instanceof CommissionEmployee)
    (    (CommissionEmployee)emplist.get(i)).Displayalldetails();
    }   
    }
    
}
