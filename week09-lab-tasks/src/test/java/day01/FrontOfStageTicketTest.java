package day01;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FrontOfStageTicketTest {

    @Test
    void testCreate() {
        FrontOfStageTicket ticket = new FrontOfStageTicket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 35000, "GHT6589");

        assertEquals("AC/DC", ticket.getBand());
        assertEquals("2021-12-24T21:00", ticket.getBeginTime().toString());
        assertEquals(35000, ticket.getPrice());
        assertEquals("GHT6589", ticket.getExtraCode());
    }

    @Test
    void testEntryTime() {
        FrontOfStageTicket ticket = new FrontOfStageTicket("AC/DC",
                LocalDateTime.of(2021, 12, 24, 21, 0), 25000, "GHT6589");

        assertEquals("19:00", ticket.entryTime().toString());
    }
}