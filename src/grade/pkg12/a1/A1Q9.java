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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] aRayOfStrings = new String[10];
        int[] lengths = new int[10];
        int totalLength = 0;
        System.out.println("Please enter in ten words");
        for (int i = 0; i < 10; i++) {
            System.out.println("You have to enter " + (10 - i) + " words still");
            aRayOfStrings[i] = in.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            lengths[i] = aRayOfStrings[i].length();
        }
        for (int i = 0; i < 10; i++) {
            totalLength += lengths[i];
        }
        System.out.println("The total length of the words you entered is " + totalLength + " letters long wow!");
    }
}
