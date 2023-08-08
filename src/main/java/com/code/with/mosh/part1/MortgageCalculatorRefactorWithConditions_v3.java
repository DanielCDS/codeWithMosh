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


public class MortgageCalculatorRefactorWithConditions_v3 {

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

        int principal;
        double monthlyInterestRate;
        int numberOfPayments;

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt(); // the total amount of your loan
            if (((principal >= 1000) && (principal <= 1_000_000))) {
                break;
            }
            System.out.println("Enter a number between 1,000$ and 1,000,000$");
        }
        while (true) {
            System.out.print("Annual Interest Rate: ");
            double annualInterestRate = scanner.nextDouble();
            if (((annualInterestRate >= 1) && (annualInterestRate <= 30))) {
                monthlyInterestRate = (annualInterestRate / PERCENT) / MONTHS_IN_A_YEAR; //lol
                break;
            }
            System.out.println("Enter a value greater than 0 and less or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");

            int years = scanner.nextInt();
            if (((years >= 1) && (years <= 30))) {
                numberOfPayments = years * MONTHS_IN_A_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        //M = P [ i(1 + i)^n ] / [ (1 + i)^n – 1].
        double power = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double mortgage = principal * (monthlyInterestRate * power) / (power - 1); //meaning, until death [the monthly payments]
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.GERMANY).format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    // Remaining loan balance
    //B = L[(1+c)^n - (1+c)^p]/[(1+c)^n - 1]
}
