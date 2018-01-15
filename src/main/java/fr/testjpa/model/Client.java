package fr.testjpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Représentation d'un client (liée à la table du même nom)
 * 
 * @author hmerciol
 *
 */
@Entity
@Table(name = "CLIENT")
public class Client {

	/**
	 * Identifiant du client
	 */
	@Id
	private Integer id;

	/**
	 * Nom du client
	 */
	@Column(name = "NOM", nullable = false)
	private String nom;

	/**
	 * Prenom du client
	 */
	@Column(name = "PRENOM", nullable = false)
	private String prenom;

	/**
	 * Liste des emprunts effectués par un client
	 */
	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
