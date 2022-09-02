package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.*;
import com.example.ErrorNote.Repositories.ProblemeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class ProblemeControllerTest {

    @Autowired
    ProblemeRepository problemeRepository;

   /* @Test
    void recherche() {
        Probleme pro = new Probleme();
        pro.setEtat(Etat.INITIAL);
        pro.setIdprobleme(1L);
        pro.setTitre("Mot de recherche");
        pro.setTechnologie("Google");
        pro.setMethodologie("Fatigue");
        pro.setDescription("bugg");

        Probleme problemeSave = problemeRepository.save(pro);
        problemeRepository.findById(pro.getIdprobleme());
    }

    /*@Test
    void add() {
        Probleme pro = new Probleme();
       pro.setIdprobleme(1L);
       pro.setDescription("l'eaupoudre");
       pro.setMethodologie("WINDOWS");
       pro.setTechnologie("PYTHON");
       pro.setEtat(Etat.INITIAL);
       pro.setTitre("Bugg");

       Probleme problemeSave = problemeRepository.save(pro);
       Probleme problemeAjouter = problemeSave;
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
        Probleme supp = new Probleme();
        supp.setIdprobleme(18L);
        supp.setTechnologie("Pipo");
        supp.setDescription("boulot");
        supp.setTechnologie("pigeon");
        supp.setEtat(Etat.INITIAL);

        Probleme suppSave = problemeRepository.save(supp);
        problemeRepository.deleteById(supp.getIdprobleme());

    }*/
}