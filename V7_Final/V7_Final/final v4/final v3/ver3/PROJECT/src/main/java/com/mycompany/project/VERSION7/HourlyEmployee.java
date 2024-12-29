/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION7;



public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private double ratePerHour;
    private Name name;
    private Date dateOfBirth;
    private Date hireDate; 

   
    public HourlyEmployee() {}

    
    public HourlyEmployee(int ID, Name name, Date dateOfBirth, Date hireDate, float totalHoursWorked, double ratePerHour) {
        super(ID, name); 
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int ID, Name name, float totalHoursWorked, double ratePerHour) {
        super(ID, name);
        this.name = name;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

   
    public HourlyEmployee(int ID, Name name) {
        super(ID, name); 
        this.name = name;
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
    
    @Override
    public Name getName(){
        return name;
    }
    
    @Override
    public void setName(Name employeeName){
        this.name = employeeName;
    }

    @Override
    public double computeSalary() {
        float diff = this.totalHoursWorked - 40;
            return ((this.totalHoursWorked-diff) * this.ratePerHour) + ((diff*this.ratePerHour)*1.50);
    }

    
    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Name: " + name); 
        System.out.println("Date of Birth: " + dateOfBirth); 
        System.out.println("Hire Date: " + hireDate); 
        System.out.println("Hours Worked: " + this.totalHoursWorked);
        System.out.println("Rate Per Hour: " + this.ratePerHour);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

    
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nDate of Birth: %s\nHire Date: %s\nHours Worked: %.2f\nRate Per Hour: %.2f\nEmployee Salary: %.2f",
                             getID(), name, dateOfBirth, hireDate, this.totalHoursWorked, this.ratePerHour, computeSalary());
    }
}
