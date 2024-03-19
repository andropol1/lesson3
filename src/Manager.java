import java.time.LocalDate;
import java.util.List;

public class Manager extends Worker {
    public Manager(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }

    public static void addSalary(Worker[] workers, int age, int addAmount) {
        for (Worker worker : workers) {
            if (!(worker instanceof Manager)) {
                if (worker.getAge() >= age) {
                    worker.setSalary(worker.getSalary() + addAmount);
                }
            }
        }
    }

    @Override
    public void assign(String task) {
        super.assign(task);
    }

    public void assign(String task, Worker worker) {
        worker.assign(task);
    }
}