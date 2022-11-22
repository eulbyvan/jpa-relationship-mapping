package com.enigmacamp.erjpa.repository.implementations;

import com.enigmacamp.erjpa.entity.GroupProject;
import com.enigmacamp.erjpa.repository.IGroupProjectRepo;
import jakarta.persistence.EntityManager;

public class GroupProjectRepo implements IGroupProjectRepo {
    private final EntityManager entityManager;

    public GroupProjectRepo(EntityManager entityManager) {
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
