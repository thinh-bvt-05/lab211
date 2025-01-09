package week_1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Letter and Character Count.");
        System.out.println("2. Linear Search.");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        do{
        switch (choice) {
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
                System.out.println("Enter the base: ");
                String base = sc.nextLine();
                ChangeBase cb = new ChangeBase(base);
                //cb.decimalToBinary();
                cb.hexaToBinary();
                break;
            
                
        }
        }while(choice > 0 && choice < 5);
        

    }
}
