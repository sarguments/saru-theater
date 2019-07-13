package hika.saru.java;

import hika.saru.java.discount.SequenceAmountDiscount;
import hika.saru.java.discount.impl.AmountDiscount;
import hika.saru.java.vo.Money;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(Money.of(100.0));

        Movie movie = new Movie<AmountDiscount>(
            "spiderman",
            Duration.ofMinutes(120L),
            Money.of(5000.0),
            new SequenceAmountDiscount(Money.of(1000.0), 1)
        );
        theater.addMovie(movie);

        // theater init
        theaterInit(theater, movie);

        TicketOffice ticketOffice = new TicketOffice(Money.of(0.0));
        theater.contractTicketOffice(ticketOffice, 10.0);

        TicketSeller seller = new TicketSeller();
        seller.setTicketOffice(ticketOffice);

        Customer customer = new Customer(Money.of(20000.0));

        // enter
        enterProcess(theater, movie, seller, customer);
    }

    private static void enterProcess(Theater theater, Movie movie, TicketSeller seller, Customer customer) {
        for (Screening screening : theater.getScreening(movie)) {
            customer.reverse(seller, theater, movie, screening, 2);
            boolean isOk = theater.enter(customer, 2);
            System.out.println(isOk);
//            break;
        }
    }

    private static void theaterInit(Theater theater, Movie movie) {
        for (int day = 7; day < 32; day++) {
            for (int hour = 10, seq = 1; hour < 24; hour += 3, seq++) {
                theater.addScreening(
                    movie,
                    new Screening(
                        seq,
                        LocalDateTime.of(2019, 7, day, hour, 0, 0),
                        100
                    )
                );
            }
        }
    }
}