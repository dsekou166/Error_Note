package com.example.ErrorNote.Repositories;

import com.example.ErrorNote.Model.Probleme;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProblemeRepository extends JpaRepository<Probleme, Long> {

    @Query (value = "Select * from probleme WHERE probleme.titre LIKE %?1% " + " OR probleme.description LIKE %?1%", nativeQuery = true)
    List<Probleme> findAll(String mot_cle);
}
