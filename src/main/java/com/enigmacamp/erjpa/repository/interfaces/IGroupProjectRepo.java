package com.enigmacamp.erjpa.repository.interfaces;

import com.enigmacamp.erjpa.entity.GroupProject;

public interface IGroupProjectRepo {
    void create(GroupProject groupProject);
    GroupProject findOne(long id);
}
