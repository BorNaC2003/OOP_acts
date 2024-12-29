/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clock;

/**
 *
 * @author User
 */
public class Time {
    private int sec;
    private int mins;
    private int hours;
    private int days;
    private String meridian;

    public Time() {
    }

    public Time(int sec, int mins, int hours, int days, String meridian) {
        this.sec = sec;
        this.mins = mins;
        this.hours = hours;
        this.days = days;
        this.meridian = meridian;
    }


    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getMeridian() {
        return meridian;
    }

    public void setMeridian(String meridian) {
        this.meridian = meridian;
    }

    public void tickBySec(){
        this.sec++;
        if(this.sec == 60){
            this.sec = 0;
            tickByMin();
        }
    }
    
    public void tickByMin(){
        this.mins++;
        if(this.mins == 60){
            this.mins= 0;
            tickByHour();
        }
    }
    
    public void tickByHour(){
        this.hours++;
        if(this.hours >= 12){
            this.meridian = "PM";
        }else if(this.hours == 24){
            this.meridian = "AM";
            this.hours = 0;
            this.sec = 0;
            tickByDay();
        }
    }
    
    public void tickByDay(){
        this.days++;
    }

    
    
    public void display(){
           System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Time{" + "sec=" + sec + ", mins=" + mins + ", hours=" + hours + ", days=" + days + ", meridian=" + meridian + '}';
    }
    
    
    
    
    
    
}
