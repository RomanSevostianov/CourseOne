
import java.util.Scanner;

public class Main {
    public static Employee[] emp = new Employee[10];
//----------------------------medium----------------------

    public static void indexSalary(int index) {

        for (Employee employee : emp) {
            float persent;
            persent = ((index / 100f) * employee.getSalary());
            employee.setSalary((int) (employee.getSalary() + persent));

        }
    }

    //-----------------------------------------Min------------------------------------------------------------------
    public static int findDepartmantMinSalary(int numberDepartmantMin) {
        int min = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {

            if (numberDepartmantMin != emp[i].getDepartment()) {
                continue;
            } else
                System.out.println(emp[i].getSurname() + "  " + "Получил за месяц = " + emp[i].getSalary());
            if (min > emp[i].getSalary()) {
                min = emp[i].getSalary();
            }
            System.out.println("---------------------------------------");
        }
        System.out.println("");
        return min;
    }

    //-----------------------------------------MAx-----------------------------------------------------------------
    public static int findDepartmantMaxSalary(int numberDepartmantMax) {
        int max = emp[0].getSalary();
        for (int i = 0; i < emp.length; i++) {

            if (numberDepartmantMax != emp[i].getDepartment()) {
                continue;
            } else
                System.out.println(emp[i].getSurname() + "          " + "Получил за месяц = " + emp[i].getSalary());
            if (max < emp[i].getSalary()) {
                max = emp[i].getSalary();
            }
            System.out.println("---------------------------------------");
        }
        System.out.println("");
        return max;
    }
//-------------------------------------Sum------------------------------------------------------------------------

    public static int findDepartmantSalarySum(int numberDepartmantSum) {
        int sum = 0;
        for (int i = 0; i < emp.length; i++) {
            if (numberDepartmantSum != emp[i].getDepartment()) {
                continue;
            } else
                sum = emp[i].getSalary() + sum;
            System.out.println(emp[i].getSurname() + "        " + "Получил за месяц = " + emp[i].getSalary());
        }
        System.out.println("---------------------------------------");
        return sum;

    }

//-------------------------------------Mean------------------------------------------------------------------------

    public static float findDepartmantSalaryMid(int numberDepartmantMid) {
        int sumMid = 0;
        int idMid = 0;
        float mean;
        for (int i = 0; i < emp.length; i++) {
            if (numberDepartmantMid != emp[i].getDepartment()) {
                continue;
            } else
                idMid = ++idMid;
            sumMid = emp[i].getSalary() + sumMid;
            System.out.println(emp[i].getSurname() + "        " + "Получил за месяц = " + emp[i].getSalary());
        }
        System.out.println("Колличество сотрудников в отделе = " + idMid);
        System.out.println("---------------------------------------");
        mean = sumMid / idMid;
        return mean;
    }

    //-------------------------------------------------IndexSalary------------------------------------------------------
    public static void findDepartmantSalaryIndex(int numberDepartmantIndex, int persent) {
        float per = 0;
        for (int i = 0; i < emp.length; i++) {
            if (numberDepartmantIndex != emp[i].getDepartment()) {
                continue;
            } else
                per = ((persent / 100f) * emp[i].getSalary());
            emp[i].setSalary((int) (emp[i].getSalary() + per));

            System.out.println("Проиндексированная зарплата " + emp[i].getSurname() + "  " + emp[i].getSalary());
        }
    }

    //-----------Всех сотрудников с зарплатой меньше----------------------IndexMin-------------------

    public static void findDepartmantSalaryMin(int EnterNumber) {

        for (int i = 0; i < emp.length; i++) {
            if (EnterNumber > emp[i].getSalary()) {
                System.out.println(emp[i].getSurname() + "     " + emp[i].getName() + "     " + emp[i].getPatronymic() + "     " + emp[i].getSalary());
            }
        }

    }

    //--------------------------Всех сотрудников с зарплатой больше-----------------------------------------------
    public static void findDepartmantSalaryMax(int EnterNumber) {

        for (int i = 0; i < emp.length; i++) {
            if (EnterNumber < emp[i].getSalary()) {
                System.out.println(emp[i].getSurname() + "     " + emp[i].getName() + "     " + emp[i].getPatronymic() + "     " + emp[i].getSalary());
            }
        }

    }
//-------------------------------------------------------------------------------------------------------------

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
        emp[0] = new Employee(3, "Suponin ", "Sergey", "Romanovich", 30002);
        emp[1] = new Employee(4, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[2] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[3] = new Employee(3, "Artemov ", "Sergey", "Romanovich", 9000);
        emp[4] = new Employee(4, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[5] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[6] = new Employee(3, "Putin ", "Sergey", "Romanovich", 10002);
        emp[7] = new Employee(1, "Ivanov ", "Boris", "Nikolaevich", 36000);
        emp[8] = new Employee(1, "Sidorov", "Artem", "Nikolaevich", 45000);
        emp[9] = new Employee(3, "Petrov ", "Roman", "Romanovich", 10002);
        System.out.println("               ");
        System.out.println("Общий список сотрудников компании ");
        System.out.println("----------------------------------------------------- ");
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i]);
        }
        System.out.println("                        ");
        System.out.println("-----------------MENU------------------------ ");
        System.out.println("1 -  Общая сумма затрат за месяц");
        System.out.println("2 -  Сотрудник с минимальной зарплатой");
        System.out.println("3 -  Сотрудник с максимальной зарплатой");
        System.out.println("4 -  Среднее значение зарплат");

        System.out.println("-Medium------------");
        System.out.println("5 -  Проиндексировать");
        System.out.println("6 -  Найти минимальную зарплату  по номеру отдела");
        System.out.println("7 -  Найти максимальную зарплату  по номеру отдела");
        System.out.println("8 -  Найти сумму затрат на зарплату по отделу");
        System.out.println("9 -  Найти среднюю зарплату по отделу");
        System.out.println("10 - Проиндексировать зарплату на введенный процент определенному отделу");
        System.out.println("11 - Получить всех сотрудних с зарплатой меньше введенного числа");
        System.out.println("12 - Получить всех сотрудних с зарплатой больше введенного числа");
        System.out.println(" ");
        System.out.println("Введите нужный пункт меню...");

        Scanner in = new Scanner(System.in);
        int enterMenu = in.nextInt();
        if (enterMenu > 12)
            System.out.println(" Введите число от 1 до 12");
        else {
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
                case 6:
                    System.out.println("Введите номер отдела");
                    Scanner inn = new Scanner(System.in);
                    int inDep = inn.nextInt();
                    System.out.println("     Полный список отдела №" + inDep);
                    System.out.println("---------------------------------------");
                    System.out.println("Минимальное значение по параметру =  " + findDepartmantMinSalary(inDep) + " руб");
                    break;
                case 7:
                    System.out.println("Введите номер отдела");
                    Scanner innMax = new Scanner(System.in);
                    int inDepMax = innMax.nextInt();
                    System.out.println("     Полный список отдела №" + inDepMax);
                    System.out.println("---------------------------------------");
                    System.out.println("Максимальное значение по параметру =  " + findDepartmantMaxSalary(inDepMax) + " руб");
                    break;
                case 8:
                    System.out.println("Введите номер отдела");
                    Scanner innSum = new Scanner(System.in);
                    int inDepSum = innSum.nextInt();
                    System.out.println("     Полный список отдела №" + inDepSum);
                    System.out.println("---------------------------------------");
                    System.out.println("                 Сумма по отделу = " + findDepartmantSalarySum(inDepSum));
                    System.out.println("---------------------------------------");
                    break;
                case 9:
                    System.out.println("Введите номер отдела");
                    Scanner innMid = new Scanner(System.in);
                    int inDepMid = innMid.nextInt();
                    System.out.println("                 Полный список отдела №" + inDepMid);
                    System.out.println("---------------------------------------");
                    System.out.println("                 Средняя зарплата по выбранному отделу = " + findDepartmantSalaryMid(inDepMid));
                    System.out.println("---------------------------------------");
                    break;

                case 10:
                    System.out.println("Введите номер отдела");
                    Scanner innIndex = new Scanner(System.in);
                    int inDepIndex = innIndex.nextInt();
                    System.out.println("Введите процент");
                    Scanner inPers = new Scanner(System.in);
                    int inDepPers = inPers.nextInt();
                    System.out.println("     Полный список отдела № " + inDepIndex + " c индексации = " + inDepPers + "%");
                    System.out.println("---------------------------------------");
                    findDepartmantSalaryIndex(inDepIndex, inDepPers);
                    System.out.println("---------------------------------------");
                    break;

                case 11:

                    System.out.println("Введите число для вывода сотрудников зарплата которых меньше данного числа ");
                    Scanner inMin = new Scanner(System.in);
                    int inMinNumber = inMin.nextInt();

                    System.out.println("---------------------------------------");
                    findDepartmantSalaryMin(inMinNumber);
                    break;

                case 12:

                    System.out.println("Введите число для вывода сотрудников зарплата которых больше данного числа ");
                    Scanner inMax = new Scanner(System.in);
                    int inMaxNumber = inMax.nextInt();

                    System.out.println("---------------------------------------");
                    findDepartmantSalaryMax(inMaxNumber);
                    break;
            }
        }
    }
}