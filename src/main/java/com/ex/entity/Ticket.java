/*
package com.ex.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="tickets")
public class Ticket {

    @Id
    private Long id;

    private String number;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;


    public Ticket(Long id, String number) {
        this.id = id;
        this.number = number;
    }
}
*/
