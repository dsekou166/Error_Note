package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    //methode pour admin
    List<User> lister();
    ///methode pour admin
    String creer(User user,Long id_user);
    //methode pour admin
    String createAdmin(User user, Long id_user);

    User modifier(User user, Long id_user);
    String sedeconnecter();
    String Seconnecter(String email,String mdp);

    ///methode pour admin
    String supprimer(Long id_user);

}
