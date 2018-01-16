package fr.banque.jpa.model;

import java.time.LocalDateTime;

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
	 * Constructeur par défaut
	 */
	public Virement() {
		super();
	}

	/**
	 * Constructeur avec la date, le montant, le motif et le bénéficiaire du
	 * virement
	 * 
	 * @param date
	 *            La date effective du virement
	 * @param montant
	 *            Le montant du virement
	 * @param motif
	 *            Le motif du virement
	 * @param beneficiaire
	 *            Le nom du bénéficiaire
	 */
	public Virement(LocalDateTime date, double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
	}

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
