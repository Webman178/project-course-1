public class Employee {

    private static int idGenerator = 1;

    private String fullName;
    private int id;
    private int salary;
    private int department;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.id = idGenerator++;;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }


    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО - " + fullName + ", Отдел - " + department + ", Зарплата - " + salary;
    }
}
