package com.ex.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "passengers")
@NoArgsConstructor
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "passenger_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy="passengers")
    private List<Ticket> tickets =  new ArrayList<>();

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    //    @ManyToOne
//    @JoinColumn(name="airport_id")
//    private Airport airPort;
//
//    @OneToMany(mappedBy = "passenger")
//    private List<Ticket> tickets = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

//    public List<Ticket>getTicketsList(){
//        return Collections.unmodifiableList(tickets);
//    }

//    public void addTicket(Ticket ticket){
//        tickets.add(ticket);
//    }


}
