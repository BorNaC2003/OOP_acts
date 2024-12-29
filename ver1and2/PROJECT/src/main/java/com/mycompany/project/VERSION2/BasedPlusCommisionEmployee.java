/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION2;

/**
 *
 * @author User
 */
public class BasedPlusCommisionEmployee extends CommisionEmployee{
    private double baseSalary;

    public BasedPlusCommisionEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommisionEmployee(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommisionEmployee(double baseSalary, int empID, String empName) {
        super(empID, empName);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommisionEmployee(double baseSalary, double totalSales, Employee emp) {
        super(totalSales, emp);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommisionEmployee(double baseSalary, double totalSales, String empName, int empID) {
        super(totalSales, empName, empID);
        this.baseSalary = baseSalary;
    }

    

    
    
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

   


    @Override
    public String getEmpName() {
        return super.getEmpName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEmpName(String empName) {
        super.setEmpName(empName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int getEmpID() {
        return super.getEmpID(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setEmpID(int empID) {
        super.setEmpID(empID); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setTotalSales(double totalSales) {
        super.setTotalSales(totalSales); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public double getTotalSales() {
        return super.getTotalSales(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    @Override
     public double computeSalary(){
       
        return super.computeSalary() + this.baseSalary;
    }
     
     
     
     
     
     @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nTotal Sales: %.2f\nBase Salary: %.2f\nTotal Salary: %.2f",
                             getEmpID(), getEmpName(), getTotalSales(), baseSalary, computeSalary());
    }

    @Override
    public void displayHourlyEmployee(){
        System.out.println("Employee ID: " + super.getEmpID());
        System.out.println("Employee Name: " + super.getEmpName());
        System.out.println("Total Sales: " + super.getTotalSales());
        System.out.println("Base Salary: " + this.baseSalary);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }
}
