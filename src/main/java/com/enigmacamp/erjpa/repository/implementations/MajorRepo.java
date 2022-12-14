package com.enigmacamp.erjpa.repository.implementations;

import com.enigmacamp.erjpa.entity.Major;
import com.enigmacamp.erjpa.repository.IMajorRepo;
import jakarta.persistence.EntityManager;

public class MajorRepo implements IMajorRepo {
    private final EntityManager entityManager;

    public MajorRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Major major) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(major);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public Major findOne(long id) {
        return entityManager.find(Major.class, id);
    }
}
