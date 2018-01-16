package fr.banque.jpa.model;

import java.time.LocalDate;

import javax.persistence.Entity;

/**
 * Représente une assurance vie
 * 
 * @author hmerciol
 *
 */
@Entity
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
	 * Constructeur par défaut
	 */
	public AssuranceVie() {
		super();
	}

	/**
	 * Constructeur avec numéro, solde, date de fin et taux de l'assurance vie
	 * 
	 * @param numero
	 *            Le numéro de l'assurance
	 * @param solde
	 *            Le solde de l'assurance
	 * @param dateFin
	 *            La date de fin de l'assurance
	 * @param taux
	 *            Le taux de l'assurance
	 */
	public AssuranceVie(String numero, double solde, LocalDate dateFin, double taux) {
		super(numero, solde);
		this.dateFin = dateFin;
		this.taux = taux;
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
