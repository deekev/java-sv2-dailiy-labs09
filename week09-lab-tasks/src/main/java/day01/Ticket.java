package day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ticket {

    private String band;
    private LocalDateTime beginTime;
    private int price;

    public Ticket(String band, LocalDateTime beginTime, int price) {
        this.band = band;
        this.beginTime = beginTime;
        this.price = price;
    }

    public String getBand() {
        return band;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public int getPrice() {
        return price;
    }

    public LocalTime entryTime() {
        LocalTime begin = LocalTime.of(beginTime.getHour(), beginTime.getMinute());
        return begin.minusHours(1);
    }
}