package fr.testjpa.console;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.testjpa.model.Client;
import fr.testjpa.model.Emprunt;
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
		int livreId = 3; // id du livre
		Livre livre1 = manager.find(Livre.class, livreId);
		if (livre1 != null) {
			LOG.info("livre d'identifiant " + livreId + " : " + livre1.getTitre() + " par " + livre1.getAuteur());
		} else {
			LOG.info("Livre non trouvé");
		}

		// trouver un livre avec son titre
		String bookTitle = "Germinal"; // titre du livre
		TypedQuery<Livre> query1 = manager.createQuery("select l from Livre l where l.titre='" + bookTitle + "'",
				Livre.class);
		LOG.info("livres trouvés pour le titre " + bookTitle + " :");
		for (Livre livre2 : query1.getResultList()) {
			LOG.info("livre d'identifiant " + livre2.getId() + ", de titre " + livre2.getTitre() + " par "
					+ livre2.getAuteur());
		}

		// trouver un emprunt et les livres associés
		int empruntId = 1; // id de l'emprunt
		Emprunt emprunt1 = manager.find(Emprunt.class, empruntId);
		TypedQuery<Livre> query2 = manager
				.createQuery("select l from Livre l join l.emprunts e where e.id=" + emprunt1.getId(), Livre.class);
		LOG.info("livres concernés par l'emprunt " + emprunt1.getId() + " du " + emprunt1.getDateDebut().toString()
				+ " au " + emprunt1.getDateFin().toString() + " :");
		for (Livre livre3 : query2.getResultList()) {
			LOG.info("livre d'identifiant " + livre3.getId() + ", de titre " + livre3.getTitre() + " par "
					+ livre3.getAuteur());
		}

		// trouver tous les emprunts d'un client
		int clientId = 2; // id du client
		Client client1 = manager.find(Client.class, clientId);
		TypedQuery<Emprunt> query3 = manager
				.createQuery("select e from Emprunt e join e.client c where c.id=" + client1.getId(), Emprunt.class);
		LOG.info("Emprunts effectués par " + client1.getPrenom() + " " + client1.getNom() + " :");
		for (Emprunt emprunt2 : query3.getResultList()) {
			LOG.info("Emprunt n°" + emprunt2.getId() + " du " + emprunt2.getDateDebut().toString() + " au "
					+ emprunt2.getDateFin().toString());
		}

		manager.close();
		factory.close();
	}

}
