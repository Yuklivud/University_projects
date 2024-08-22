package org.bibib.labs.laba5;

import org.bibib.labs.laba5.laba5_1.Calculation;

public class laba5 {
    public static void main(String[] args) {
        /**
         *          Об'єкт - це конкретний екземпляр класу,
         *          який має власний стан і може виконувати дії, визначені в класі.
         */

        Calculation calculation = new Calculation();
        try{
            calculation.calculateByFor(5, 3, 1, 1);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
