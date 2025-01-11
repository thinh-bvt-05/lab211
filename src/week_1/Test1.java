/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_1;

import java.util.Scanner;
import view.Menu;

/**
 *
 * @author ThinhBui
 */
public class Test1 extends Menu<String> {

    Scanner sc = new Scanner(System.in);
    static String[] mainMenu = {"Letter and Character Count", "Linear Search", "Change Base", "Equation Calculate"};

    public Test1() {
        super("MENU", mainMenu);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("Enter your content: ");
                String input = sc.nextLine();
                LetterAndCharacterCount count = new LetterAndCharacterCount(input);
                System.out.println(count.countWord());
                System.out.println(count.countCharacter());

                break;
            case 2:
                System.out.println("Enter number of array: ");
                int num = sc.nextInt();
                System.out.println("Enter search value: ");
                int search = sc.nextInt();
                LinearSearch ln = new LinearSearch(num);
                ln.search(search);
                break;
            case 3:
                System.out.println("Base input: ");
                System.out.println("1. Binary");
                System.out.println("2. Decimal");
                System.out.println("3. Hexa");
                System.out.println("Enter your choice: ");
                int baseIn = sc.nextInt();
                sc.nextLine();
                System.out.println("Base out");
                System.out.println("1. Binary");
                System.out.println("2. Decimal");
                System.out.println("3. Hexa");
                System.out.println("Enter your choice: ");
                int baseOut = sc.nextInt();
                sc.nextLine();
                System.out.println("Value to change: ");
                String value = sc.nextLine();
                ChangeBase cb = new ChangeBase(value);
                switch (baseOut) {
                    case 1:
                        if (baseIn == 1 && baseOut == 1) {
                            System.out.println("Same value: " + value);
                        }
                        if (baseIn == 2 && baseOut == 1) {
                            cb.decimalToBinary();
                        }
                        if (baseIn == 3 && baseOut == 1) {
                            cb.hexaToBinary();
                        }
                        break;
                    case 2:
                        if (baseIn == 1 && baseOut == 2) {
                            cb.binaryToDecimal();
                        }
                        if (baseIn == 2 && baseOut == 2) {
                            System.out.println("Same value: " + value);
                        }
                        if (baseIn == 3 && baseOut == 2) {
                            cb.hexaToDecimal();
                        }
                        break;
                    case 3:
                        if (baseIn == 1 && baseOut == 3) {
                            cb.binaryToHexa();
                        }
                        if (baseIn == 2 && baseOut == 3) {
                            cb.decimalToHexa();
                        }
                        if (baseIn == 3 && baseOut == 3) {
                            System.out.println("Same Value: " + value);
                        }
                        break;

                    default:
                        throw new AssertionError();
                }

                break;
            case 4:
                Calculate cal = new Calculate();
                cal.menu();
                break;

        }

    }

    public static void main(String[] args) {
        Test1 run = new Test1();
        run.run();
    }
}
