package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = entityManagerFactory.createEntityManager();

        Region region = em.find(Region.class,1);
        if (region!=null){
            System.out.println("Nom de la region " + region);
        }

        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            Region region2 = new Region();
            region2.setNom("Mayotte");
            em.persist(region2);
            transaction.commit();
            System.out.println("Connexion réussie à la base de données.");
        } catch (Exception e) {
            System.out.println("Échec de la connexion à la base de données.");
            e.printStackTrace();
        }
        em.close();
        entityManagerFactory.close();

    }
}
