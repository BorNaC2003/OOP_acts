/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION2;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(float totalHoursWorked, String empName, int empID) {
        super(empName, empID);
        this.totalHoursWorked = totalHoursWorked;
    }

    public HourlyEmployee(double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.ratePerHour = ratePerHour;
    }
    

    public HourlyEmployee(float totalHoursWorked, double ratePerHour, String empName, int empID) {
        super(empName, empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    @Override
    public void setEmpID(int empID) {
        super.setEmpID(empID); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getEmpID() {
        return super.getEmpID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEmpName(String empName) {
        super.setEmpName(empName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getEmpName() {
        return super.getEmpName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
     public double computeSalary()
    {
        
            float diff = this.totalHoursWorked - 40;
            return ((this.totalHoursWorked-diff) * this.ratePerHour) + ((diff*this.ratePerHour)*1.50);
            
        
    }
        
    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate Per Hour: " + this.ratePerHour);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return String.format("Employe ID: %d\nEmployee Name: %s\nHours Worked: %f\nRate Per Hour: %.2f\nEmployee Salary: %.2f",
                         getEmpID(), getEmpName(), this.totalHoursWorked, this.ratePerHour, computeSalary());
    }
    
   
}
