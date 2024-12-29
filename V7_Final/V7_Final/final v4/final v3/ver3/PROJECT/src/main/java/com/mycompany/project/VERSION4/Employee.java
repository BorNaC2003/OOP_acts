/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;



public class Employee {
    private int ID;
    private Name name; // Composition: Employee has a Name
    private Date dateOfBirth;
    private Date hireDate; 

    public Employee() {}

    public Employee(int ID, Name name) {
        this.ID = ID;
        this.name = name;
    }
    
       public Employee(Name name) {
        this.name = name;
        this.ID = -1; 
    }

    public Employee(Date dateOfBirth, Date hireDate) {
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
    }

    public Employee(int ID, Name name, Date dateOfBirth, Date hireDate) {
        this.ID = ID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.hireDate = hireDate;
    }
       
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
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
    
    

    // Override toString() for Employee class
    @Override
    public String toString() {
        return String.format("Employee ID: %d\nEmployee Name: %s", ID, name);
    }
}
