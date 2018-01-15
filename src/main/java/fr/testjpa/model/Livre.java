package fr.testjpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Représentation d'un livre (liée à la table du même nom)
 * 
 * @author hmerciol
 *
 */
@Entity
@Table(name = "LIVRE")
public class Livre {

	/**
	 * Identifiant du livre
	 */
	@Id
	private Integer id;

	/**
	 * Titre du livre
	 */
	@Column(name = "TITRE", nullable = false)
	private String titre;

	/**
	 * Auteur du livre
	 */
	@Column(name = "AUTEUR", nullable = false)
	private String auteur;

	/**
	 * Liste des emprunts référençant ce livre
	 */
	@ManyToMany(mappedBy = "livres")
	private Set<Emprunt> emprunts;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
