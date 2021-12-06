package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class ConcertTest {

    Concert concert = new Concert();

    @Test
    void testAddPersonWithValidTime() {
        concert.addPerson(new Person(new Ticket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 25000)),
                LocalTime.of(20,00));
        concert.addPerson(new Person(new FrontOfStageTicket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 35000, "GHT6589")),
                LocalTime.of(19,00));

        assertEquals(2, concert.getPeople().size());
        assertEquals(25000, concert.getPeople().get(0).getTicket().getPrice());
        assertEquals("19:00", concert.getPeople().get(1).getTicket().entryTime().toString());
    }

    @Test
    void testAddPersonWithInvalidTime() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> concert.addPerson(new Person(new Ticket("AC/DC",
                        LocalDateTime.of(2021, 12, 24, 21, 0), 25000)),
                LocalTime.of(19,59)));

        assertEquals("Can't get in.", exception.getMessage());
    }
}