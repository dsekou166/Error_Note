package com.example.ErrorNote.Repositories;

import com.example.ErrorNote.Model.Probleme;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProblemeRepository extends JpaRepository<Probleme, Long> {


    Optional<Probleme> findByIdprobleme(Long id_probleme);
    @Query(value = "SELECT * FROM probleme WHERE probleme.titre LIKE %?1%" +
            " OR probleme.description LIKE %?1%" +
            " OR probleme.technologie LIKE %?1%" +
            " OR probleme.methodologie LIKE %?1%" +
            " OR probleme.etat LIKE %?1%", nativeQuery = true)
    List<Probleme> findAll(String mot_cle);
}
