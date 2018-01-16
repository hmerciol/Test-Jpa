package fr.banque.jpa.model;

import javax.persistence.Entity;

/**
 * Représente un livret A
 * 
 * @author hmerciol
 *
 */
@Entity
public class LivretA extends Compte {

	/**
	 * Taux du livret A
	 */
	private double taux;

	/**
	 * Constructeur par défaut
	 */
	public LivretA() {
		super();
	}

	/**
	 * Constructeur avec numéro, solde et taux du livret
	 * 
	 * @param numero
	 *            Le numéro du livret
	 * @param solde
	 *            Le solde du livret
	 * @param taux
	 *            Le taux du livret
	 */
	public LivretA(String numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	/**
	 * Récupère le taux du livret A
	 * 
	 * @return Le taux du livret
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Affecte le taux du livret A
	 * 
	 * @param taux
	 *            Le nouveau taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
