package put.poznan;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Person> people = new ArrayList<>();
    private static Database instance;
    private static int id = 0;

    public List<Person> getPeople() {

        return people;
    }

    public void setPeople(List<Person> people) {

        this.people = people;
    }

    public static Database getInstance(){

        if (instance == null){

            instance = new Database();

        }

        return instance;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Database.id = id;
    }
}

