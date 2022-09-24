package com.ex.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    private Long id;

    private String name ;

    @ManyToOne
    @JoinColumn(name="airport_id")
    private Airport airPort;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets = new ArrayList<>();

    public Passenger(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Ticket>getTicketsList(){
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }




}
