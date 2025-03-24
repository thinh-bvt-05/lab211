
package week_6_bai2;

import java.util.ArrayList;

/**
 *
 * @author ThinhBui
 */
public class Main {
    public static void main(String[] args) {
        
        WorkerManagement workerManage = new WorkerManagement();
        
        ArrayList<Salary> sh1 = new ArrayList<>();
        sh1.add(new Salary(200000, "Begin", java.time.LocalDate.now().toString()));
        Worker w1 = new Worker("W1", "Ha", 25, sh1);
        workerManage.addWorker(w1);
        
        workerManage.changeUpSalary("W1", 400000);
        workerManage.getInformation();
    }
}
