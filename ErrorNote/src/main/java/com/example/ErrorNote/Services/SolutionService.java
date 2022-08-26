package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Solution;

import java.util.List;

public interface SolutionService {
    Solution creer(Solution solution);
    Solution modifier(Solution solution, Long id_solution);
    String supprimer(Long id_solution);

}
