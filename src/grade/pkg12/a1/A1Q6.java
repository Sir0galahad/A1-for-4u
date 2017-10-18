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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean five = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 50 and 100");
        int number = in.nextInt();
        for (int i = 100; i > number; i-=5) {
            System.out.println(i);
        }
        if (number%5==0) {
            System.out.println(number);
        }
        System.out.println("^^^^ ^^ ^^^^ ^^^^^^^ ^^^^^^");
        System.out.println("That is your rounded number");
    }
}
