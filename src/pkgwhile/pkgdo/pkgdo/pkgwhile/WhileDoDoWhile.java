/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile.pkgdo.pkgdo.pkgwhile;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class WhileDoDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
        
        count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
    
}
