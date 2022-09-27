package com.ex;


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

//        Passenger billy = new Passenger(1L, "Billy Nader","Cairo,Egypt");
        Passenger billy = new Passenger("Billy Nader");
        Passenger nader = new Passenger("Billy Nader2");

        Ticket ticket1 = new Ticket("AA123");
        Ticket ticket2 = new Ticket("AB134");

        billy.addTicket(ticket1);
        billy.addTicket(ticket2);

        nader.addTicket(ticket1);
        nader.addTicket(ticket2);
        ticket1.addPassenger(billy);
        ticket2.addPassenger(billy);

        ticket2.addPassenger(nader);
        ticket1.addPassenger(nader);


        em.persist(billy);
        em.persist(nader);
        em.persist(ticket1);
        em.persist(ticket2);

        em.getTransaction().commit();
        emf.close();


    }
}
