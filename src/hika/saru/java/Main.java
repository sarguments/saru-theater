package hika.saru.java;

import hika.saru.java.domain.Audience;
import hika.saru.java.domain.Theater;
import hika.saru.java.domain.TicketOffice;
import hika.saru.java.domain.TicketSeller;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(100L);
        Audience audience1 = new Audience(0L);
        Audience audience2 = new Audience(50L);
        TicketOffice ticketOffice = new TicketOffice(0L);
        TicketSeller seller = new TicketSeller();

        theater.setTicketOffices(ticketOffice);
        theater.setTicket(ticketOffice, 10L);
        theater.setInvitation(audience1);
        seller.setTicketOffice(ticketOffice);

        audience1.buyTicket(seller);
        audience2.buyTicket(seller);
        boolean isOk1 = theater.enter(audience1);
        boolean isOk2 = theater.enter(audience2);

        System.out.println(isOk1);
        System.out.println(isOk2);
    }
}