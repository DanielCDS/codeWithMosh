/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.part1;

import java.util.Scanner;


public class MortgageCalculator_v1 {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("This will be your first project from Code With Mosh\n");
        Scanner principalScanner = new Scanner(System.in); //Create scanner object
        Scanner annualInterestRateScanner = new Scanner(System.in);
        Scanner periodScanner = new Scanner(System.in);

        System.out.print("Principal: ");
        Integer principal = principalScanner.nextInt(); // the total amount of your loan
        System.out.print("Annual Interest Rate: ");
        Double annualInterestRate = (annualInterestRateScanner.nextDouble() / 100) / 12; //lol
        System.out.print("Period (Years): ");
        Integer period = periodScanner.nextInt() * 12;
        //M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1].
        double power = Math.pow(1 + annualInterestRate, period);
        int mortgage = (int) ((principal * (annualInterestRate * power)) / (power - 1)); //meaning, until death [the monthly payments]
        System.out.println("Mortgage: $" + mortgage);
    }
}
