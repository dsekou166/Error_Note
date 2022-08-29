package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.ProblemeService;
import com.example.ErrorNote.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService UserService;

    @PostMapping("/creer")

    public User creer(@PathVariable User user) {

        return UserService.creer(user);
    }

    @GetMapping("/afficher")
    public List<User> Lire(){
        return UserService.lire();

    }

    @PutMapping("/modifier/{id_probleme}")
    public User Modifier(@PathVariable Long id_user, User User) {
        return UserService.modifier( id_user, User);
    }


    @DeleteMapping("/delete/{id_user}")
    public String delete(@PathVariable Long id_user) {

        return UserService.supprimer(id_user);
    }


}