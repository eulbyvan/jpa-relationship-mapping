package com.enigmacamp.erjpa.repository.interfaces;

import com.enigmacamp.erjpa.entity.UserCredential;

public interface IAuthenticationRepository {
    void create(UserCredential userCredential);
    UserCredential findOne(String id);
}
