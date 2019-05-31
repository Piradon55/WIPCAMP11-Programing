/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 * อย่าลืม!!!! IMPORT PACKAGE
 */

import java.util.Scanner;

public class _0_Scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter x : ");

        int x = sc.nextInt();
        
        System.out.print("Enter y : ");

        int y = sc.nextInt();
        
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        
        System.out.println("X+Y : " + (x+y));
        
    }
}
