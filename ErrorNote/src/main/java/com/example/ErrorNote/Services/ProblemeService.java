package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Probleme;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProblemeService {String creer(Probleme probleme, Long idprobleme);
    Probleme modifier(Probleme probleme, Long idprobleme);

    String supprimer(Long idprobleme);

    Object recherche(String mot_cle);


}
