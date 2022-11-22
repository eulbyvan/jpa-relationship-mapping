package com.enigmacamp.erjpa.repository.interfaces;

import com.enigmacamp.erjpa.entity.Major;

public interface MajorRepo {
    void create(Major major);
    Major findOne(long id);
}