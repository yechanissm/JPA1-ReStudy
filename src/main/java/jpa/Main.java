package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager entityManager = emf.createEntityManager();

        Member member = new Member();

        member.setId(1L);
        member.setName("lee");

        entityManager.persist(member);

        entityManager.close();

        emf.close();
    }
}