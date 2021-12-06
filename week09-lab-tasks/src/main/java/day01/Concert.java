package day01;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Concert {

    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public void addPerson(Person person, LocalTime actualTime) {
        if (actualTime.isBefore(person.getTicket().entryTime())) {
            throw new IllegalArgumentException("Can't get in.");
        }
        people.add(person);
    }
}