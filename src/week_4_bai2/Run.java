/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week_4_bai2;


/**
 *
 * @author ThinhBui
 */
public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        Management manage = new Management();
        while (true) {
            System.out.println();
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Person");
            System.out.println("4. Exit");
            int choice = Utils.checkInt("You choose: ");
            switch (choice) {
                case 1:
                    run.teacher(manage);
                    break;
                case 2:
                    run.student(manage);
                    break;
                case 3:
                    run.person(manage);
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
    
    public void teacher(Management manage){
        while(true){
            System.out.println("*** Teacher Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            int choice = Utils.checkInt("You choose: ");
            switch (choice) {
                case 1: 
                    manage.inputTeacher();
                    break;
                case 2: 
                    manage.showTeacher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid value.");
            }
        }
    }
    public void student(Management manage){
        while(true){
            System.out.println("*** Student Management ***");
            System.out.println("1. Input");
            System.out.println("2. Print");
            System.out.println("3. Exit");
            int choice = Utils.checkInt("You choose: ");
            switch (choice) {
                case 1: 
                    manage.inputStudent();
                    break;
                case 2: 
                    manage.showStudent();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid value.");
            }
        }
    }
    public void person(Management manage){
        while(true){
            System.out.println("*** Person Management ***");
            System.out.println("1. Search");
            System.out.println("2. Print All");
            System.out.println("3. Exit");
            int choice = Utils.checkInt("You choose: ");
            switch (choice) {
                case 1: 
                    manage.searchPerson();
                    break;
                case 2: 
                    manage.printAllPerson();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid value.");
            }
        }
    }
}
