package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.Commentaire;
import com.example.ErrorNote.Repositories.CommentaireRepository;
import com.example.ErrorNote.Services.CommentaireService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class CommentaireImpl implements CommentaireService {
    @Autowired
    CommentaireRepository commentaireRepository;

    @Override
    public Commentaire Creer (Commentaire commentaire){
        return commentaireRepository.save(commentaire);
    }
    @Override
    public List<Commentaire> lister(){
        return commentaireRepository.findAll();
    }

    @Override
    public String Supprimer(Long id_commentaire) {
        return "Commentaire supprimée avec succes";
    }

}
