package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Solution;
import com.example.ErrorNote.Repositories.SolutionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SolutionControllerTest {
    @Autowired
    SolutionRepository solutionRepository;

   /* @Test
    void add() {
        Solution sol = new Solution();
        sol.setDescription("Meilleurs solution");
        sol.setRessource("Chioppas");
        sol.setTemps("07H30");
        Solution solutionSave = solutionRepository.save(sol);

        assertNotNull(solutionSave);
        assertEquals(solutionSave.getDescription(), sol.getDescription());
        assertEquals(solutionSave.getTemps(), sol.getTemps());
        assertEquals(solutionSave.getRessource(), sol.getRessource());
    }

    @Test
    void update() {
        Solution solutionAdd = new Solution();
        solutionAdd.setDescription("la meilleure internet");
        solutionAdd.setTemps("12H00");
        solutionAdd.setRessource("youtube.com");
        Solution solutionSave = solutionRepository.save(solutionAdd);

        Solution solutionModifier = solutionSave;
        solutionModifier.setDescription("la solution Sagara");
        solutionModifier.setRessource("Googlet");
        solutionSave = solutionRepository.save(solutionModifier);

        assertNotNull(solutionModifier);
        assertEquals(solutionModifier.getDescription(), solutionSave.getDescription());
        assertEquals(solutionModifier.getTemps(), solutionSave.getTemps());
        assertEquals(solutionModifier.getRessource(), solutionSave.getRessource());

    }*/

    @Test
    void delete() {
        Solution solutionAdd = new Solution();
        solutionAdd.setId_solution(6L);
        solutionAdd.setDescription("la meilleure internet");
        solutionAdd.setTemps("17H00");
        solutionAdd.setRessource("Gooom");
        Solution solutionSave = solutionRepository.save(solutionAdd);
        assertNotNull(solutionSave);
        assertNotNull(solutionSave.getId_solution());
        solutionRepository.deleteById(solutionSave.getId_solution());
    }
}