package com.example.ErrorNote.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String nom;
    private String prenom;
    private String contact;
    private String role;
    private String email;
    private String Mpd;

    @OneToMany (mappedBy ="user")
    List<Probleme> probleme = new ArrayList<>();

    @OneToMany (mappedBy ="user")
    List<Probleme> user = new ArrayList<>();
    @OneToMany (mappedBy ="user")
    List<Solution> solution = new ArrayList<>();

}
