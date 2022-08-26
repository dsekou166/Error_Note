package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Repositories.ProblemeRepository;
import com.example.ErrorNote.Repositories.UserRepository;
import com.example.ErrorNote.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
@AllArgsConstructor
public class UserImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public User creer(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> lire() {
        return userRepository.findAll();
    }

    @Override
    public User modifier(Long id_user, User user) {
        return userRepository.findById(id_user)
                .map(U->{
                    U.setNom(user.getNom());
                    U.setPrenom(user.getPrenom());
                    U.setContact(user.getContact());
                    U.setRole(user.getRole());
                    return userRepository.save(U);
                }).orElseThrow(()->new RuntimeException("User non retrouvé"));
    }

    @Override
    public String supprimer(Long id_user) {
        userRepository.deleteById(id_user);
        return "Utilisateur supprimer !";
    }

    @Override
    public String connecter(User user) {
        return null;
    }

    @Override
    public String deconnecter() {
        return null;
    }
}
