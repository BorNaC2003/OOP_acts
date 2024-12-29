/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION1;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    
    private float totalHoursWorked;
    private double ratePerHour;
    private String empName;
    private int empID;

    public HourlyEmployee(){
    }
    
    public HourlyEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }
    
    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }
    
    
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary()
    {
        
            float diff = this.totalHoursWorked - 40;
            return ((this.totalHoursWorked-diff) * this.ratePerHour) + ((diff*this.ratePerHour)*1.50);
            
        
    }
        
    public void displayHourlyEmployee(){
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate Per Hour: " + this.ratePerHour);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

   @Override
    public String toString() {
    return String.format("Employe ID: %d\nEmployee Name: %s\nHours Worked: %f\nRate Per Hour: %.2f\nEmployee Salary: %.2f",
                         this.empID, this.empName, this.totalHoursWorked, this.ratePerHour, computeSalary());
}

    
    
    
}
