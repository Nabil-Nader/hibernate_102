package com.ex.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "passengers")
@SecondaryTable(name = "addresses", pkJoinColumns = @PrimaryKeyJoinColumn(name = "passenger_id", referencedColumnName = "passenger_id"))
public class Passenger {

    @Id
    @Column(name = "passenger_id")
    private Long id;

    private String name;
//
//    @Column(name = "p_address",table = "addresses",columnDefinition = "VarChar(25) not null ")
//    private String address;

    @Column(name = "p_city", table = "addresses", columnDefinition = "VarChar(25) not null ")
    private String city;

    @Column(name = "p_zip", table = "addresses", columnDefinition = "VarChar(25) not null ")
    private String zip;

    @Column(name = "p_street", table = "addresses", columnDefinition = "VarChar(25) not null ")
    private String street;

//    @ManyToOne
//    @JoinColumn(name="airport_id")
//    private Airport airPort;
//
//    @OneToMany(mappedBy = "passenger")
//    private List<Ticket> tickets = new ArrayList<>();

    public Passenger(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//    public List<Ticket>getTicketsList(){
//        return Collections.unmodifiableList(tickets);
//    }

//    public void addTicket(Ticket ticket){
//        tickets.add(ticket);
//    }


}
