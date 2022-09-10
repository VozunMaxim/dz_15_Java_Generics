package ru.netology.dz_15_Java_Generics;


public class Tickets implements Comparable<Tickets> {

    protected int id;                           //    id билета
    protected int cost;                         //    Стоимость (для упрощения будем считать стоимость единой для всех продавцов)
    protected String from;                      //    Аэропорт вылета (вы можете использовать IATA-коды)
    protected String to;                        //    Аэропорт прилёта (вы можете использовать IATA-коды)
    protected int travelTime;                   //    Время в пути (в минутах)

    public Tickets(int id, int cost, String from, String to, int travelTime) {
        this.id = id;
        this.cost = cost;
        this.from = from;
        this.to = to;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getCost() {

        return cost;
    }

    public void setCost(int cost) {

        this.cost = cost;
    }

    public String getFrom() {

        return from;
    }

    public void setFrom(String from) {

        this.from = from;
    }

    public String getTo() {

        return to;
    }

    public void setTo(String to) {

        this.to = to;
    }

    public int getTravelTime() {

        return travelTime;
    }

    public void setTravelTime(int travelTime) {

        this.travelTime = travelTime;
    }


    @Override
    public int compareTo(Tickets o) {
        if (this.cost < o.getCost()) {
            return -1;
        } else {
            if
            (this.cost > o.getCost()) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}