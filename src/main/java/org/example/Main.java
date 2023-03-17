/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package org.example;

import com.code.with.mosh.classes.TextBox;

public class Main {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println("Hello world!");

        var textBox1 = new TextBox();
        textBox1.setText("Box 1 Daniel");
        System.out.println(textBox1.getText().toLowerCase());

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2);
    }
}
