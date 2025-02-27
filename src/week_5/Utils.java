/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static String input(String string) {
        System.out.print(string);
        return sc.nextLine();
    }

    public static String checkId(String string, List<Course> courseList) {
        String id;
        while (true) {
            id = checkEmpty(string);
            boolean check = false;
            for (Course c : courseList) {
                if (c.getCourseID().equalsIgnoreCase(id)) {
                    System.out.println("Data input is invalid, ID must be unique");
                    check = true;
                    break;
                }

            }
            if (!check) {
                return id;
            }
        }

    }

    public static String checkName(String string, List<Course> courseList) {
        while (true) {
            System.out.print(string);
            String name = sc.nextLine();
            for (Course c : courseList) {
                if (c.getCourseName().equalsIgnoreCase(name)) {
                    System.out.println("Data input is invalid, Name must be unique");
                }
            }
            if (name.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else {
                return name;
            }
        }
    }

    public static int checkCredit(String string) {
        while (true) {
            System.out.print(string);
            int credit = Integer.parseInt(sc.nextLine());
            if (credit <= 0) {
                System.out.println("Data input is invalid.");
            } else {
                return credit;
            }
        }
    }

    public static String checkEmpty(String string) {
        while (true) {
            System.out.print(string);
            String check = sc.nextLine();
            if (check.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else {
                return check;
            }
        }

    }

    public static String checkDate(String string) {
        while (true) {
            String date = checkEmpty(string);
            if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Data input is invalid.");
                continue;
            }

            String[] split = date.split("/");
            int day = Integer.parseInt(split[0]);
            int month = Integer.parseInt(split[1]);
            int year = Integer.parseInt(split[2]);

            if (month < 1 || month > 12) {
                System.out.println("Data input is invalid.");
                continue;
            }

            int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (day < 1 || day > dayInMonth[month - 1]) {
                System.out.println("Data input is invalid.");
                continue;
            }

            return date;
        }

    }

    public static String checkOnlOrOff(String string) {
        while (true) {
            String check = checkEmpty(string);
            if (check.equalsIgnoreCase("o") || check.equalsIgnoreCase("f")) {
                return check;
            } else {
                System.out.println("Data input is invalid");
            }
        }
    }
}
