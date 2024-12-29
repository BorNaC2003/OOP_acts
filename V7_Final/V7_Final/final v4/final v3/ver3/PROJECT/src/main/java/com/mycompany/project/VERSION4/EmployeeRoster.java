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
        
        System.out.print("ID\t");
        System.out.print("Name\t\t");
        System.out.print("Date Joined\t");
        System.out.print("Birth Date\t");
        System.out.print("Salary\t");
        
        for (int i = 0; i < count; i++) {
            if (empList[i] != null) {
                //System.out.println(empList[i].toString());
                System.out.println(empList[i].getID());
                System.out.println("\t");
                
                System.out.println(empList[i].getName());
                System.out.println("\t\t");
                
                System.out.println(empList[i].getHireDate());
                System.out.println("\t");
                
                System.out.println(empList[i].getDateOfBirth());
                System.out.println("\t");
                
                
                if(empList[i] instanceof HourlyEmployee){
                    System.out.println(((HourlyEmployee)empList[i]).computeSalary());
                    System.out.println("\t");

                    System.out.println("Hourly Employee");
                    System.out.println("\t");
                }else if(empList[i] instanceof PieceWorkerEmployee){
                    System.out.println(((PieceWorkerEmployee)empList[i]).computeSalary());
                    System.out.println("\t");

                    System.out.println("PieceWorkerEmployee");
                    System.out.println("\t");
                }else if(empList[i] instanceof CommisionEmployee){
                    System.out.println(((CommisionEmployee)empList[i]).computeSalary());
                    System.out.println("\t");

                    System.out.println("CommisionEmployee");
                    System.out.println("\t");
                }else if(empList[i] instanceof BasedPlusCommisionEmployee){
                    System.out.println(((BasedPlusCommisionEmployee)empList[i]).computeSalary());
                    System.out.println("\t");

                    System.out.println("BasedPlusCommisionEmployee");
                    System.out.println("\t");
                }

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
