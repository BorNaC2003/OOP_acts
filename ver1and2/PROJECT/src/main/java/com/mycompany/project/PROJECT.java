/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;
import com.mycompany.project.VERSION2.*;

/**
 *
 * @author User
 */
public class PROJECT {

    public static void main(String[] args) {
        
        HourlyEmployee emp = new HourlyEmployee(38, 50.25, "Anthony", 1);
        
        HourlyEmployee emp2 = new HourlyEmployee(41, 100);
        emp2.setEmpName("Boris");
        emp2.setEmpID(2);
        
        HourlyEmployee emp3 = new HourlyEmployee();
        emp3.setEmpName("Carmen");
        emp3.setEmpID(3);
        emp3.setRatePerHour(25);
        emp3.setTotalHoursWorked(50);
        
        HourlyEmployee emp4 = new HourlyEmployee(65, "Doris", 4);
        emp4.setRatePerHour(25);
        
        HourlyEmployee emp5 = new HourlyEmployee(25, "Edward", 5);
        emp5.setRatePerHour(65);
        
        
        emp.displayHourlyEmployee();
        emp2.displayHourlyEmployee();
        emp3.displayHourlyEmployee();
        emp4.displayHourlyEmployee();
        emp5.displayHourlyEmployee();
        
        System.out.println("//////////////////////////////////////////////////////////////////////");
        
        PieceWorkerEmployee Pemp = new PieceWorkerEmployee(100, 10.00, "Anthony", 1);
        
        PieceWorkerEmployee Pemp2 = new PieceWorkerEmployee(100, 40.00);
        Pemp2.setEmpName("Boris");
        Pemp2.setEmpID(2);
        
        PieceWorkerEmployee Pemp3 = new PieceWorkerEmployee();
        Pemp3.setEmpName("Carmen");
        Pemp3.setEmpID(3);
        Pemp3.setTotalPiecesFinfished(300);
        Pemp3.setRatePerPiece(50.00);
        
        PieceWorkerEmployee Pemp4 = new PieceWorkerEmployee(65, "Doris", 4);
        emp4.setRatePerHour(25);
        
        PieceWorkerEmployee Pemp5 = new PieceWorkerEmployee(25, "Edward", 5);
        emp5.setRatePerHour(65);
        
        Pemp.displayHourlyEmployee();
        Pemp2.displayHourlyEmployee();
        Pemp3.displayHourlyEmployee();
        Pemp4.displayHourlyEmployee();
        Pemp5.displayHourlyEmployee();
        
        System.out.println("//////////////////////////////////////////////////////////////////////");
        
        CommisionEmployee Plemp = new CommisionEmployee(10.00, "Anthony", 1);

        CommisionEmployee Plemp2 = new CommisionEmployee(48.00);
        Pemp2.setEmpName("Boris");
        Pemp2.setEmpID(2);
        
        CommisionEmployee Plemp3 = new CommisionEmployee();
        Plemp3.setEmpName("Carmen");
        Plemp3.setEmpID(3);
        Plemp3.setTotalSales(80000.00);
        
        
        Employee cat = new Employee("Doris", 4);
        CommisionEmployee Plemp4 = new CommisionEmployee(46.00, cat);
        
        
        
        Employee fat = new Employee("Edward", 5); 
        CommisionEmployee Plemp5 = new CommisionEmployee(fat.getEmpID(), fat.getEmpName());
        Plemp5.setTotalSales(80000.00);
        
          Plemp.displayHourlyEmployee();
          Plemp2.displayHourlyEmployee();
          Plemp3.displayHourlyEmployee();
          Plemp4.displayHourlyEmployee();
          Plemp5.displayHourlyEmployee();
        
        System.out.println("//////////////////////////////////////////////////////////////////////");
        
        BasedPlusCommisionEmployee dump = new BasedPlusCommisionEmployee(3000);
        dump.setEmpID(1);
        dump.setEmpName("Anthony");
        dump.setTotalSales( 3000);
        
        BasedPlusCommisionEmployee dump2 = new BasedPlusCommisionEmployee(3000, 1500);
        dump2.setEmpID(2);
        dump2.setEmpName("Boris");
        
        BasedPlusCommisionEmployee dump3 = new BasedPlusCommisionEmployee(3000, 3, "Carmen");
        dump3.setTotalSales(30000);
        
        Employee pop = new Employee("Doris", 4);
        BasedPlusCommisionEmployee dump4 = new BasedPlusCommisionEmployee(3000, 2000, pop);
        

        BasedPlusCommisionEmployee dump5 = new BasedPlusCommisionEmployee(3000, 25000, "Edward", 5);
        
        
        dump.displayHourlyEmployee();
        dump2.displayHourlyEmployee();
        dump3.displayHourlyEmployee();
        dump4.displayHourlyEmployee();
        dump5.displayHourlyEmployee();
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
