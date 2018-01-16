package fr.banque.jpa.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Représente une opération
 * 
 * @author hmerciol
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {

	/**
	 * Identifiant de l'opération
	 */
	@Id
	@GeneratedValue
	private Integer id_op;

	/**
	 * Date de l'opération
	 */
	private LocalDateTime date;

	/**
	 * Montant de l'opération
	 */
	private double montant;

	/**
	 * Motif de l'opération
	 */
	private String motif;

	/**
	 * Compte associé à l'opération
	 */
	@ManyToOne
	@JoinColumn(name = "id_co")
	private Compte compte;

	/**
	 * Récupère l'identifiant de l'opération
	 * 
	 * @return L'identifiant
	 */
	public Integer getId() {
		return id_op;
	}

	/**
	 * Affecte l'identifiant de l'opération
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id_op = id;
	}

	/**
	 * Récupère la date de l'opération
	 * 
	 * @return La date de l'opération
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Affecte la date de l'opération
	 * 
	 * @param date
	 *            La nouvelle date
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * Récupère le montant de l'opération
	 * 
	 * @return Le montant de l'opération
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Affecte le montant de l'opération
	 * 
	 * @param montant
	 *            Le nouveau montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Récupère le motif de l'opération
	 * 
	 * @return Le motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Affecte le motif de l'opération
	 * 
	 * @param motif
	 *            Le nouveau motif
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * Récupère le compte affecté par l'opération
	 * 
	 * @return Le compte affecté
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Affecte le compte associé à l'opération
	 * 
	 * @param compte
	 *            Le nouveau compte associé
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
