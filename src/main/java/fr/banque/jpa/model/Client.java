package fr.banque.jpa.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Repr�sente un client
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
	private Integer id;

	/**
	 * Nom du client
	 */
	private String nom;

	/**
	 * Pr�nom du client
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
	@JoinTable(name = "CLIENT_COMPTE_TABLE",
			joinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"))
	private Set<Compte> comptes;

	/**
	 * R�cup�re l'identifiant client
	 * 
	 * @return L'identifiant
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Affecte l'identifiant
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * R�cup�re le nom de famille du client
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
	 * R�cup�re le pr�nom du client
	 * 
	 * @return Le pr�nom du client
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Affecte le nom du client
	 * 
	 * @param prenom
	 *            Le nouveau pr�nom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * R�cup�re la date de naissance du client
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
	 * R�cup�re la banque du client
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
	 * R�cup�re l'adresse du client
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
	 * R�cup�re la liste des comptes du client
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

}
