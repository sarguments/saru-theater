package hika.saru.java.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Theater {
    private final List<TicketOffice> ticketOffices = new ArrayList<>();
    private final Long fee;

    public Theater(Long fee) {this.fee = fee;}

    Long getFee() {return this.fee;}

    public void setTicketOffices(TicketOffice... ticketOffices) {
        Stream.of(ticketOffices).forEach(o -> {
            o.setTheater(this);
            this.ticketOffices.add(o);
        });
    }

    public void setTicket(TicketOffice ticketOffice, Long num) {
        if (!ticketOffices.contains(ticketOffice)) return;
        while (num-- > 0) {ticketOffice.addTicket(new Ticket(this));}
    }

    public void setInvitation(Audience audience) {audience.setInvitation(new Invitation(this));}

    public boolean enter(Audience audience) {
        Ticket ticket = audience.getTicket();
        return ticket.isValid(this);
    }

}
