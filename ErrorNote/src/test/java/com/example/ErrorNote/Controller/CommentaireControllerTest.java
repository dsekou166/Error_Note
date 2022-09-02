package com.example.ErrorNote.Controller;


import com.example.ErrorNote.Model.Commentaire;
import com.example.ErrorNote.Repositories.CommentaireRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CommentaireControllerTest {

    @Autowired
   CommentaireRepository commentaireRepository;


   /*@Test
   void add() {
        Commentaire test = new Commentaire();
        test.setContenu("juste pour le test");
        Commentaire commentaireSave = commentaireRepository.save(test);
   }*/

   @Test
    void delete() {
        Commentaire test = new Commentaire();
        test.setId_commentaire(22L);
        test.setContenu("juste pour le test");
        Commentaire commentaireSave = commentaireRepository.save(test);
        commentaireRepository.deleteById(commentaireSave.getId_commentaire());
    }
}