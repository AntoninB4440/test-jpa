package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * EntityManagerFactory entityManagerFactory =
		 * Persistence.createEntityManagerFactory("test_JPA"); EntityManager em =
		 * entityManagerFactory.createEntityManager();
		 * 
		 * Ville v = em.find(Ville.class, 50);
		 * 
		 * if (v != null) { System.out.println(v.getId() + " " + v.getCodeDepartement()
		 * + " " + v.getNomVille()); }
		 * 
		 * TypedQuery<Ville> query2 =
		 * em.createQuery("select v from Ville v where v.codeDepartement ='40'",
		 * Ville.class);
		 * 
		 * List<Ville> villes = query2.getResultList();
		 * 
		 * for (Ville ville : villes) { System.out.println(ville.getNomVille()); }
		 */

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_JPA_Biblio");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre livre = em.find(Livre.class, 2);

		if (livre != null) {
			System.out.println("Livre recherché : " + livre);
		}

		// Requete SQL
		TypedQuery<Livre> query = em.createQuery("Select l from Livre l", Livre.class);
		List<Livre> livres = query.getResultList();

		System.out.println(livres);

	}

}
