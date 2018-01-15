package fr.testjpa.console;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.testjpa.model.Livre;

/**
 * @author hmerciol
 *
 */
public class TestJpa {

	/**
	 * Logger pour l'application
	 */
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            Paramètres
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager manager = factory.createEntityManager();

		int bookId = 3;

		Livre livre = manager.find(Livre.class, bookId);
		if (livre != null) {
			LOG.info("livre d'identifiant " + bookId + " : " + livre.getTitre() + " par " + livre.getAuteur());
		} else {
			LOG.info("Livre non trouvé");
		}

		manager.close();
		factory.close();
	}

}
