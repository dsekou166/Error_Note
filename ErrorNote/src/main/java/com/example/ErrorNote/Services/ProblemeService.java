package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Probleme;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProblemeService {

    Probleme creer(Probleme probleme);

    List<Probleme> lire();

    Probleme modifier(Long id_probleme, Probleme probleme);

    String supprimer(Long id_probleme);

    Object recherche(String mot_cle);


}
