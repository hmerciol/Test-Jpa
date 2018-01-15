package fr.testjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	@Column(name = "TITRE")
	private String titre;

	/**
	 * Auteur du livre
	 */
	@Column(name = "AUTEUR")
	private String auteur;

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

}
