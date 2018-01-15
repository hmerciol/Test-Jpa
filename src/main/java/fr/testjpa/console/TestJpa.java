package fr.testjpa.console;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
	private static final Logger LOG = LoggerFactory.getLogger("result");

	/**
	 * Point d'entrée de l'application
	 * 
	 * @param args
	 *            Paramètres
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager manager = factory.createEntityManager();

		// trouver un livre avec son id
		int bookId = 3;
		Livre livre1 = manager.find(Livre.class, bookId);
		if (livre1 != null) {
			LOG.info("livre d'identifiant " + bookId + " : " + livre1.getTitre() + " par " + livre1.getAuteur());
		} else {
			LOG.info("Livre non trouvé");
		}

		// trouver un livre avec son titre
		String bookTitle = "Germinal";
		TypedQuery<Livre> query1 = manager.createQuery("select l from Livre l where l.titre='" + bookTitle + "'",
				Livre.class);
		LOG.info("livres trouvés pour le titre " + bookTitle+" :");
		for (Livre livre2 : query1.getResultList()) {
			LOG.info("livre d'identifiant "+livre2.getId()+", de titre " + livre2.getTitre() + " par " + livre2.getAuteur());
		}

		manager.close();
		factory.close();
	}

}
