/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION2;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
    public int totalPiecesFinfished;
    public double ratePerPiece;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int totalPiecesFinfished, double ratePerPiece) {
        this.totalPiecesFinfished = totalPiecesFinfished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinfished, String empName, int empID) {
        super(empName, empID);
        this.totalPiecesFinfished = totalPiecesFinfished;
    }

    public PieceWorkerEmployee(double ratePerPiece, String empName, int empID) {
        super(empName, empID);
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int totalPiecesFinfished, double ratePerPiece, String empName, int empID) {
        super(empName, empID);
        this.totalPiecesFinfished = totalPiecesFinfished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinfished() {
        return totalPiecesFinfished;
    }

    public void setTotalPiecesFinfished(int totalPiecesFinfished) {
        this.totalPiecesFinfished = totalPiecesFinfished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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
        
        return ((this.totalPiecesFinfished / 100) * (10 * this.ratePerPiece)) + (this.totalPiecesFinfished * this.ratePerPiece);

    }
     
     public void displayHourlyEmployee(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Number of Pieces: " + this.totalPiecesFinfished);
        System.out.println("Rate Per Piece: " + this.ratePerPiece);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }
    
    
     @Override
    public String toString() {
    return String.format("Employe ID: %d\nEmployee Name: %s\nNumber of Pieces: %d\nRate Per Piece: %.2f\nEmployee Salary: %.2f",
                         getEmpID(), getEmpName(), this.totalPiecesFinfished, this.ratePerPiece, computeSalary());
    }
    
    
    
    
    
}
