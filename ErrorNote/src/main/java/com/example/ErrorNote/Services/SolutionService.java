package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Solution;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SolutionService {
    Solution creer(Solution solution);
    Solution modifier(Solution solution, Long id_solution);
    String supprimer(Long id_solution);

}
