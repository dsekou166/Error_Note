package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Repositories.ProblemeRepository;
import com.example.ErrorNote.Services.ProblemeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
@AllArgsConstructor
public class ProblemeImpl implements ProblemeService {
    ProblemeRepository problemeRepository;

    @Override
    public Probleme creer(Probleme probleme) {
        return problemeRepository.save(probleme);
    }

    @Override
    public List<Probleme> lire() {
        return problemeRepository.findAll();
    }

    @Override
    public Probleme modifier(Long id_probleme, Probleme probleme) {
        return problemeRepository.findById(id_probleme)
                .map(P -> {
                    P.setTitre(probleme.getTitre());
                    P.setDescription(probleme.getDescription());
                    P.setTechnologie(probleme.getTechnologie());
                    P.setMethodologie(probleme.getMethodologie());
                    P.setEtat(probleme.getEtat());
                    return problemeRepository.save(P);
                }).orElseThrow(() -> new RuntimeException("Commentaire non trouvé"));
    }

    @Override
    public String supprimer(Long id_probleme) {
        problemeRepository.deleteById(id_probleme);
        return "Commentaire supprimer !";
    }

    @Override
    public Object recherche(String mot_cle) {
        if (mot_cle != null) {
            List<Probleme> retrouve = problemeRepository.findAll(mot_cle);
            System.out.println(retrouve);
            if (retrouve.size() != 0) {
                return retrouve;
            } else {
                return "Desole ce mot est introuvable";
            }
        }
        return problemeRepository.findAll();

    }
}