/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_4_bai2;

import java.util.Scanner;

/**
 *
 * @author ThinhBui
 */
public class Utils {

    private static Scanner sc = new Scanner(System.in);

    public static int checkInt(String string) {
        int n;
        while (true) {
            try {
                System.out.print(string);
                n = Integer.parseInt(sc.nextLine());
                if (n <= 0) {
                    throw new NumberFormatException("Data input is invalid.");
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Data input is invalid.");

            }
        }
    }
    public static double checkDouble(String string) {
        double n;
        while (true) {
            try {
                System.out.print(string);
                n = Double.parseDouble(sc.nextLine());
                if (n < 0) {
                    throw new NumberFormatException("Data input is invalid.");
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Data input is invalid.");

            }
        }
    }

    public static String checkId(String string) {
        while (true) {
            System.out.print(string);
            String id = sc.nextLine();
            if (id.isEmpty() || !id.matches("\\d{6}")) {
                System.out.println("Data input is invalid.");
            } else {
                return id;
            }
        }
    }

    public static String checkName(String string) {
        while (true) {
            System.out.print(string);
            String name = sc.nextLine();
            if (name.isEmpty() || !name.matches("[a-zA-Z\\s]+")) {
                System.out.println("Data input is invalid.");
            } else {
                return name;
            }
        }

    }

    public static String checkPhone(String string) {
        while (true) {
            System.out.print(string);
            String phone = sc.nextLine();
            if (phone.isEmpty() || !phone.matches("\\d{12}")) {
                System.out.println("Data input is invalid.");
            } else {
                return phone;
            }
        }
    }

    public static int checkYear(String string) {
        int year;
        while (true) {
            try {
                System.out.print(string);
                year = Integer.parseInt(sc.nextLine());
                if (year < 0) {
                    throw new NumberFormatException("Data input is invalid.");
                } else {
                    return year;
                }
            } catch (NumberFormatException e) {
                System.out.println("Data input is invalid.");
            }
        }
    }

    public static String checkMajor(String string) {
        while (true) {
            System.out.print(string);
            String major = sc.nextLine();
            if (major.isEmpty()) {
                System.out.println("Data input is invalid.");
            } else if (major.length() > 30) {
                System.out.println("Data input is invalid.");
            } else {
                return major;
            }
        }
    }

}
