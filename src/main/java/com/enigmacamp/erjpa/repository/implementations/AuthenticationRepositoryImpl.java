package com.enigmacamp.erjpa.repository.implementations;

import com.enigmacamp.erjpa.entity.UserCredential;
import com.enigmacamp.erjpa.repository.interfaces.AuthenticationRepository;
import jakarta.persistence.EntityManager;

public class AuthenticationRepositoryImpl implements AuthenticationRepository {
    private final EntityManager entityManager;

    public AuthenticationRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void create(UserCredential userCredential) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(userCredential);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }
    }

    @Override
    public UserCredential findOne(String id) {
        return entityManager.find(UserCredential.class, id);
    }
}
