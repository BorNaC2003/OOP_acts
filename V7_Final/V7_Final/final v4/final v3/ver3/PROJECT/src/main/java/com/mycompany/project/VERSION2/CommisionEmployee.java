/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION2;

/**
 *
 * @author User
 */
public class CommisionEmployee extends Employee{
    private double totalSales;

    public CommisionEmployee() {
    }

    public CommisionEmployee(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public CommisionEmployee(int empID, String empName) {
        super(empName, empID);
    }
    
    public CommisionEmployee(double totalSales, Employee emp) {
        this.setEmpID(emp.getEmpID());
        this.setEmpName(emp.getEmpName());
        this.totalSales = totalSales;
    }
    
    
    public CommisionEmployee(double totalSales, String empName, int empID) {
        super(empName, empID);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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

     public double computeSalary(){
        
        double Rate;

        if (this.totalSales < 10000) {
            Rate = 0.05;
        } else if (this.totalSales < 100000) {
            Rate = 0.10;
        } else if (this.totalSales < 1000000000) {
            Rate = 0.20;
        } else {
            Rate = 0.30;
        }

        return this.totalSales * Rate;

    }
    
      public void displayHourlyEmployee(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Total Sales: " + this.totalSales);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

   @Override
    public String toString() {
    return String.format("Employe ID: %d\nEmployee Name: %s\nRate Per Piece: %.2f\nEmployee Salary: %.2f",
                        getEmpID(), getEmpName(), this.totalSales, computeSalary());
    }
    
     
     
    
    
}
