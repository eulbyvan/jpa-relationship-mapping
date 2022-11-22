package com.enigmacamp.erjpa.repository.implementations;

import com.enigmacamp.erjpa.entity.GroupProject;
import jakarta.persistence.EntityManager;

public class IGroupProjectRepo implements com.enigmacamp.erjpa.repository.interfaces.IGroupProjectRepo {
    private final EntityManager entityManager;

    public IGroupProjectRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(GroupProject groupProject) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(groupProject);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    @Override
    public GroupProject findOne(long id) {
        return entityManager.find(GroupProject.class, id);
    }
}
