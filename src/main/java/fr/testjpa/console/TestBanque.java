package fr.testjpa.console;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.banque.jpa.model.Adresse;
import fr.banque.jpa.model.Banque;
import fr.banque.jpa.model.Client;
import fr.banque.jpa.model.Compte;

/**
 * @author hmerciol
 *
 */
public class TestBanque {

	/**
	 * Logger de sortie pour l'application
	 */
	private static final Logger LOG = LoggerFactory.getLogger("result");

	/**
	 * Logger d'erreur pour l'application
	 */
	private static final Logger ERR = LoggerFactory.getLogger("error");

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            Paramètres
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tp_banque");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		// remplissage de la BDD
		transaction.begin();

		// les banques
		Banque banque1 = new Banque("le Bon Crédit");
		manager.persist(banque1);

		// les clients
		Client client1 = new Client("Dupont", "Gérard", LocalDate.of(1974, 7, 22));
		Adresse adresse1 = new Adresse(85, "rue des routiers", 44000, "Nantes");
		client1.setAdresse(adresse1);
		manager.persist(client1);

		// relations banques-clients
		client1.setBanque(banque1);

		// les comptes
		Compte compte1 = new Compte("123456ABC", 15000.0);
		manager.persist(compte1);

		// relations comptes-clients
		client1.addCompte(compte1);

		transaction.commit();
		// données de base remplies

		Query query = manager.createQuery("select b from Banque b");
		LOG.info("Le résultat contient : " + query.getResultList().size() + " items");

		manager.close();
		factory.close();
	}

}
