/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.operators;

import java.util.Scanner;


public class FizzBuzz {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        /*
         * Request:
         *Enter a number from keyboard,
         *1. divisible by 5 = Fizz
         *2. divisible by 3 = Buzz
         *3. divisible by 5 and 3 = FizzBuzz
         *4. else print the number
         * */

        System.out.println("The FizzBuzz game");
        System.out.print("Add a number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (((number % 5) == 0) && ((number % 3) == 0)) {
            System.out.println("FizzBuzz");
        } else if (((number % 5) == 0)) {
            System.out.println("Fizz");
        } else if (((number % 3) == 0)) {
            System.out.println("Buzz");
        } else
            System.out.println(number);

    }
}
