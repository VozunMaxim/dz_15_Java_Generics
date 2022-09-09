package ru.netology.dz_15_Java_Generics;


import org.jetbrains.annotations.NotNull;

public class TicketsManager {
    protected TicketsRepository repo;

    public TicketsManager(TicketsRepository repo) {
        this.repo = repo;
    }

    public void add(Tickets tickets) {
        repo.add(tickets);
    }

    public Tickets[] findAll() {
        return repo.findAll();
    }

    public Tickets[] searchBy(String from, String to) {
        Tickets[] result = new Tickets[0];
        for (Tickets tickets : repo.findAll()) {
            if (matches(tickets, from, to)) {

                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = tickets;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(@NotNull Tickets tickets, String from, String to) {
        if (tickets.getFrom().equals(from)) {
            if (tickets.getTo().equals(to)) {
                return true;
            }
        }
        return false;
    }
}
