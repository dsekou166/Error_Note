package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Commentaire;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commentaire")
public class CommentaireController {

    @Autowired
    CommentaireService commentaireService;
    @PostMapping("/creer")

    public Commentaire creer(@PathVariable Commentaire commentaire) {

        return commentaireService.Creer(commentaire);
    }

    @GetMapping("/afficher")
    public List<Commentaire> Lire(){
        return commentaireService.lire();

    }

}
