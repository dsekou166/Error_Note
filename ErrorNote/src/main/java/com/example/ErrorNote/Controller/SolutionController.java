package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Solution;
import com.example.ErrorNote.Services.SolutionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "hello", description = "SolutionController")

@RestController
@RequestMapping("/solution")
@AllArgsConstructor
public class SolutionController {

    @Autowired
    SolutionService solutionService;

    @ApiOperation(value = "Creer une solution")
    @PostMapping("/creer")
    Solution add(@RequestBody Solution solution){
        return solutionService.creer(solution);
    }

    @ApiOperation(value = "Creer une solution")
    @PutMapping("/update/{id_solution}")
    Solution update(@RequestBody Solution solution, @PathVariable Long id_solution){
        return solutionService.modifier(solution, id_solution);
    }

    @ApiOperation(value = "Creer une solution")
    @DeleteMapping("/delete/{id_solution}")
    String delete(@PathVariable Long id_solution){
        return solutionService.supprimer(id_solution);
    }

}
