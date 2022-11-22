package com.enigmacamp.erjpa.repository;

import com.enigmacamp.erjpa.entity.Major;

public interface IMajorRepo {
    void create(Major major);
    Major findOne(long id);
}
