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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number of dots between 1 and 10.");
        int x = in.nextInt();
        for (int q = 0; q < x; q++) {
            System.out.println("");
            for (int i = 0; i < x; i++) {
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
