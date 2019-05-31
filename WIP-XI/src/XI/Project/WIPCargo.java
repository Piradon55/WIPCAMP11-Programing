/*
 * WIP XI Computer Programing 
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author sittiwatlcp
 */
public class WIPCargo {

    public static void main(String[] args) {
        int item = 6;
        int limit = 10;
        System.out.println("item: " + item + ",limit:" + limit);

        Scanner input = new Scanner(System.in);

        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Check");
        System.out.print("Input number :");

        int menu = input.nextInt();
        if (menu == 1) {
            if (item < limit) {
                System.out.print("amount to add :");
                int amount = input.nextInt();
                if (item + amount > limit) {
                    System.out.println("ไอเท็มเกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("item: " + item + ",limit:" + limit);
                }
            } else {
                System.out.println("ไอเท็มเต็มแล้ว");
            }
        }
        if (menu == 2) {          
            if (0 <= item) {
                System.out.print("amount to remove :");
                int amount = input.nextInt();
                if (item - amount < 0) {
                    System.out.println("ไอเท็มไม่เพียงพอ");
                } else {
                    item = item - amount;
                    System.out.println("item: " + item + ",limit:" + limit);
                }
            } else {
                System.out.println("ไอเท็มไม่เพียงพอ");
            }

        }
        if (menu == 3) {
            System.out.println("item: " + item + ",limit:" + limit);

        }

    }
}
