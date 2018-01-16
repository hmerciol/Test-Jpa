package fr.testjpa.console;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

		manager.close();
		factory.close();
	}

}
