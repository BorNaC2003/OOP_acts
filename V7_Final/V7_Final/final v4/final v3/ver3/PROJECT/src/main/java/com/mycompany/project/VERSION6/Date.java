/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION6;



public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }
    
    

    // Default constructor
    public Date() {}

    // Getter and setter methods
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to check if the date is valid and print null if invalid
    public String getDateString() {
        // If any of the components (month, day, year) are invalid or zero, return null
        if (this.year <= 0 || this.month <= 0 || this.day <= 0) {
            return null;
        }
        
        // Return formatted date
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    @Override
    public String toString() {
        // Call the validation method for a valid date string
        return getDateString();
    }
}


