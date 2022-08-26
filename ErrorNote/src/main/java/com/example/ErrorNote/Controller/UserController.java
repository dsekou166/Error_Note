package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.ProblemeService;
import com.example.ErrorNote.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
@AllArgsConstructor
public class UserController {
    private final UserService UserService;

    @PostMapping("/Creer")

    public User create(User User) {

        return UserService.creer(User);
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