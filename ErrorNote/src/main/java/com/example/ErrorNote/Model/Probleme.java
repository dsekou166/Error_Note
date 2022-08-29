package com.example.ErrorNote.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "probleme")
public class Probleme {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprobleme;
    private String titre;
    private String description;
    private String technologie;
    private String methodologie;

    @Enumerated(EnumType.STRING)
    private Etat etat;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "User_Problème")
    private User user;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "Solution_probleme")
    private Solution solution;


}
