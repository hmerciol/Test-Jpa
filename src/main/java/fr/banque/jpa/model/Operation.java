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
 * Repr�sente une op�ration
 * 
 * @author hmerciol
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {

	/**
	 * Identifiant de l'op�ration
	 */
	@Id
	@GeneratedValue
	private Integer id_op;

	/**
	 * Date de l'op�ration
	 */
	private LocalDateTime date;

	/**
	 * Montant de l'op�ration
	 */
	private double montant;

	/**
	 * Motif de l'op�ration
	 */
	private String motif;

	/**
	 * Compte associ� � l'op�ration
	 */
	@ManyToOne
	@JoinColumn(name = "id_co")
	private Compte compte;

	/**
	 * R�cup�re l'identifiant de l'op�ration
	 * 
	 * @return L'identifiant
	 */
	public Integer getId() {
		return id_op;
	}

	/**
	 * Affecte l'identifiant de l'op�ration
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id_op = id;
	}

	/**
	 * R�cup�re la date de l'op�ration
	 * 
	 * @return La date de l'op�ration
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * Affecte la date de l'op�ration
	 * 
	 * @param date
	 *            La nouvelle date
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * R�cup�re le montant de l'op�ration
	 * 
	 * @return Le montant de l'op�ration
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Affecte le montant de l'op�ration
	 * 
	 * @param montant
	 *            Le nouveau montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * R�cup�re le motif de l'op�ration
	 * 
	 * @return Le motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Affecte le motif de l'op�ration
	 * 
	 * @param motif
	 *            Le nouveau motif
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	/**
	 * R�cup�re le compte affect� par l'op�ration
	 * 
	 * @return Le compte affect�
	 */
	public Compte getCompte() {
		return compte;
	}

	/**
	 * Affecte le compte associ� � l'op�ration
	 * 
	 * @param compte
	 *            Le nouveau compte associ�
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}
