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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi welcome to the amazing counting computer. Simply enter any number of words and when you type 'exit' I will count them up and tell you.");
        boolean stop = false;
        int count = 0;
        while (!stop) {
            String check = in.nextLine();
            count++;
            if (check == "exit") {
                stop = true;
            }
        }
        System.out.println("You entered " + count + " words wow!");
    }
}
