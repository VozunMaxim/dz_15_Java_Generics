package ru.netology.dz_15_Java_Generics;

public class TicketsRepository {
    protected Tickets[] ticket = new Tickets[0];

    public void add(Tickets tickets) {
        Tickets[] tmp = new Tickets[ticket.length + 1];
        for (int i = 0; i < ticket.length; i++) {
            tmp[i] = ticket[i];
        }
        tmp[tmp.length - 1] = tickets;
        ticket = tmp;
    }

    public Tickets findById(int id) {
        for (Tickets tickets : ticket) {
            if (tickets.getId() == id) {
                return tickets;
            }
        }
        return null;
    }

    public Tickets[] removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("Tickets with id: " + id + " not found");
        }
        Tickets[] tmp = new Tickets[ticket.length - 1];
        int copyToIndex = 0;
        for (Tickets tickets : ticket) {
            if (tickets.getId() != id) {
                tmp[copyToIndex] = tickets;
                copyToIndex++;
            }
        }
        return tmp;
    }

    public Tickets[] findAll() {
        return ticket;
    }

}
