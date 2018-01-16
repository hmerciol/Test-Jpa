package fr.banque.jpa.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Représente un client
 * 
 * @author hmerciol
 *
 */
@Entity
public class Client {

	/**
	 * Identifiant du client
	 */
	@Id
	@GeneratedValue
	private Integer id_cl;

	/**
	 * Nom du client
	 */
	private String nom;

	/**
	 * Prénom du client
	 */
	private String prenom;

	/**
	 * Date de naissance du client
	 */
	private LocalDate dateNaissance;

	/**
	 * Banque du client
	 */
	@ManyToOne
	@JoinColumn
	private Banque banque;

	/**
	 * Adresse du client
	 */
	@Embedded
	private Adresse adresse;

	/**
	 * Comptes du client
	 */
	@ManyToMany
	@JoinTable(name = "client_compte_table", 
		joinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id_cl"), 
		inverseJoinColumns = @JoinColumn(name = "id_compte", referencedColumnName = "id_co"))
	private Set<Compte> comptes = new HashSet<>();

	/**
	 * Constructeur par défaut
	 */
	public Client() {
		super();
	}

	/**
	 * Constructeur avec nom, prénom et date de naissance
	 * 
	 * @param nom
	 *            Le nom du client
	 * @param prenom
	 *            Le prénom du client
	 * @param dateNaissance
	 *            La date de naissance du client
	 */
	public Client(String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Récupère l'identifiant client
	 * 
	 * @return L'identifiant
	 */
	public Integer getId() {
		return id_cl;
	}

	/**
	 * Affecte l'identifiant
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id_cl = id;
	}

	/**
	 * Récupère le nom de famille du client
	 * 
	 * @return Le nom du client
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Afecte le nom de famille du client
	 * 
	 * @param nom
	 *            Le nouveau nom du client
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Récupère le prénom du client
	 * 
	 * @return Le prénom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Affecte le nom du client
	 * 
	 * @param prenom
	 *            Le nouveau prénom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Récupère la date de naissance du client
	 * 
	 * @return La date de naissance du client
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Affecte la date de naissance du client
	 * 
	 * @param dateNaissance
	 *            La nouvelle date
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Récupère la banque du client
	 * 
	 * @return La banque du client
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Affecte la banque au client
	 * 
	 * @param banque
	 *            La nouvelle banque du client
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Récupère l'adresse du client
	 * 
	 * @return L'adresse du client
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Affecte l'adresse au client
	 * 
	 * @param adresse
	 *            La nouvelle adresse
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Récupère la liste des comptes du client
	 * 
	 * @return Les comptes du client
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Affecte la liste de comptes au client
	 * 
	 * @param comptes
	 *            La nouvelle liste de comptes
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * Ajoute un compte au client
	 * 
	 * @param compte
	 *            Le compte à ajouter
	 */
	public void addCompte(Compte compte) {
		this.comptes.add(compte);
	}

}
