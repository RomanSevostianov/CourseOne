
import java.util.Scanner;

public class Main {
    public static Employee[] emp = new Employee[10];
//----------------------------medium----------------------

    public static void indexSalary(int index) {

        for (Employee employee : emp) {
          float persent;
          persent = ((100f/index)*employee.getSalary());
            employee.setSalary(  (int) (employee.getSalary()+persent) );

        }

    }


    //-----------------------------------------------
    public static int calcSalary() {

        int sum = 0;
        for (Employee employee : emp) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int findingMin() {
        int min = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {
            if (min > emp[i].getSalary()) {
                min = emp[i].getSalary();
            }
        }
        return min;
    }

    public static int findingMax() {
        int max = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {
            if (max < emp[i].getSalary()) {
                max = emp[i].getSalary();
            }
        }
        return max;
    }

    public static double mean() {
        double meaning;
        meaning = calcSalary() / emp.length;
        return meaning;
    }

    public static void main(String[] args) {
        emp[0] = new Employee(3, "Petrov ", "Sergey", "Romanovich", 30002);
        emp[1] = new Employee(4, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[2] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[3] = new Employee(3, "Petrov ", "Sergey", "Romanovich", 90000);
        emp[4] = new Employee(4, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[5] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[6] = new Employee(3, "Petrov ", "Sergey", "Romanovich", 10002);
        emp[7] = new Employee(4, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[8] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[9] = new Employee(3, "Petrov ", "Sergey", "Romanovich", 70002);
        System.out.println("               ");
        System.out.println("Общий список сотрудников компании ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
        System.out.println("                        ");
        System.out.println("Выберете нужный пункт меню ");
        System.out.println("1 - Общая сумма затрат за месяц");
        System.out.println("2 - Сотрудник с минимальной зарплатой");
        System.out.println("3 - Сотрудник с максимальной зарплатой");
        System.out.println("4 - Среднее значение зарплат");

        System.out.println("---------Medium------------");
        System.out.println("5 - Проиндексировать");
        System.out.println(" ");

        Scanner in = new Scanner(System.in);
        int enterMenu = in.nextInt();

        switch (enterMenu) {
            case 1:
                System.out.println("Общая сумма затрат =  " + calcSalary());
                break;
            case 2:
                System.out.println("Сотрудник с минимальной зарплатой = " + findingMin());
                break;
            case 3:
                System.out.println("Сотрудник с максимальной зарплатой = " + findingMax());
                break;
            case 4:
                System.out.println("Среднее значение зарплат = " + mean());
                break;
            case 5:
                System.out.println("Индексация зарплаты ");
                indexSalary(10);
                for (int i = 0; i < emp.length; i++) {
                    System.out.println(emp[i]);
                }
        }
    }
}