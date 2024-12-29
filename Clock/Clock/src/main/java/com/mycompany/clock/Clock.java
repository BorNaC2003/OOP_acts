/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clock;

/**
 *
 * @author User
 */
public class Clock {

    public static void main(String[] args) {
        Time t = new Time(59,59,11,0,"AM");
        t.tickBySec();
        t.display();
        System.out.println(t.toString());
        
        
    }
}
