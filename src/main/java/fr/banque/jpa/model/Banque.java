package fr.banque.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Représentation d'une banque
 * 
 * @author hmerciol
 *
 */
@Entity
public class Banque {

	/**
	 * Identifiant de la banque
	 */
	@Id
	private Integer id_ba;

	/**
	 * Nom de la banque
	 */
	private String nom;

	/**
	 * Clients de la banque
	 */
	@OneToMany(mappedBy = "banque")
	private Set<Client> clients;

	/**
	 * Constructeur par défaut
	 */
	public Banque() {
		super();
	}

	/**
	 * Constructeur avec identifiant et nom de la banque
	 * @param id L'identifiant de la banque
	 * @param nom Le nom de la banque
	 */
	public Banque(Integer id, String nom) {
		super();
		this.id_ba = id;
		this.nom = nom;
	}

	/**
	 * Récupère l'identifiant
	 * 
	 * @return L'identifiant
	 */
	public Integer getId() {
		return id_ba;
	}

	/**
	 * Affecte l'identifiant
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id_ba = id;
	}

	/**
	 * Récupère de nom de la banque
	 * 
	 * @return Le nom de la banque
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Affecte le nom de la banque
	 * 
	 * @param nom
	 *            La nouvelle banque
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Récupère la liste des clients
	 * 
	 * @return La liste des clients
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * Affecte la liste des clients
	 * 
	 * @param clients
	 *            La nouvelle liste de clients
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

}
