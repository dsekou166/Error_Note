package com.example.ErrorNote.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_commentaire;
    private String contenu;

    @ManyToOne
    @JoinColumn(name = "User_Commentaire")
    private User user;

    @ManyToOne
    @JoinColumn(name = "Solution_commentaire")
    private Solution solution;
}
