package com.enigmacamp.erjpa.repository;

import com.enigmacamp.erjpa.entity.GroupProject;

public interface IGroupProjectRepo {
    void create(GroupProject groupProject);
    GroupProject findOne(long id);
}
