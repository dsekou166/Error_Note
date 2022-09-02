package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Role;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class UserControllerTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void connexion() {

    }

    @Test
    void add() {
        User us = new User();
        us.setNom("SEKOU");
        us.setPrenom("DIAKITE");
        us.setRole(Role.User);
        us.setEmail("jeansagara@tech");
        us.setContact("763874");
        us.setEmail("gmail.com");
        us.setMpd("ODK");
        this.userRepository.save(us);

    }

    @Test
    void admin() {
        User us = new User();
        us.setNom("JEAN");
        us.setPrenom("SAGARA");
        us.setRole(Role.Admin);
        us.setEmail("jeansagara@tech");
        us.setContact("7363636");
        us.setEmail("aa@gmail.com");
        us.setMpd("mdp");
        this.userRepository.save(us);
    }
}