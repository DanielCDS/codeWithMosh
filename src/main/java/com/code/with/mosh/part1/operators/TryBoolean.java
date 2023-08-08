/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.part1.operators;

public class TryBoolean {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        boolean hasHighIncome = false;
        boolean hasHighCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighCredit || hasHighIncome) && !hasCriminalRecord;
        System.out.println("isEligible for this credit = " + isEligible);
    }
}
