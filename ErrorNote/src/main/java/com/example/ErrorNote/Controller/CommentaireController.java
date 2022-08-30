package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Commentaire;
import com.example.ErrorNote.Services.CommentaireService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Api(value = "hello", description = "commentaireController")
@RestController
@Data
@RequestMapping("/commentaire")
public class CommentaireController {
    @Autowired
    CommentaireService commentaireService;

    @ApiOperation(value = "Creer un commentaire")
    @PostMapping(path = "/creer")
    @ResponseStatus(HttpStatus.CREATED)
    Commentaire add(@RequestBody Commentaire commentaire){
        return commentaireService.Creer(commentaire);
    }

    @ApiOperation(value = "Creer un commentaire")
    @DeleteMapping("/delete/{id_commentaire}")
    String delete(@PathVariable Long id_commentaire){
        return commentaireService.Supprimer(id_commentaire);
    }
}
