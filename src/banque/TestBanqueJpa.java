package banque;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.entite.Adresse;
import banque.entite.AssuranceVie;
import banque.entite.Banque;
import banque.entite.Client;
import banque.entite.Compte;
import banque.entite.LivretA;
import banque.entite.Operation;
import banque.entite.Virement;

public class TestBanqueJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_JPA_Banque");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		//// Ajout 2 Banques
		Banque CA = new Banque("Crédit agricol");
		Banque BNP = new Banque("BNP");

		// Ajout de 3 comptes
		Compte compte1 = new Compte("000458796", 200000.00);
		Compte compte2 = new Compte("000458798", -5000.00);

		LivretA livret1 = new LivretA("000458769", 300.00, 1.5);
		AssuranceVie assurance1 = new AssuranceVie("000458770", 52654.00, new Date(122, 11, 31), 1.5);

		// Ajout de 2 clients
		Client client1 = new Client("Barcelo", "Antonin", new Date(94, 10, 01),
				new Adresse(128, "Impasse des Nymphéas", 44300, "Nantes"), BNP,
				Arrays.asList(compte1, livret1, assurance1));

		Client client2 = new Client("Depardieu", "Gérard", new Date(68, 11, 25),
				new Adresse(7851, "Rue de la soif", 40589, "Mont-deMarsan"), CA, Arrays.asList(compte1, compte2));

		Operation operation1 = new Operation(new Date(121, 01, 24), -514.00, "Achat chaussures", compte1);
		compte1.setSolde(compte1.getSolde() + operation1.getMontant());

		Operation operation2 = new Operation(new Date(121, 01, 24), 514.00, "Salaires de pauvre", livret1);

		Virement operation3 = new Virement(new Date(121, 01, 24), 514.00, "Cadeau", livret1, client1.getNom());

		em.persist(CA);
		em.persist(BNP);
		em.persist(compte1);
		em.persist(compte2);
		em.persist(livret1);
		em.persist(assurance1);
		em.persist(client1);
		em.persist(client2);
		em.persist(operation1);
		em.persist(operation2);
		em.persist(operation3);

		et.commit();

	}

}
