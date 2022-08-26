package com.example.ErrorNote.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "solution")
public class Solution {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_solution;
    private String description;
    private String temps;
    private String ressource;

    @OneToMany (mappedBy ="solution")
    List<Commentaire> commentaires = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "User_Solution")
    private User user;

    @OneToOne
    @JoinColumn(name = "Solution_probleme")
    private Probleme probleme;

}
