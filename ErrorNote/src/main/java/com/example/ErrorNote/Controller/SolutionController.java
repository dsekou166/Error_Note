package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Solution;
import com.example.ErrorNote.Services.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class SolutionController {

    @Autowired
    SolutionService solutionService;

    @PostMapping("/add")
    Solution add(@RequestBody Solution solution){
        return solutionService.creer(solution);
    }

    @PutMapping("/update/{id_solution}")
    Solution update(@RequestBody Solution solution, @PathVariable Long id_solution){
        return solutionService.modifier(solution, id_solution);
    }

    @DeleteMapping("/delete/{id_solution}")
    String delete(@PathVariable Long id_solution){
        return solutionService.supprimer(id_solution);
    }

}
