package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.ProblemeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probleme")
@AllArgsConstructor
public class ProblemeController {
    @Autowired
    ProblemeService ProblemeService;


    @PostMapping("/creer")

    public Probleme create(@RequestBody Probleme Probleme) {

        return ProblemeService.creer(Probleme);
    }

    @GetMapping("/afficher")
    public List<Probleme> Lire(){
        return ProblemeService.lire();

    }

    @PutMapping("/modifier/{id_probleme}")
    public Probleme Modifier(@PathVariable Long id_probleme, Probleme Probleme) {
        return ProblemeService.modifier( id_probleme, Probleme);
    }


    @DeleteMapping("/delete/{id_probleme}")
    public String delete(@PathVariable Long id_probleme) {

        return ProblemeService.supprimer(id_probleme);
    }
   @GetMapping("/recherche/{mot_cle}")
    Object recherche(@PathVariable String mot_cle){
        return ProblemeService.recherche(mot_cle);
    }

}
