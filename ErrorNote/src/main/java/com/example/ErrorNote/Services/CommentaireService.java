package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Commentaire;

import java.util.List;

public interface CommentaireService {
    Commentaire Creer (Commentaire commentaire);
    String Supprimer(Long id_commentaire);

    List<Commentaire> lire();
}
