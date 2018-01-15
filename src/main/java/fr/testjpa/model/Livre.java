package fr.testjpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Repr�sentation d'un livre (li�e � la table du m�me nom)
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
	 * Liste des emprunts r�f�ren�ant ce livre
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
