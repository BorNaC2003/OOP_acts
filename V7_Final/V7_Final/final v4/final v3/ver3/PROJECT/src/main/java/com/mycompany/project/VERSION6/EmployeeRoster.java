/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.VERSION6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private List<Employee> empList;
    
    public EmployeeRoster() {
        this.empList = new ArrayList<>();
    }

    public boolean addEmployee(Employee e) {
        return empList.add(e);  
    }

    public Employee removeEmployee(int ID) {
        for (Employee employee : empList) {
            if (employee.getID() == ID) {
                empList.remove(employee);
                return employee;  
            }
        }
        return null;  
    }

    public int getCount() {
        return empList.size();
    }

    public void displayEmployees() {
        for (Employee employee : empList) {
            System.out.println(employee.toString());
        }
    }

    public int countCommissionEmployees() {
        int commissionCount = 0;
        for (Employee employee : empList) {
            if (employee instanceof CommisionEmployee) {
                commissionCount++;
            }
        }
        return commissionCount;
    }

    public int countHourlyEmployees() {
        int hourlyCount = 0;
        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                hourlyCount++;
            }
        }
        return hourlyCount;
    }

    public int countPieceWorkerEmployees() {
        int pieceWorkerCount = 0;
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                pieceWorkerCount++;
            }
        }
        return pieceWorkerCount;
    }

    public int countBasedPlusCommissionEmployees() {
        int basedPlusCommissionCount = 0;
        for (Employee employee : empList) {
            if (employee instanceof BasedPlusCommisionEmployee) {
                basedPlusCommissionCount++;
            }
        }
        return basedPlusCommissionCount;
    }

    public void displayCommissionEmployees() {
        for (Employee employee : empList) {
            if (employee instanceof CommisionEmployee) {
                System.out.println(employee.toString());
            }
        }
    }

    public void displayHourlyEmployees() {
        for (Employee employee : empList) {
            if (employee instanceof HourlyEmployee) {
                System.out.println(employee.toString());
            }
        }
    }

    public void displayPieceWorkerEmployees() {
        for (Employee employee : empList) {
            if (employee instanceof PieceWorkerEmployee) {
                System.out.println(employee.toString());
            }
        }
    }

    public void displayBasedPlusCommissionEmployees() {
        for (Employee employee : empList) {
            if (employee instanceof BasedPlusCommisionEmployee) {
                System.out.println(employee.toString());
            }
        }
    }
}
