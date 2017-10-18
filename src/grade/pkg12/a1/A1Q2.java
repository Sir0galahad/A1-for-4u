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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter 3 numbers");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = in.nextInt();
        }
        int product = numbers[0];
        product = product * numbers[1];
        product = product * numbers[2];
        double proSave = product;
        System.out.println("The product is " + product);
        proSave = Math.pow(proSave, 2);
        System.out.println("The product squared is " + proSave);
        proSave = product;
        proSave = Math.sqrt(proSave);
        System.out.println("The root of the product is " + proSave);
    }
}
