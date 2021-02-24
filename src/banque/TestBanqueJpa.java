package banque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import banque.entite.Banque;

public class TestBanqueJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_JPA_Banque");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		//// Ajout Banque
		Banque CA = new Banque("Crédit agricol");
		Banque BNP = new Banque("BNP");

		em.persist(CA);
		em.persist(BNP);

		et.commit();

	}

}
