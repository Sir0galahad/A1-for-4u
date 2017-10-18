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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] dollas = new int[7];
        dollas[0] = 0;
        System.out.println("How much are you spending on food?");
        dollas[1] = in.nextInt();
        System.out.println("How much are you spending on the DJ?");
        dollas[2] = in.nextInt();
        System.out.println("How much are you spending on renting the hall?");
        dollas[3] = in.nextInt();
        System.out.println("How much are you spending on decorations?");
        dollas[4] = in.nextInt();
        System.out.println("How much are you spending on the wait staff?");
        dollas[5] = in.nextInt();
        System.out.println("How much are you spending on miscellaneous expenses?");
        dollas[6] = in.nextInt();
        for (int i = 0; i < 7; i++) {
            dollas[0] += dollas[i];
        }
        int tickets = dollas[0] / 35;
        System.out.println("You have to sell " + tickets + " tickets in order to break even.");
    }
}
