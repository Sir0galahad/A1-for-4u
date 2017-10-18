/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a1;

/**
 *
 * @author millc9988
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Yo fam imma tell you when we gonna hit 10 billion fam.");
        double folks = 6;
        int year = 1999;
        while(folks<=10){
            folks = folks*1.014;
            year++;
        }
        System.out.println("we gon get there in the year "+ year+" esketit humans.");
    }
}
