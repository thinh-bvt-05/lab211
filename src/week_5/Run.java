/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week_5;

/**
 *
 * @author ThinhBui
 */
public class Run {

    public static void main(String[] args) {
        OnlineCourse onl = new OnlineCourse();
        OfflineCourse off = new OfflineCourse();
        CourseManagement manageCourse = new CourseManagement();
        Run run = new Run();
        while (true) {
            System.out.println();
            System.out.println("*** Course Management ***");
            System.out.println("1. Add online course/ offline course");
            System.out.println("2. Update course");
            System.out.println("3. Delete course");
            System.out.println("4. Print all / online course / offline course");
            System.out.println("5. Search information base on course name");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(Utils.checkEmpty("You choose: "));
            switch (choice) {
                case 1:
                    System.out.println("*** Add new course ***");
                    String add = Utils.checkOnlOrOff("Online(O) or Offline(F): ");
                    if (add.equalsIgnoreCase("o")) {
                        manageCourse.addOnlineCourse(onl);
                    }
                    if (add.equalsIgnoreCase("f")) {
                        manageCourse.addOfflineCourse(off);
                    }
                    break;
                case 2:
                    run.update(manageCourse);
                    break;
                case 3:
                    run.delete(manageCourse);
                    break;
                case 4:
                    run.print(manageCourse);
                    break;
                case 5:
                    run.search(manageCourse);
                    break;
                case 6:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    System.exit(0);
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
    }

    private void update(CourseManagement manage) {
        System.out.println("*** Update course ***");
        while (true) {
            String courseId = Utils.checkEmpty("Course ID: ");
            if (manage.foundData(courseId)) {
                manage.searchResult(courseId);
                manage.updating(courseId);
                System.out.println("Updated successfully");
                return;
            }
            String choice = Utils.checkEmpty("No data found, do you want to find again? (Y/N): ");
            while (true) {
                if (choice.equalsIgnoreCase("Y")) {
                    break;
                } else if (choice.equalsIgnoreCase("N")) {
                    return;
                } else {
                    System.out.println("Invalid choice!");
                }
            } 

        }
    }

    private void delete(CourseManagement manage) {
        System.out.println("*** Delete course ***");
        while (true) {
            String courseId = Utils.checkEmpty("Course ID: ");
            if (manage.foundData(courseId)) {
                manage.delete(courseId);
                System.out.println("Deleted successfully");
                return;
            }
            String choice = Utils.checkEmpty("No data found, do you want to find again? (Y/N): ");
            do {
                if (choice.equalsIgnoreCase("Y")) {
                    break;
                } else if (choice.equalsIgnoreCase("N")) {
                    return;
                } else {
                    System.out.println("Invalid choice!");
                }
            } while (true);
        }
    }

    private void print(CourseManagement manage) {
        System.out.println("*** Print course ***");
        String choice = Utils.checkEmpty("Do you want to print all (A), online course (O) or offline course (F): ");
        if (choice.equalsIgnoreCase("A")) {
            manage.showCourse();
        }
        if (choice.equalsIgnoreCase("O")) {
            manage.showOnline();
        }
        if (choice.equalsIgnoreCase("F")) {
            manage.showOffline();
        }
    }

    private void search(CourseManagement manage) {
        System.out.println("*** Searching ***");
        while (true) {
            String courseId = Utils.checkEmpty("Course ID: ");
            if (manage.foundData(courseId)) {
                manage.searchResult(courseId);
                return;
            }
            String choice = Utils.checkEmpty("No data found, do you want to find again? (Y/N): ");
            do {
                if (choice.equalsIgnoreCase("Y")) {
                    break;
                } else if (choice.equalsIgnoreCase("N")) {
                    return;
                } else {
                    System.out.println("Invalid choice!");
                }
            } while (true);
        }
    }
}
