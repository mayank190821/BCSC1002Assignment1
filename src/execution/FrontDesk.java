/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        int choice;
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your choice ");
        choice = scan.nextInt();
        scan.close();
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4 :
                break;
        }
    }
}
