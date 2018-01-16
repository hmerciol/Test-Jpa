package fr.banque.jpa.model;

import java.time.LocalDate;

/**
 * Représente une assurance vie
 * 
 * @author hmerciol
 *
 */
public class AssuranceVie extends Compte {

	/**
	 * Date de fin de l'assurance vie
	 */
	private LocalDate dateFin;

	/**
	 * Taux de l'assurance vie
	 */
	private double taux;

	/**
	 * Récupère la date de fin de l'assurance
	 * 
	 * @return La date de fin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Affecte la date de fin de l'assurance
	 * 
	 * @param dateFin
	 *            La nouvelle date de fin
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Récupère le taux de l'assurance vie
	 * 
	 * @return Le taux de l'assurance
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Affecte le taux de l'assurance vie
	 * 
	 * @param taux
	 *            Le nouveau taux de l'assurance
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

}
