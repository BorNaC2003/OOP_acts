/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION1;

/**
 *
 * @author User
 */
public class CommisionEmployee {
    private double totalSales;
    private String empName;
    private int empID;

    public CommisionEmployee() {
    }

    public CommisionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public CommisionEmployee(double totalSales, String empName, int empID) {
        this.totalSales = totalSales;
        this.empName = empName;
        this.empID = empID;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
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
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Total Sales: " + this.totalSales);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

   @Override
    public String toString() {
    return String.format("Employe ID: %d\nEmployee Name: %s\nRate Per Piece: %.2f\nEmployee Salary: %.2f",
                         this.empID, this.empName, this.totalSales, computeSalary());
    }
    
    
    
}
