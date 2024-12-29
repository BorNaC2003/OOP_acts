/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION1;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    public int totalPiecesFinfished;
    public double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public PieceWorkerEmployee(int totalPiecesFinfished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinfished = totalPiecesFinfished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
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
        
        return ((this.totalPiecesFinfished / 100) * (10 * this.ratePerPiece)) + (this.totalPiecesFinfished * this.ratePerPiece);

    }
    
    
    public void displayHourlyEmployee(){
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Number of Pieces: " + this.totalPiecesFinfished);
        System.out.println("Rate Per Piece: " + this.ratePerPiece);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

   @Override
    public String toString() {
    return String.format("Employe ID: %d\nEmployee Name: %s\nNumber of Pieces: %d\nRate Per Piece: %.2f\nEmployee Salary: %.2f",
                         this.empID, this.empName, this.totalPiecesFinfished, this.ratePerPiece, computeSalary());
    }
    
}
