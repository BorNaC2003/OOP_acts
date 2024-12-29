/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee empList[];
    private int count = 0;
    private final int max;
    
    
    public EmployeeRoster() {
        this.max = 10; 
        this.empList = new Employee[max];
        this.count = 0;
    }
    

    
 public boolean addEmployee(Employee e){
       if(count < max){
        empList[count++] = e;
        return true;   
       }else{
           return false;
       }
    }
 public Employee removeEmployee(int ID) {
        for (int i = 0; i < count; i++) {
            if (empList[i].getID() == ID) {
                Employee removedEmployee = empList[i];
               
                for (int j = i; j < count - 1; j++) {
                    empList[j] = empList[j + 1];
                }
                empList[count - 1] = null; 
                count--;
                return removedEmployee; 
            }
        }
        return null; 
    }

    
    public int getCount() {
        return count;
    }

    
    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] != null) {
                System.out.println(empList[i].toString());
            }
        }
    }

   
    public int countCommissionEmployees() {
        int commissionCount = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommisionEmployee) {
                commissionCount++;
            }
        }
        return commissionCount;
    }

    public int countHourlyEmployees() {
        int hourlyCount = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                hourlyCount++;
            }
        }
        return hourlyCount;
    }

    public int countPieceWorkerEmployees() {
        int pieceWorkerCount = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                pieceWorkerCount++;
            }
        }
        return pieceWorkerCount;
    }

    public int countBasedPlusCommissionEmployees() {
        int basedPlusCommissionCount = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasedPlusCommisionEmployee) {
                basedPlusCommissionCount++;
            }
        }
        return basedPlusCommissionCount;
    }

   
    public void displayCommissionEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommisionEmployee) {
                System.out.println(empList[i].toString());
            }
        }
    }

    public void displayHourlyEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                System.out.println(empList[i].toString());
            }
        }
    }

    public void displayPieceWorkerEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.println(empList[i].toString());
            }
        }
    }

    public void displayBasedPlusCommissionEmployees() {
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasedPlusCommisionEmployee) {
                System.out.println(empList[i].toString());
            }
        }
    }

}
