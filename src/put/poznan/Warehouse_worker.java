package put.poznan;

public class Warehouse_worker extends Employee {


    private int number_of_pallets;

    Warehouse_worker(String first_name, String last_name, int salary, String hire_date, int id) {

        super(first_name, last_name, salary, hire_date, id);
        this.number_of_pallets = number_of_pallets;
    }

    public void work() {

        System.out.println("Lifting pallets...");

    }

    public void GiveRaise() {

        this.setSalary(getSalary() + 500);

    }

    public String toString() {
        return "id: " + getId() + "\n" +
                "Warehouse_worker" + "\n" +
                "first_name: " + getFirst_name() + "\n" +
                "last_name: " + getLast_name() + "\n" +
                "salary: " + getSalary() + "\n" +
                "hire_date: " + getHire_date() + "\n";

    }
}
