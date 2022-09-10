package ru.netology.dz_15_Java_Generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


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

        Tickets[] expected = {Ticket2};
        Tickets[] actual = ticketsManager.searchBy("ABA", "SVO");


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySomeElements() {
        Tickets Ticket1 = new Tickets(220, 200, "AAQ", "VKO", 60);
        Tickets Ticket2 = new Tickets(330, 300, "ABA", "SVO", 90);
        Tickets Ticket3 = new Tickets(440, 400, "ACS", "DME", 120);
        Tickets Ticket4 = new Tickets(550, 500, "ADH", "BKA", 150);
        Tickets Ticket5 = new Tickets(660, 600, "ABA", "SVO", 180);

        TicketsManager ticketsManager = new TicketsManager(new TicketsRepository());
        ticketsManager.add(Ticket1);
        ticketsManager.add(Ticket2);
        ticketsManager.add(Ticket3);
        ticketsManager.add(Ticket4);
        ticketsManager.add(Ticket5);

        Tickets[] expected = {Ticket2, Ticket5};
        Tickets[] actual = ticketsManager.searchBy("ABA", "SVO");


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySortingByCost() {
        Tickets Ticket1 = new Tickets(220, 200, "AAA", "BBB", 60);
        Tickets Ticket2 = new Tickets(330, 800, "AAA", "BBB", 90);
        Tickets Ticket3 = new Tickets(440, 400, "AAA", "BBB", 120);
        Tickets Ticket4 = new Tickets(550, 900, "AAA", "BBB", 150);
        Tickets Ticket5 = new Tickets(660, 600, "AAA", "BBB", 180);

        TicketsManager ticketsManager = new TicketsManager(new TicketsRepository());
        ticketsManager.add(Ticket1);
        ticketsManager.add(Ticket2);
        ticketsManager.add(Ticket3);
        ticketsManager.add(Ticket4);
        ticketsManager.add(Ticket5);

        Tickets[] expected = {
                Ticket1,  //cost 200
                Ticket3,  //cost 400
                Ticket5,  //cost 600
                Ticket2,  //cost 800
                Ticket4}; //cost 900
        Tickets[] actual = ticketsManager.searchBy("AAA", "BBB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySortingSomeElemets() {
        Tickets Ticket1 = new Tickets(220, 200, "AAA", "BBB", 60);
        Tickets Ticket2 = new Tickets(330, 800, "AAA", "BBB", 90);
        Tickets Ticket3 = new Tickets(440, 400, "AAA", "BBB", 120);
        Tickets Ticket4 = new Tickets(550, 900, "AAA", "BBB", 150);
        Tickets Ticket5 = new Tickets(660, 600, "AAA", "BBB", 180);

        TicketsManager ticketsManager = new TicketsManager(new TicketsRepository());
//        ticketsManager.add(Ticket1);
        ticketsManager.add(Ticket2);
        ticketsManager.add(Ticket3);
        ticketsManager.add(Ticket4);
//        ticketsManager.add(Ticket5);

        Tickets[] expected = {
//                Ticket1,  //cost 200
                Ticket3,  //cost 400
//                Ticket5,  //cost 600
                Ticket2,  //cost 800
                Ticket4}; //cost 900
        Tickets[] actual = ticketsManager.searchBy("AAA", "BBB");

        Assertions.assertArrayEquals(expected, actual);
    }

}