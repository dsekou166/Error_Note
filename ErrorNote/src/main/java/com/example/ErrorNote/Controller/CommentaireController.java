package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Commentaire;
import com.example.ErrorNote.Services.CommentaireService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Data
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    CommentaireService commentaireService;
    @PostMapping(path = "/creer")
    @ResponseStatus(HttpStatus.CREATED)
    Commentaire add(@RequestBody Commentaire commentaire){
        return commentaireService.Creer(commentaire);
    }
    @DeleteMapping("/delete/{id_commentaire}")
    String delete(@PathVariable Long id_commentaire){
        return commentaireService.Supprimer(id_commentaire);
    }
}
