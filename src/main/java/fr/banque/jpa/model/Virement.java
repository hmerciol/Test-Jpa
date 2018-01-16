package fr.banque.jpa.model;

import java.time.LocalDateTime;

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
	 * Constructeur par d�faut
	 */
	public Virement() {
		super();
	}

	/**
	 * Constructeur avec la date, le montant, le motif et le b�n�ficiaire du
	 * virement
	 * 
	 * @param date
	 *            La date effective du virement
	 * @param montant
	 *            Le montant du virement
	 * @param motif
	 *            Le motif du virement
	 * @param beneficiaire
	 *            Le nom du b�n�ficiaire
	 */
	public Virement(LocalDateTime date, double montant, String motif, String beneficiaire) {
		super(date, montant, motif);
		this.beneficiaire = beneficiaire;
	}

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
