package fr.banque.jpa.model;

import javax.persistence.Entity;

/**
 * Représente un virement
 * 
 * @author hmerciol
 *
 */
@Entity
public class Virement extends Operation {

	/**
	 * Le bénéficiaire du virement
	 */
	private String beneficiaire;

	/**
	 * Récupère le bénéficiaire du virement
	 * 
	 * @return Le bénéficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Affecte le bénéficiaire du virement
	 * 
	 * @param beneficiaire
	 *            Le nouveau bénéficiaire
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
