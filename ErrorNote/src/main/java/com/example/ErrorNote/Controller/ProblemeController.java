package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.ProblemeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/probleme")
@Data
public class ProblemeController {
    @Autowired
    ProblemeService problemeService;

    @GetMapping("/recherche/{mot_cle}")
    Object recherche(@PathVariable String mot_cle){
        return problemeService.recherche(mot_cle);
    }
    @PostMapping("/add")
    String add(@RequestBody Probleme probleme,Long id_probleme){
        if(this.problemeService.creer(probleme,id_probleme)==null){
            return "cet probleme existe deja";
        }
        return "probleme ajouté";
    }


    @PutMapping("/update/{id_probleme}")
    Probleme update(@RequestBody Probleme probleme, @PathVariable Long id_probleme){
        return problemeService.modifier(probleme, id_probleme);
    }


    @DeleteMapping("/delete/{id_probleme}")
    String delete(@PathVariable Long id_probleme){
        return problemeService.supprimer(id_probleme);
    }


}
