package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.Etat;
import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Repositories.ProblemeRepository;
import com.example.ErrorNote.Services.ProblemeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
@AllArgsConstructor
public class ProblemeImpl implements ProblemeService {
    @Autowired
ProblemeRepository problemeRepository;


    @Override
    public String creer(Probleme probleme, Long id_probleme) {
        Optional<Probleme> problemeOptional=problemeRepository.findByIdprobleme(probleme.getIdprobleme());
        if(problemeOptional.isPresent()){
            return null;
        }
        Probleme probleme1=this.problemeRepository.save(probleme);
        probleme1.setEtat(Etat.INITIAL);
        this.problemeRepository.save(probleme);
        return "Probleme creer";
    }

    @Override
    public Probleme modifier(Probleme probleme, Long id_probleme) {
        return problemeRepository.findById(id_probleme)
                .map(p -> {
                    p.setTitre(probleme.getTitre());
                    p.setDescription(probleme.getDescription());
                    p.setTechnologie(probleme.getTechnologie());
                    p.setMethodologie(probleme.getMethodologie());
                    p.setEtat(probleme.getEtat());
                    return problemeRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Ce Probleme n'existe pas !"));
    }

    @Override
    public String supprimer(Long idprobleme) {
        problemeRepository.deleteById(idprobleme);
        return "Suppression effectuée avec succés";
    }

    @Override
    public Object recherche(String mot_cle) {
        if (mot_cle != null) {
            List<Probleme> retrouve = problemeRepository.findAll(mot_cle);
            System.out.println(retrouve);
            if (retrouve.size() != 0) {
                return retrouve;
            }else{
                return "Désolé ce mot est introuvable !!";
            }
        }
        return problemeRepository.findAll();
    }

}