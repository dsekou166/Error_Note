package com.example.ErrorNote.Services.Impl;

import com.example.ErrorNote.Model.User;
import com.example.ErrorNote.Repositories.UserRepository;
import com.example.ErrorNote.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ErrorNote.Model.Role;
import java.util.List;
import java.util.Optional;

@Data
@Service
@AllArgsConstructor
public class UserImpl implements UserService {
    @Autowired
    UserRepository userRepository;



    @Override
    public String creer(User user,Long id_user) {
        Optional<User> userOptional=userRepository.findByEmail(user.getEmail());
        if (userOptional.isPresent()){
            return null;
        }

        User user1=this.userRepository.save(user);
        //User user1=userRepository.findById_user(id_user).get();
        user1.setRole(Role.User);
        this.userRepository.save(user);
        return "Utilisateur Creer";
    }

    @Override
    public  String createAdmin(User user, Long id_user){
        Optional<User> userOptional=userRepository.findByEmail(user.getEmail());
        if (userOptional.isPresent()){
            return null;
        }
        User user1=this.userRepository.save(user);
        //User user1=userRepository.findById_user(id_user).get();
        user1.setRole(Role.Admin);
        this.userRepository.save(user);
        return "Admin Creer";

//        User u=userRepository.findByEmail(user.getEmail()).get();
//        u.setRole(Role.Admin);
//        return  userRepository.save(user);
    }

    @Override
    public User modifier(User user, Long id_user) {
        return userRepository.findById(id_user)
                .map(u ->{
                    u.setNom(user.getNom());
                    u.setPrenom(user.getPrenom());
                    u.setContact(user.getContact());
                    u.setMpd(user.getMpd());
                    u.setEmail(user.getEmail());
                    return userRepository.save(u);
                } ).orElseThrow(() -> new RuntimeException("Cet utilisateur n'existe pas !"));
    }

    @Override
    public String sedeconnecter() {
        return "Vous avez été déconnecter !";
    }

    @Override
    public User Seconnecter(String email, String mdp) {
        Optional<User> user= userRepository.findByEmailAndPassword(email,mdp);
        // TTT
        if (user.isPresent()){
            return null;
        }
        return user.get();

    }

    //methode  Admin
    @Override
    public List<User> lister() {

        return userRepository.findAll();
    }
    @Override
    public String supprimer(Long id_user) {
        userRepository.deleteById(id_user);
        return "Suppression effectuée avec succés !";
    }
}
