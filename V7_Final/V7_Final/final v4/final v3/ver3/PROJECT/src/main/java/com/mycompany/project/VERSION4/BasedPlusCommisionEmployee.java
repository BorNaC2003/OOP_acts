/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;



/**
 *
 * @author User
 */
public class BasedPlusCommisionEmployee extends CommisionEmployee{
    
    private double baseSalary;


    public BasedPlusCommisionEmployee() {
    }
    
    public BasedPlusCommisionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    

    public BasedPlusCommisionEmployee(double baseSalary, Date dateOfBirth, Date hireDate) {
        this.baseSalary = baseSalary;
        
    }


    public BasedPlusCommisionEmployee(double baseSalary, int empID, Name name, Date dateOfBirth, Date hireDate, double totalSales) {
        super(empID, name, dateOfBirth, hireDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommisionEmployee(double baseSalary, Date dateOfBirth, Date hireDate, double totalSales, int ID, Name name) {
        super(totalSales, ID, name);
        this.baseSalary = baseSalary;
    }
    
    public BasedPlusCommisionEmployee(int ID, Name name) {
        super(ID,name);
    }

    


    // Getters and setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public Date getHireDate() {
        return super.getHireDate(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Date getDateOfBirth() {
        return super.getDateOfBirth(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    

    @Override
    public double computeSalary() {
       
        return super.computeSalary() + this.baseSalary;
    }

    
    public void displayBasedPlusCommisionEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Name: " + getName());
        System.out.println("Date of Birth: " + (getDateOfBirth() != null ? getDateOfBirth().toString() : "null"));
        System.out.println("Hire Date: " + (getHireDate() != null ? getHireDate().toString() : "null"));
        System.out.println("Total Sales: " + getTotalSales());
        System.out.println("Base Salary: " + this.baseSalary);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

    
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nDate of Birth: %s\nHire Date: %s\nTotal Sales: %.2f\nBase Salary: %.2f\nEmployee Salary: %.2f",
                             getID(), getName(),
                             (getDateOfBirth() != null ? getDateOfBirth().toString() : "null"),
                             (getHireDate() != null ? getHireDate().toString() : "null"),
                             getTotalSales(), baseSalary, computeSalary());
    }

    
}
