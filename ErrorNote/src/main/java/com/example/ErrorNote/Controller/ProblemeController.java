package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Services.ProblemeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "hello", description = "ProblemeController")

@RestController
@RequestMapping("/probleme")
@Data
public class ProblemeController {
    @Autowired
    ProblemeService problemeService;

    @ApiOperation(value = "Creer un probleme")
    @GetMapping("/recherche/{mot_cle}")
    Object recherche(@PathVariable String mot_cle){
        return problemeService.recherche(mot_cle);
    }
    @ApiOperation(value = "Creer un probleme")
    @PostMapping("/creer")
    String add(@RequestBody Probleme probleme,Long id_probleme){
        if(this.problemeService.creer(probleme,id_probleme)==null){
            return "cet probleme existe deja";
        }
        return "probleme ajouté";
    }


    @ApiOperation(value = "Creer un probleme")
    @PutMapping("/update/{id_probleme}")
    Probleme update(@RequestBody Probleme probleme, @PathVariable Long id_probleme){
        return problemeService.modifier(probleme, id_probleme);
    }


    @ApiOperation(value = "Creer un probleme")
    @DeleteMapping("/delete/{id_probleme}")
    String delete(@PathVariable Long id_probleme){
        return problemeService.supprimer(id_probleme);
    }


}
