package put.poznan;

public class Sales_person extends Employee {

    private int number_of_sales;

    Sales_person(String first_name, String last_name, int salary, String hire_date, int id){//, int number_of_sales) {
        super(first_name, last_name, salary, hire_date, id);
       // this.number_of_sales = number_of_sales;
    }

    public int getNumber_of_sales() {
        return number_of_sales;
    }

    public void setNumber_of_sales(int number_of_sales) {
        this.number_of_sales = number_of_sales;
    }

    public void work() {

        System.out.println("Selling things...");

    }
    public void GiveRaise() {

        this.setSalary(getSalary() + 500);
    }

    public String toString() {
        return "id: " + getId() + "\n" +
                "Sales_person" + "\n" +
                "first_name: " + getFirst_name() + "\n" +
                "last_name: " + getLast_name() + "\n" +
                "salary: " + getSalary() + "\n" +
                "hire date: " + getHire_date() + "\n" +
                "number of sales: " + getNumber_of_sales() + "\n";

    }
}
