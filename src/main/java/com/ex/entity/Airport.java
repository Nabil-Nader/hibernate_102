/*
package com.ex.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "airports")
@Access(AccessType.FIELD)
//meaning that hibernate will make the persistence at the level of the fields

public class Airport {

    @Id
    private Long id ;

    private String name;

    @OneToMany(mappedBy = "airPort")
    private List<Passenger> passengers = new ArrayList<>();

    public Airport(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }


}
*/
