import java.sql.SQLOutput;

public class Main {

    public static Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Чумаков Виктор Петрович", 85_000, 1);
        EMPLOYEES[1] = new Employee("Федоров Леонид Вадимович", 52_000, 3);
        EMPLOYEES[2] = new Employee("Герасимов Петр Иванович", 74_000, 2);
        EMPLOYEES[3] = new Employee("Петрова Анна Федоровна", 70_000, 2);
        EMPLOYEES[4] = new Employee("Грошев Василий Семенович", 81_000, 3);
        EMPLOYEES[5] = new Employee("Медведев Наум Константинович", 68_000, 1);
        EMPLOYEES[6] = new Employee("Лебедев Дмитрий Петрович", 77_000, 2);
        EMPLOYEES[7] = new Employee("Дроздова Дюбовь Павловна", 57_000, 3);
        EMPLOYEES[8] = new Employee("Николаев Степан Дмитриевич", 76_000, 1);
        EMPLOYEES[9] = new Employee("Служина Татьяна Ивановна", 48_000, 3);

        printFullInformation();
        System.out.println("Сумма затрат на зарплаты в месяц - " + getFullSalary());
        System.out.println("Сотрудник с минимальной зарплатой - " + getMinEmployeeSalary());
        System.out.println("Сотрудник с максимальной зарплатой - " + getMaxEmployeeSalary());
        System.out.println("Среднее значение зарплат - " + averageSalary());
        System.out.println(allFullNames());
    }

    private static void printFullInformation() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int getFullSalary() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum = sum + employee.getSalary();
        }

        return sum;
    }

    private static Employee getMinEmployeeSalary() {
        int min = Integer.MAX_VALUE;
        Employee minSalaryEmp = null;
        for (Employee employee : EMPLOYEES) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
                minSalaryEmp = employee;
            }
        }
        return minSalaryEmp;
    }

    private static Employee getMaxEmployeeSalary() {
        int max = Integer.MIN_VALUE;
        Employee maxSalaryEmp = null;
        for (Employee employee : EMPLOYEES) {
            if (employee != null && max < employee.getSalary()) {
                max = employee.getSalary();
                maxSalaryEmp = employee;
            }
        }
        return maxSalaryEmp;
    }

    private static int averageSalary() {
        if (EMPLOYEES.length != 0)
            return getFullSalary() / EMPLOYEES.length;
        else return 0;
    }

    private static String allFullNames() {
        String fullNames = "";
        for (Employee employee : EMPLOYEES) {
            if (employee != null) {
                fullNames += employee.getFullName()+"\n";
            }
        }
        return fullNames;
    }
}

