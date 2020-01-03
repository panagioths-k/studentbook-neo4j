package com.spring.studentbook.service;

import com.spring.studentbook.model.node.User;
import com.spring.studentbook.model.relationship.Knows;
import com.spring.studentbook.repository.KnowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private KnowsRepository roleRepository;

    public void save(User userA, User userB) {

        Knows knows = new Knows();

        knows.setUserA(userA);
        knows.setUserB(userB);

        roleRepository.save(knows);
    }

}
