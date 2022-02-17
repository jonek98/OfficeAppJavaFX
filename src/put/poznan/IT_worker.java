package put.poznan;

public class IT_worker extends Employee {

    enum Departament_type {
        DATA_ANALYSIS,
        SOFTWARE_DEVELOPMENT,
        SECURITY;
    }

    private Departament_type departament;

    IT_worker(String first_name, String last_name, int salary, String hire_date, Departament_type departament, int id) {
        super(first_name, last_name, salary, hire_date, id);
        this.departament = departament;
    }

    public Departament_type getDepartament() {
        return departament;
    }

    public void setDepartament(Departament_type departament) {
        this.departament = departament;
    }

    public void work() {

        System.out.println("Fixing problem...");
    }

    public void GiveRaise() {

        this.setSalary(getSalary() + 500);
    }


    public String toString() {
        return "id: " + getId() + "\n" +
                "IT_Worker" + "\n" +
                "first_name: " + getFirst_name() + "\n" +
                "last_name: " + getLast_name() + "\n" +
                "salary: " + getSalary() + "\n" +
                "hire date: " + getHire_date() + "\n" +
                "Departament_type: " + getDepartament() + "\n";

    }

}
