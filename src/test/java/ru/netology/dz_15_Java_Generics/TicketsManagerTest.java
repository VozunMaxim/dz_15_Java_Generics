package ru.netology.dz_15_Java_Generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketsManagerTest {

    @Test
    public void shouldSearchBy() {
        Tickets Ticket1 = new Tickets(220, 200, "AAQ", "VKO", 60);
        Tickets Ticket2 = new Tickets(330, 300, "ABA", "SVO", 90);
        Tickets Ticket3 = new Tickets(440, 400, "ACS", "DME", 120);
        Tickets Ticket4 = new Tickets(550, 500, "ADH", "BKA", 150);
        Tickets Ticket5 = new Tickets(660, 600, "AER", "LED", 180);

        TicketsManager ticketsManager = new TicketsManager(new TicketsRepository());
        ticketsManager.add(Ticket1);
        ticketsManager.add(Ticket2);
        ticketsManager.add(Ticket3);
        ticketsManager.add(Ticket4);
        ticketsManager.add(Ticket5);


        Tickets[] actual = ticketsManager.searchBy("ABA", "SVO");
        Tickets[] expected = {Ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCompareTo() {

        Tickets Ticket4 = new Tickets(550, 500, "ADH", "BKA", 150);
        Tickets Ticket3 = new Tickets(440, 400, "ACS", "DME", 120);
        Tickets Ticket1 = new Tickets(220, 200, "AAQ", "VKO", 60);
        Tickets Ticket5 = new Tickets(660, 600, "AER", "LED", 180);
        Tickets Ticket2 = new Tickets(330, 300, "ABA", "SVO", 90);

        TicketsManager ticketsManager = new TicketsManager(new TicketsRepository());
        ticketsManager.add(Ticket2);
        ticketsManager.add(Ticket1);
        ticketsManager.add(Ticket4);
        ticketsManager.add(Ticket3);
        ticketsManager.add(Ticket5);

        Tickets[] expected = {
                Ticket1,
                Ticket2,
                Ticket3,
                Ticket4,
                Ticket5};

        Tickets[] actual = Tickets.compareTo
//                Ticket1,
//                Ticket2,
//                Ticket3,
//                Ticket4,
//                Ticket5);


        Assertions.assertArrayEquals(expected, actual);
    }

}