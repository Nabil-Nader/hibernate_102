package com.ex;

import com.ex.entity.Airport;
import com.ex.entity.Passenger;
import com.ex.entity.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m02.ex01");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Airport airport = new Airport(1L, "Henri Coanda");

        Passenger john = new Passenger(1L, "John Smith");
        john.setAirPort(airport);
        Passenger mike = new Passenger(2L, "Michael Johnson");
        mike.setAirPort(airport);
        airport.addPassenger(john);
        airport.addPassenger(mike);

        Ticket ticket1 = new Ticket(1L, "AA1234");
        ticket1.setPassenger(john);

        Ticket ticket2 = new Ticket(2L, "BB5678");
        ticket2.setPassenger(john);

        john.addTicket(ticket1);
        john.addTicket(ticket2);

        Ticket ticket3 = new Ticket(3L, "CC0987");
        ticket3.setPassenger(mike);
        mike.addTicket(ticket3);

        em.persist(airport);
        em.persist(john);
        em.persist(mike);

        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);

        em.getTransaction().commit();
        emf.close();


    }
}
