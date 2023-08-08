/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.part1;

import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;


public class MortgageCalculatorRefactor_v2 {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Static fields/initializers 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static final int PERCENT = 100;
    public static final int MONTHS_IN_A_YEAR = 12;
    // -------------------------------------------------------------------------------------------

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("This will be your first project from Code With Mosh\n");
        Scanner scanner = new Scanner(System.in); //Create scanner object

        System.out.print("Principal: ");
        Integer principal = scanner.nextInt(); // the total amount of your loan
        System.out.print("Annual Interest Rate: ");
        Double annualInterestRate = (scanner.nextDouble() / PERCENT) / MONTHS_IN_A_YEAR; //lol
        System.out.print("Period (Years): ");
        Integer period = scanner.nextInt() * MONTHS_IN_A_YEAR;
//M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1].
        double power = Math.pow(1 + annualInterestRate, period);
        double mortgage = principal * (annualInterestRate * power) / (power - 1); //meaning, until death [the monthly payments]
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
