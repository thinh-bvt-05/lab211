/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;
import week3.Ultils;

/**
 *
 * @author ThinhBui
 */
public class Run {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Run run = new Run();
        run.menu();
    }
    void menu(){
        Run run =  new Run();
        StudentManage manage = new StudentManage();
        manage.addStudent(new Student("de01", "A", "spring23", "lab211"));
        manage.addStudent(new Student("de02", "B", "spring23", "lab211"));
        manage.addStudent(new Student("de03", "C", "spring24", "lab211"));
        manage.addStudent(new Student("de04", "D", "spring25", "lab211"));
        while (true) {
            System.out.println();
            System.out.println("===== Menu =====");
            System.out.println("1. Create");
            System.out.println("2. Find/Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.println("Please choice one lesson: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    run.create(manage);
                    manage.showStudent();
                    break;
                case 2:
                    manage.findAndSort();                
                    break;
                case 3:
                    manage.deleteOrUpdate();
                    break;
                case 4:
                    manage.reportStudent();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
    }

    void create(StudentManage manage) {
        System.out.println("Enter number of the student: ");
        int num = sc.nextInt();
        sc.nextLine();
        do {
            if (num < 3) {
                System.out.println("Enter at leat 3 student.");
                System.out.println("Enter new number of the student: ");
                num = sc.nextInt();
                sc.nextLine();
            }
        } while (num < 3);

        if (num > 3) {
            System.out.println("Do you want to continue (Y/N)?");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                return;
            }
        }
        while (num > 0) {
            input(manage);
            num--;
        }

    }

    void input(StudentManage manage) {
        System.out.println("Enter id student: ");
        String id = sc.nextLine();
        System.out.println("Enter name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the semester: ");
        String semester = sc.nextLine();
        System.out.println("Enter course name: ");
        String course = sc.nextLine();
        manage.addStudent(new Student(id, name, semester, course));
    }
}
