/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;



public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;
    
  

   
    public HourlyEmployee() {}

    
    public HourlyEmployee(int ID, Name name, Date dateOfBirth, Date hireDate, float totalHoursWorked, double ratePerHour) {
        super(ID, name, dateOfBirth, hireDate); 
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int ID, Name name, float totalHoursWorked, double ratePerHour) {
        super(ID, name);
        
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

   
    public HourlyEmployee(int ID, Name name) {
        super(ID, name); 
       
    }

    
    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        if (totalHoursWorked >= 0) {
            this.totalHoursWorked = totalHoursWorked;
        } else {
            System.out.println("Total hours worked cannot be negative.");
        }
    }

    
    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        if (ratePerHour > 0) {
            this.ratePerHour = ratePerHour;
        } else {
            System.out.println("Hourly rate must be positive.");
        }
    }
    
   
    
 

    
    public double computeSalary() {
        float diff = this.totalHoursWorked - 40;
            return ((this.totalHoursWorked-diff) * this.ratePerHour) + ((diff*this.ratePerHour)*1.50);
    }

    
    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Name: " + getName()); 
        System.out.println("Date of Birth: " + getDateOfBirth()); 
        System.out.println("Hire Date: " + getHireDate()); 
        System.out.println("Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate Per Hour: " + this.ratePerHour);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

    
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nDate of Birth: %s\nHire Date: %s\nHours Worked: %.2f\nRate Per Hour: %.2f\nEmployee Salary: %.2f",
                             getID(), getName(), getDateOfBirth(), getHireDate(), this.totalHoursWorked, this.ratePerHour, computeSalary());
    }
}
