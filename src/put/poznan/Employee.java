package put.poznan;

public abstract class Employee extends Person implements EmployeeInterface {

    private int salary;
    private Date hire_date;

    Employee(String first_name, String last_name, int salary, String hire_date, int id) {

        super(first_name, last_name, id);
        this.salary = salary;
        this.hire_date = new Date(hire_date);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHire_date() {
        return hire_date.toString();
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public abstract void work();

    public abstract void GiveRaise();

    public abstract String toString();

}
