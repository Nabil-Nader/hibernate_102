package com.ex;


import com.ex.entity.Passenger;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m02.ex01");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Passenger billy = new Passenger(1L, "Billy Nader","Cairo,Egypt");
        Passenger billy = new Passenger(1L,"Billy Nader");

        billy.setCity("Cairo");
        billy.setStreet("home");
        billy.setZip("11824");

        em.persist(billy);

        em.getTransaction().commit();
        emf.close();


    }
}
