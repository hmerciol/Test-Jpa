package fr.banque.jpa.model;

import javax.persistence.Embeddable;

/**
 * Repr�sente une adresse
 * 
 * @author hmerciol
 *
 */
@Embeddable
public class Adresse {

	/**
	 * Num�ro dans la rue
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
	 * R�cup�re le num�ro de rue
	 * 
	 * @return Le num�ro de rue
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Affecte le num�ro de rue
	 * 
	 * @param numero
	 *            Le nouveau num�ro
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * R�cup�re le nom de rue
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
	 * R�cup�re le code postal
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
	 * R�cup�re le nom de la ville
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
