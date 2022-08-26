package com.example.ErrorNote.Services;

import com.example.ErrorNote.Model.Probleme;
import com.example.ErrorNote.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User creer(User user);

    List<User> lire();

    User modifier(Long id_user, User user);

    String supprimer(Long id_user);

    String connecter(User user);

    String deconnecter();

}
