package com.example.ErrorNote.Repositories;

import com.example.ErrorNote.Model.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{
}
