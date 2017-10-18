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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number of dots between 1 and 10.");
        int x = in.nextInt();
        System.out.println("");
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
