/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revision_on_oop;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
      Department r1=new Department(1,"Information tecnology");
      
      Salaried_Employee se=new Salaried_Employee(3000,500,200,"mohamed",112,"Cairo",Gender.Male);
      r1.add_employee(se);
      
         
      Hourly_Employee he=new Hourly_Employee(1,3,"ahmed",146,"bani suef",Gender.Male);
      r1.add_employee(he);
      
      CommissionEmployee ce=new CommissionEmployee(10000,35000,"Fatma",389,"Giza",Gender.Female);
      r1.add_employee(ce);
      
      /*//////////////////////////////////////////////////////////////////////////////////////////*/
      
      Department r2=new Department(2,"Computer Scenice");
      
       Salaried_Employee see=new Salaried_Employee(9000,400,600,"Abdelrahman",111,"Cairo",Gender.Male);
      r2.add_employee(see);
      
      Department r3=new Department(3,"Information System");
       Hourly_Employee hee=new Hourly_Employee(1,3,"Amr",888,"bani suef",Gender.Male);
      r2.add_employee(hee);
      Hourly_Employee hewe=new Hourly_Employee(1,3,"Amr",888,"bani suef",Gender.Male);
      r2.add_employee(hee);
       Hourly_Employee here=new Hourly_Employee(1,3,"Amr",888,"bani suef",Gender.Male);
      r2.add_employee(hee);
      CommissionEmployee cee=new CommissionEmployee(10000,35000,"Sara",777,"Giza",Gender.Female);
      r2.add_employee(cee);
      
    /*//////////////////////////////////////////////////////////////////////////////////////////*/
     
    Salaried_Employee seee=new Salaried_Employee(3000,500,200,"mohamed",987,"Cairo",Gender.Male);
      r3.add_employee(seee);
      
       Salaried_Employee seeee=new Salaried_Employee(3000,500,200,"mohamed",987,"Cairo",Gender.Male);
      r3.add_employee(seee);
      
      Hourly_Employee heee=new Hourly_Employee(1,3,"ahmed",333,"bani suef",Gender.Male);
      r3.add_employee(heee);
      
      CommissionEmployee ceee=new CommissionEmployee(6000,33000,"Mona",444,"Giza",Gender.Female);
      r3.add_employee(ceee);
    
    System.out.println("number of employee on Information technology = "+r1.getemployeeaccount());
    System.out.println("number of employee on Computer Scenice = "+r2.getemployeeaccount());
    System.out.println("number of employee on Information System = "+r3.getemployeeaccount());
    System.out.println("number of All employees = "+(r2.getemployeeaccount()+r3.getemployeeaccount()+r1.getemployeeaccount()));
    System.out.println();
    
    
    r1.print_basic_data();
    r2.print_basic_data();
   r3.print_basic_data();
   System.out.println();
   
   r1.print_all_details();
  
    }
}
