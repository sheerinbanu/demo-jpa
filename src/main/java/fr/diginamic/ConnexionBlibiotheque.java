package fr.diginamic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ConnexionBlibiotheque {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblio");
        EntityManager em = emf.createEntityManager();

             Livre l1 = em.find(Livre.class, 1);
        System.out.println(l1);

        TypedQuery<Livre> query1 = em.createQuery("select l from Livre l ", Livre.class);
        List<Livre> livresList = query1.getResultList();
        for(Livre l:livresList){
            System.out.println(l);
        }
        em.close();
        emf.close();
    }
}
