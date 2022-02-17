package put.poznan;

public class Chief extends Person {

    enum Chief_type {
        CEO,
        CIO,
        CTO;
    }

    private int salary;
    private static int FiredPeople;
    private Chief_type chief_type;


    Chief(String first_name, String last_name, int salary, Chief_type chief_type, int id) {

        super(first_name, last_name, id);
        this.chief_type = chief_type;
        this.salary = salary;

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getFiredPeople() {
        return FiredPeople;
    }

    public void setFiredPeople(int firedPeople) {
        FiredPeople = firedPeople;
    }

    public Chief_type getChief_type() {
        return chief_type;
    }

    public void setChief_type(Chief_type chief_type) {
        this.chief_type = chief_type;
    }


    public void FireSomeone() {

        System.out.println("You are just fired someone");
        setFiredPeople(getFiredPeople() + 1);
        System.out.println("Numer of fired people: " + getFiredPeople());
    }

    @Override
    public String toString() {

        return "id: " + getId() + "\n" +
                "Chief" + "\n" +
                "first_name: " + getFirst_name() + "\n" +
                "last_name: " + getLast_name() + "\n" +
                "salary: " + getSalary() + "\n" +
                "Chief_type: " + getChief_type() + "\n";
    }
}