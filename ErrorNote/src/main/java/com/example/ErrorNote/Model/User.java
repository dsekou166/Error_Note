package com.example.ErrorNote.Model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String nom;
    private String prenom;
    private String contact;
    private String role;
    private String email;
    private String mpd;

    @OneToMany (mappedBy ="user")
    List<Probleme> probleme = new ArrayList<>();

    @OneToMany (mappedBy ="user")
    List<Probleme> user = new ArrayList<>();
    @OneToMany (mappedBy ="user")
    List<Solution> solution = new ArrayList<>();

}
