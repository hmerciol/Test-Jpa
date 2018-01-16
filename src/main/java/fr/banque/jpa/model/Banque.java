package fr.banque.jpa.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Repr�sentation d'une banque
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
	@GeneratedValue
	private Integer id_ba;

	/**
	 * Nom de la banque
	 */
	private String nom;

	/**
	 * Clients de la banque
	 */
	@OneToMany(mappedBy = "banque")
	private Set<Client> clients = new HashSet<>();

	/**
	 * Constructeur par d�faut
	 */
	public Banque() {
		super();
	}

	/**
	 * Constructeur avec le nom de la banque
	 * 
	 * @param nom
	 *            Le nom de la banque
	 */
	public Banque(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * R�cup�re l'identifiant
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
	 * R�cup�re de nom de la banque
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
	 * R�cup�re la liste des clients
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

	/**
	 * Ajoute un client � la banque
	 * 
	 * @param client
	 *            Le nouveau client
	 */
	public void addClient(Client client) {
		client.setBanque(this);
	}

}
