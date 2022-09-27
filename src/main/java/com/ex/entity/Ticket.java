
package com.ex.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@Table(name="tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String number;

    @ManyToMany
    private List<Passenger> passengers =  new ArrayList<>();

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }


    public Ticket( String number) {

        this.number = number;
    }
}

