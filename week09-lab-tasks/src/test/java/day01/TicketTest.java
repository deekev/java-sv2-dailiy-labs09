package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void testCreate() {
        Ticket ticket = new Ticket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 25000);

        assertEquals("AC/DC", ticket.getBand());
        assertEquals("2021-12-24T21:00", ticket.getBeginTime().toString());
        assertEquals(25000, ticket.getPrice());
    }

    @Test
    void testEntryTime() {
        Ticket ticket = new Ticket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 25000);

        assertEquals("20:00", ticket.entryTime().toString());
    }
}