package fr.diginamic;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="emprunt")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(TemporalType.DATE)
    private LocalDateTime date_debut;
    private int delai;
    @Temporal(TemporalType.DATE)
    private LocalDateTime date_fin;

    @ManyToOne
    @JoinColumn(name="id_client")
    private Client client;


}
