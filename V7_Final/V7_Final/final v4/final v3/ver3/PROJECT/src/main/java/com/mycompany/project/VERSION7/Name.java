/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION7;



public class Name {
    private String fName;
    private String lName;
    private char MI; 

    
    public Name(String fName, String lName, char MI) {
        this.fName = fName;
        this.lName = lName;
        this.MI = MI;
    }

   
    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        this.MI = '\0'; 
    }

    
    public Name(char MI) {
        this.MI = MI;
    }

   
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public char getMI() {
        return MI;
    }

    public void setMI(char MI) {
        this.MI = MI;
    }

    
    @Override
    public String toString() {
        if (MI == '\0') { 
            return fName + " " + lName; 
        } else {
            return fName + " " + MI + ". " + lName; 
        }
    }
}

