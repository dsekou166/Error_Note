package com.example.ErrorNote.Controller;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Repositories.UserRepository;
import com.example.ErrorNote.Services.ProblemeService;
import com.example.ErrorNote.Services.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Api(value = "hello", description = "UserController")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "Connexion")
    @GetMapping("/connexion/{email}/{mdp}")
    public String connexion(@PathVariable("email") String email, @PathVariable("mdp") String mdp){
        if(this.userService.Seconnecter(email,mdp)==null){
            return "failed";
        }
        this.userService.Seconnecter(email,mdp);
        return  "vous etes connectée avec succès";

    }


    @ApiOperation(value = "Creer un user")
    @PostMapping("/creer")
    public String add(@RequestBody User user,Long id_user){
        if( this.userService.creer(user,id_user)==null){
            return "Cet utilisateur existe deja";
        }
        //this.userService.creer(user,id_user);
        return "Utilisateur ajouté";
    }
    @ApiOperation(value = "Creer un user")
    @PostMapping("/admin/add")
    public  String admin(@RequestBody User user,Long id_user){
        if( this.userService.createAdmin(user,id_user)==null){
            return "admin existant";
        }
        return "existant ajouté";

    }


    @ApiOperation(value = "Creer un user")
    @PutMapping("/update/{id_user}")
    User update(@RequestBody User user, @PathVariable Long id_user){
        //retourner un String
        return userService.modifier(user, id_user);
    }
    //@GetMapping("/")
    String deconnect(){
        return userService.sedeconnecter();
    }

    //methode pour admin
    @ApiOperation(value = "Creer un user")
    @GetMapping("/list")
    List<User> lister(){
        return userService.lister();
    }

    //methode pour admin
    @ApiOperation(value = "Creer un user")
    @DeleteMapping("/delete/{id_user}")
    String delete(Long id_user){
        return userService.supprimer(id_user);
    }


    }
