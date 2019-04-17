package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int time;
        int wage;
        double netPay;
        double OVERTIMEWAGE = 1.5;

	// write your code here
        System.out.println("Enter hours worked");
        Scanner keyboard = new Scanner(System.in);
        time = keyboard.nextInt();
        System.out.println("Enter salary wage");
        wage = keyboard.nextInt();

        if (time<60 && wage <25){
            if(time > 35) {
                int overTime = (time - 35);
                double overtimePay = (overTime * OVERTIMEWAGE);
                netPay = ((35 * wage) + (wage * overtimePay));
            }
           else {
                netPay = ( time * wage);
            }
            System.out.println("your net pay is " + netPay);
        }
        else   System.out.println("that's not a valid entry");

    }
}
