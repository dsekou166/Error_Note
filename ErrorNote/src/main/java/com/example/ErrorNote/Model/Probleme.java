package com.example.ErrorNote.Model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "probleme")
public class Probleme {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_probleme;
    private String titre;
    private String description;
    private String technologie;
    private String methodologie;
    private String etat;

    @ManyToOne
    @JoinColumn(name = "User_Problème")
    private User user;

    @OneToOne
    @JoinColumn(name = "Solution_probleme")
    private Solution solution;


}
