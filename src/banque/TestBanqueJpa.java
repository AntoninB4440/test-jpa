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

		Banque BNP = new Banque("Banque Postal");

		em.persist(BNP);

		et.commit();

	}

}
