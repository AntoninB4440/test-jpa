package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import fr.diginamic.entites.Client;
import fr.diginamic.entites.Emprunt;
import fr.diginamic.entites.Livre;

public class TestJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_JPA_Biblio");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre livre = em.find(Livre.class, 2);

		if (livre != null) {
			System.out.println("Livre recherché : " + livre);
		}

		System.out.println();

		// Requete SQL
		TypedQuery<Livre> query = em.createQuery("Select l from Livre l", Livre.class);
		List<Livre> livres = query.getResultList();

		System.out.println(livres);

		Emprunt emprunt = em.find(Emprunt.class, 1);

		System.out.println("Les Livres de l'emprunt " + emprunt.getId() + " sont :");
		for (Livre livre2 : emprunt.getLivres()) {
			System.out.println(livre2.getTitre());
		}

		System.out.println();

		Client client = em.find(Client.class, 1);

		System.out.println("Les emprunts du client : " + client.getId() + " sont :");
		for (Emprunt emprunt2 : client.getEmprunts()) {
			List<Livre> listLivresClient = emprunt2.getLivres();
			for (Livre livre3 : listLivresClient) {
				System.out.println(livre3.getTitre() + " | Date de début : " + emprunt2.getDate_debut()
						+ " | Date de fin : " + emprunt2.getDate_fin());
			}
		}

	}

}
