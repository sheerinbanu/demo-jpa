package fr.diginamic;

import jakarta.persistence.*;

@Entity
@Table(name="compo")
public class Compo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="id_livre", nullable = false)
    private Livre livre;

    @ManyToOne
    @JoinColumn(name="id_emprunt", nullable = false)
    private Emprunt emprunt;
}
