/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;



public class CommisionEmployee extends Employee {
    private double totalSales;
    private Date dateOfBirth; 
    private Date hireDate; 

    
    public CommisionEmployee() {}

   
    public CommisionEmployee(double totalSales, Name name) {
        super(name);
        this.totalSales = totalSales;
    }

    
    public CommisionEmployee(int empID, Name name, Date dateOfBirth, Date hireDate, double totalSales) {
        super(empID, name);  
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.totalSales = totalSales;
    }

    public CommisionEmployee(double totalSales, int ID, Name name) {
        super(ID, name);
        this.totalSales = totalSales;
    }
    
    

    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    
    public double computeSalary() {
        double rate;

        if (this.totalSales < 10000) {
            rate = 0.05;
        } else if (this.totalSales < 100000) {
            rate = 0.10;
        } else if (this.totalSales < 1000000000) {
            rate = 0.20;
        } else {
            rate = 0.30;
        }

        return this.totalSales * rate;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nDate of Birth: %s\nHire Date: %s\nTotal Sales: %.2f\nEmployee Salary: %.2f",
                             getID(), getName(), 
                             (dateOfBirth != null ? dateOfBirth.toString() : "null"),
                             (hireDate != null ? hireDate.toString() : "null"), 
                             this.totalSales, computeSalary());
    }

    // Display method for CommissionEmployee
    public void displayCommissionEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Name: " + getName());
        System.out.println("Date of Birth: " + (dateOfBirth != null ? dateOfBirth.toString() : "null"));
        System.out.println("Hire Date: " + (hireDate != null ? hireDate.toString() : "null"));
        System.out.println("Total Sales: " + this.totalSales);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }
}

