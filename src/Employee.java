public class Employee {

    private static int id=1;
    private int department;
    private String surname;
    private String name;
    private String patronymic;
    private int salary;

    public Employee(int department, String surname, String name, String patronymic, int salary) {

        this.department = department;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.salary = salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return id++ + "       " +department+"      "+ surname + "        " + name + "       " + patronymic+"      "+salary;
    }

}
