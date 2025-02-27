/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_6;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactManage con = new ContactManage();
        int id = 1;
        while (true) {
            System.out.println();
            System.out.println("========= Contact program =========");
            System.out.println("1. Add a Contact");
            System.out.println("2. Display all Contact");
            System.out.println("3. Delete a Contact");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    con.input(sc, id);
                    id++;
                    break;
                case 2:
                    con.display();
                    break;
                case 3:
                    System.out.print("Enter id to delete: ");
                    int idDelete = sc.nextInt();
                    con.delete(idDelete);
                    break;
                case 4:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
    }

}
