package hika.saru.java;

import java.time.LocalDateTime;

public class Screening {
    public final int sequence;
    final LocalDateTime whenScreened;
    private int seat;

    public Screening(int sequence, LocalDateTime when, int seat) {
        this.sequence = sequence;
        this.whenScreened = when;
        this.seat = seat;
    }

    boolean hasSeat(int count) {
        return seat >= count;
    }

    void reserveSeat(int count) {
        if (hasSeat(count)) seat -= count;
        else throw new RuntimeException("no seat");
    }
}