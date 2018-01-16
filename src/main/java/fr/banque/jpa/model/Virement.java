package fr.banque.jpa.model;

import javax.persistence.Entity;

/**
 * Repr�sente un virement
 * 
 * @author hmerciol
 *
 */
@Entity
public class Virement extends Operation {

	/**
	 * Le b�n�ficiaire du virement
	 */
	private String beneficiaire;

	/**
	 * R�cup�re le b�n�ficiaire du virement
	 * 
	 * @return Le b�n�ficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Affecte le b�n�ficiaire du virement
	 * 
	 * @param beneficiaire
	 *            Le nouveau b�n�ficiaire
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
