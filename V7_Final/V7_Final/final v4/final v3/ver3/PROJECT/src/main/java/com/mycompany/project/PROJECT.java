
package com.mycompany.project;
import com.mycompany.project.VERSION4.*;


public class PROJECT {

    public static void main(String[] args) {
        
        Name employeeName1 = new Name("Anthony", "Mendoza", 'A');
        Date birthDate1 = new Date(6, 8, 2003);
        Date hireDate1 = new Date(10, 14, 2024); 
        
        Name employeeName2 = new Name("Boris", "Boris");
        Date birthDate2 = new Date(3, 7, 2004);
        Date hireDate2 = new Date(10, 2024); 
        
        Date birthDate3 = new Date(3, 7, 2004);
        Date hireDate3 = new Date(10, 2024); 

        
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee(1, employeeName1, 45, 20.0);
        hourlyEmployee1.setDateOfBirth(birthDate1);
        hourlyEmployee1.setHireDate(hireDate1);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee(2, employeeName2, birthDate2, hireDate2, 40, 25.0);
        HourlyEmployee hourlyEmployee3 = new HourlyEmployee(3, new Name("Jane", "Smith"));
        hourlyEmployee3.setRatePerHour(24);
        hourlyEmployee3.setTotalHoursWorked(24);
        hourlyEmployee3.setDateOfBirth(birthDate3);
        hourlyEmployee3.setHireDate(hireDate3);
        System.out.println("//////////////////////////////////////////////////////////////////////");
        
        hourlyEmployee1.displayHourlyEmployee();
        hourlyEmployee2.displayHourlyEmployee();
        hourlyEmployee3.displayHourlyEmployee();
        
        System.out.println("//////////////////////////////////////////////////////////////////////");
        
        
        CommisionEmployee comp1 = new CommisionEmployee(40, 1, employeeName1);
        comp1.setDateOfBirth(birthDate1);
        comp1.setHireDate(hireDate1);
        CommisionEmployee comp2 = new CommisionEmployee(2, employeeName2, birthDate2, hireDate2, 40);
        CommisionEmployee comp3 = new CommisionEmployee(3, new Name("Jane", "Smith"));
        comp3.setTotalSales(40);
        comp3.setDateOfBirth(birthDate3);
        comp3.setHireDate(hireDate3);
        
        comp1.displayCommissionEmployee();
        comp2.displayCommissionEmployee();
        comp3.displayCommissionEmployee();
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        PieceWorkerEmployee pemp1 = new PieceWorkerEmployee(40, 1, employeeName1);
        pemp1.setDateOfBirth(birthDate1);
        comp1.setHireDate(hireDate1);
        PieceWorkerEmployee pemp2 = new PieceWorkerEmployee(2, 40, 40, employeeName2, birthDate2, hireDate2);
        PieceWorkerEmployee pemp3 = new PieceWorkerEmployee(3, new Name("Jane", "Smith"));
        pemp3.setRatePerPiece(40);
        pemp3.setDateOfBirth(birthDate3);
        pemp3.setHireDate(hireDate3);
        pemp3.setTotalPiecesFinished(2);
        
        pemp1.displayPieceWorkerEmployee();
        pemp2.displayPieceWorkerEmployee();
        pemp3.displayPieceWorkerEmployee();
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////");
        
        
        BasedPlusCommisionEmployee bcomp1 = new BasedPlusCommisionEmployee(40);
        bcomp1.setDateOfBirth(birthDate1);
        bcomp1.setHireDate(hireDate1);
        bcomp1.setID(1);
        bcomp1.setName(employeeName1);
        bcomp1.setTotalSales(46);
        BasedPlusCommisionEmployee bcomp2 = new BasedPlusCommisionEmployee(46, 2, employeeName2, birthDate2, hireDate2, 40);
        BasedPlusCommisionEmployee bcomp3 = new BasedPlusCommisionEmployee(3, new Name("Jane", "Smith"));
        bcomp3.setTotalSales(40);
        bcomp3.setDateOfBirth(birthDate3);
        bcomp3.setHireDate(hireDate3);
        bcomp3.setID(3);
        
        bcomp1.displayCommissionEmployee();
        bcomp2.displayCommissionEmployee();
        bcomp3.displayCommissionEmployee();
        
        
         System.out.println("//////////////////////////////////////////////////////////////////////////////");
         
         EmployeeRoster roster = new EmployeeRoster();  
         
        // roster.addEmployee(hourlyEmployee1);
         
         //System.out.println(roster.countHourlyEmployees());
         //roster.displayEmployees();
        
        
        
        
        
        
        
        
        
        
    }
}
