package org.example.submodule.two;

import org.example.submodule.one.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public UserEntity getUser(){
        return new UserEntity("jiutian",23,"beijing");
    }
}
