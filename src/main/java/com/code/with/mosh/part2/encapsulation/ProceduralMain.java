/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.part2.encapsulation;

import com.code.with.mosh.part2.encapsulation.Employee;


public class ProceduralMain {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("*** OOP made ***");
        //Programming using the procedural programming

        var employee1 = new Employee(10_000);

        System.out.println("Sarac: " + employee1.calculateWage());
        System.out.println(Employee.numberOfEmployees);

        //facut cu POO
        var employee = new Employee(50_000, 20);
//        employee.setBaseSalary(50_000);
//        employee.setHourlyRate(20);
        // employee.
        int wageC = employee.calculateWage(10);
        System.out.println(Employee.numberOfEmployees);
        System.out.println(wageC);

        System.out.println("+++++++");
        System.out.println(Employee.printNumberOfEmployees());

        //  int rate = employee.getHourlyRate();
//        System.out.println("Hourly rate is: " + rate);
//        System.out.println("Base salary is: " + employee.getBaseSalary());

        System.out.println("\nProcedural made");
        //facut procedural
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate); // se numesc procedurall
        System.out.println(wage);

        //spaghetti code. Tot codul este interconectat impreuna
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {

        return baseSalary + (extraHours * hourlyRate);

    }
}
