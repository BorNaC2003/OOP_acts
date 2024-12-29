/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;



/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
     private int totalPiecesFinished;
    private double ratePerPiece;
    

    
    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, Name name) {
        super(name);  
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    
    public PieceWorkerEmployee(int ID, int totalPiecesFinished, double ratePerPiece, Name name, Date dateOfBirth, Date hireDate) {
        super(ID, name, dateOfBirth, hireDate);  
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;

    }

    public PieceWorkerEmployee(int ID, Name name) {
        super(ID, name);
    }
    
    

    
    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    
    

    
    public double computeSalary() {
        return ((this.totalPiecesFinished / 100) * (10 * this.ratePerPiece)) + (this.totalPiecesFinished * this.ratePerPiece);
    }

    
    public void displayPieceWorkerEmployee() {
        System.out.println("Employee ID: " + getID());
        System.out.println("Employee Name: " + getName());
        System.out.println("Date of Birth: " + (getDateOfBirth() != null ? getDateOfBirth().toString() : "null"));
        System.out.println("Hire Date: " + (getHireDate() != null ? getHireDate().toString() : "null"));
        System.out.println("Number of Pieces: " + this.totalPiecesFinished);
        System.out.println("Rate Per Piece: " + this.ratePerPiece);
        System.out.println("Employee Salary: " + computeSalary());
        System.out.println("\n");
    }

    
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s\nDate of Birth: %s\nHire Date: %s\nNumber of Pieces: %d\nRate Per Piece: %.2f\nEmployee Salary: %.2f",
                             getID(), getName(),
                             (getDateOfBirth() != null ? getDateOfBirth().toString() : "null"),
                             (getHireDate() != null ? getHireDate().toString() : "null"),
                             this.totalPiecesFinished, this.ratePerPiece, computeSalary());
    }
}

