/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a1;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input your principal.");
        double cashMoney = in.nextDouble();
        double principal = cashMoney;
        System.out.println("Please enter your interest rate as a decimal.");
        double interest = in.nextDouble();
        boolean skip = false;
        int years=0;
        for (int i = 1; cashMoney < 1000000; i++) {
            cashMoney = cashMoney * (1+interest);
            if (!skip&&cashMoney>=principal*2) {
                System.out.println("The money doubles by reaching "+cashMoney+" dollars after "+i+" years");
                skip = true;
            }
            years = i;
        }
        if (skip) {
            System.out.println("After "+years+" years the money will reach one million dollars.");
        }
    }
}
