import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ivanov", "Ivan", "Ivanovich",
                        "backend-developer", "+7-999-888-77-66", 100,
                        LocalDate.of(1940, 10, 17)),
                new Worker("Petrov", "Ivan", "Pavlovich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1969, 11, 17)),
                new Worker("Pavlov", "Ivan", "Pavlovich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1980, 11, 17)),
                new Worker("Denisov", "Ivan", "Pavlovich", "manager",
                        "+7-999-111-22-66", 200,
                        LocalDate.of(1962, 11, 17)),
                new Worker("Nosov", "Oleg", "Pavlovich", "manager",
                        "+7-999-111-22-66", 2000,
                        LocalDate.of(1970, 11, 17)),
                new Manager("Sverdlov", "Ivan", "Ivanovich", "director",
                        "+7-951-234-22-44", 4000, LocalDate.of(1965, 10, 15))
        };
        List<Worker> workerList = Arrays.asList(workers);
        System.out.println("Изначальный список: ");
        System.out.println(workerList);
        System.out.println("---".repeat(5));
        workerList.sort(new WorkerFamilyComparator());
        System.out.println("Сортировка по фамилии: ");
        System.out.println(workerList);
        Manager.addSalary(workers, 45, 500);
        System.out.println("---".repeat(5));
        System.out.println("Повышение зарплаты сотрудникам: ");
        System.out.println(Arrays.toString(workers));
        System.out.println("---".repeat(5));
        System.out.println("Назначение задач: ");
        workers[0].assign("Исправить баг");
        System.out.println(workers[0].getSurname() + ": " + workers[0].getTasks());
        Manager manager = new Manager("Sverdlov", "Andrey", "Ivanovich", "director",
                "+7-951-234-22-45", 4500, LocalDate.of(1966, 10, 15));
        manager.assign("Созвониться с клиентом", workers[1]);
        System.out.println(workers[1].getSurname() + ": " +workers[1].getTasks());
        manager.assign("Проверить отчеты");
        System.out.println(manager.getSurname() + ": " +manager.getTasks());


    }
}
