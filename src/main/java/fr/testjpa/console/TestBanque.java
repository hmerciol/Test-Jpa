package fr.testjpa.console;

import java.time.LocalDate;
import java.time.LocalDateTime;
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
import fr.banque.jpa.model.AssuranceVie;
import fr.banque.jpa.model.Banque;
import fr.banque.jpa.model.Client;
import fr.banque.jpa.model.Compte;
import fr.banque.jpa.model.LivretA;
import fr.banque.jpa.model.Operation;

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

		Client client2 = new Client("Durand", "Jean", LocalDate.of(1984, 1, 3));
		Adresse adresse2 = new Adresse(3, "avenue des cerisiers", 56000, "Vannes");
		client2.setAdresse(adresse2);
		manager.persist(client2);

		// relations banques-clients
		banque1.addClient(client1);
		banque1.addClient(client2);

		// les comptes
		Compte compte1 = new Compte("123456ABC", 15000.0);
		manager.persist(compte1);
		Compte livretA1 = new LivretA("456798def", 53.24, 0.2);
		manager.persist(livretA1);
		Compte assuranceVie1 = new AssuranceVie("147852aze", 123000.5, LocalDate.of(2045, 12, 31), 0.01);
		manager.persist(assuranceVie1);

		// relations comptes-clients
		client1.addCompte(compte1);
		client2.addCompte(livretA1);
		client1.addCompte(assuranceVie1);
		client2.addCompte(assuranceVie1);

		// les opérations
		Operation operation1 = new Operation(LocalDateTime.of(2017, 12, 21, 14, 53), -60.0, "retrait en liquide");
		manager.persist(operation1);

		// relations opérations-comptes
		compte1.addOperation(operation1);

		transaction.commit();
		// données de base remplies

		// des requètes et traitements peuvent être efectués ici (penser à encadrer dans
		// une transaction)

		manager.close();
		factory.close();
	}

}
