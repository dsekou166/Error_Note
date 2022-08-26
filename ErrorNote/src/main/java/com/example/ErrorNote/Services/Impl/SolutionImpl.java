package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.Solution;
import com.example.ErrorNote.Repositories.SolutionRepository;
import com.example.ErrorNote.Services.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;

public class SolutionImpl implements SolutionService {
    @Autowired
    SolutionRepository solutionRepository;
    @Override
    public Solution creer(Solution solution) {
        return solutionRepository.save(solution);
    }

    @Override
    public Solution modifier(Solution solution, Long id_solution) {
        return solutionRepository.findById(id_solution)
                .map(s ->{
                    s.setDescription(solution.getDescription());
                    s.setTemps(solution.getTemps());
                    s.setRessource(solution.getRessource());
                    return solutionRepository.save(s);
                } ).orElseThrow(() -> new RuntimeException("Cette solution n'existe pas !"));
    }

    @Override
    public String supprimer(Long id_solution) {
        solutionRepository.deleteById(id_solution);
        return "Suppression effectuée avec succés !";
    }

}
