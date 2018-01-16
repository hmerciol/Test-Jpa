package fr.banque.jpa.model;

import javax.persistence.Embeddable;

/**
 * Représente une adresse
 * 
 * @author hmerciol
 *
 */
@Embeddable
public class Adresse {

	/**
	 * Numéro dans la rue
	 */
	private int numero;

	/**
	 * Nom de la rue
	 */
	private String rue;

	/**
	 * Code postal de l'adresse
	 */
	private int codePostal;

	/**
	 * Nom de la ville
	 */
	private String ville;

	/**
	 * Récupère le numéro de rue
	 * 
	 * @return Le numéro de rue
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Affecte le numéro de rue
	 * 
	 * @param numero
	 *            Le nouveau numéro
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Récupère le nom de rue
	 * 
	 * @return Le nom de rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Affecte le nom de rue
	 * 
	 * @param rue
	 *            La nouvelle rue
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Récupère le code postal
	 * 
	 * @return Le code postal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Affecte le code postal
	 * 
	 * @param codePostal
	 *            Le nouveau code postal
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Récupère le nom de la ville
	 * 
	 * @return Le nom de la ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Affecte le nom de la ville
	 * 
	 * @param ville
	 *            La nouvelle ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
