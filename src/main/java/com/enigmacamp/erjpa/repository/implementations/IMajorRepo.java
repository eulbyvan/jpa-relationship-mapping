package com.enigmacamp.erjpa.repository.implementations;

import com.enigmacamp.erjpa.entity.Major;
import jakarta.persistence.EntityManager;

public class IMajorRepo implements com.enigmacamp.erjpa.repository.interfaces.IMajorRepo {
    private final EntityManager entityManager;

    public IMajorRepo(EntityManager entityManager) {
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
