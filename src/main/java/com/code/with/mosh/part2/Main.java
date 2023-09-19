/**
 *  Copyright Murex S.A.S., 2003-2023. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
package com.code.with.mosh.part2;

import com.code.with.mosh.part2.classes.Browser;
import com.code.with.mosh.part2.classes.TextBox;


public class Main {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        //static, nu se schimba tipul instantierii
        var textBox1 = new TextBox();
        // am folosit var, ca sa scurtam codul si sa il facem mai inteligibil
        textBox1.setText("Box 1");
        System.out.println(textBox1.getText().toUpperCase());

        var textBox2 = textBox1;
        textBox2.setText("Box 2");
        System.out.println(textBox2.getText());
        System.out.println(textBox1.getText()); //acum se referentiaza acelasi obiect

        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("Other stuff");
        System.out.println("++++++++++++++++++++++++++++++");

        var browser = new Browser();
        browser.navigate("Test");

    }
}
