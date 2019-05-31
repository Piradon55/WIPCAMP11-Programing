/*
 * WIP XI Computer Programing 
 */

package VI.Input;

/**
 *
 * @author sittiwatlcp
 */

import java.util.Scanner;


public class _1_Exercise {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int เงินพ่อ;
         int เงินแม่;
         
        System.out.println("ใส่จำนวนเงินพ่อ");
        //what the fuck;
        เงินพ่อ = sc.nextInt();
        
        System.out.println("ใส่จำนวนเงินแม่");

        เงินแม่ = sc.nextInt();
               
        System.out.println("เงินที่รับมา =" + (เงินพ่อ+เงินแม่));
    }
}
