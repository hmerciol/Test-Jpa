package fr.banque.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Repr�sente un compte
 * 
 * @author hmerciol
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {

	/**
	 * L'identifiant du compte
	 */
	@Id
	private Integer id;

	/**
	 * Num�ro du compte
	 */
	private String numero;

	/**
	 * Solde du compte
	 */
	private double solde;

	/**
	 * Les clients possesseurs du compte
	 */
	@ManyToMany(mappedBy = "comptes")
	private Set<Client> clients;

	/**
	 * Les op�rations � effectuer sur le compte
	 */
	@OneToMany(mappedBy = "compte")
	private Set<Operation> operations;

	/**
	 * R�cup�re l'identifiant du compte
	 * 
	 * @return L'identifiant du compte
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Affecte l'identifiant du compte
	 * 
	 * @param id
	 *            Le nouvel identifiant
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * R�cup�re le num�ro de compte
	 * 
	 * @return Le num�ro du compte
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Affecte le num�ro du compte
	 * 
	 * @param numero
	 *            Le nouveau num�ro de compte
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * R�cup�re le solde du compte
	 * 
	 * @return Le solde du compte
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Affecte le solde du compte
	 * 
	 * @param solde
	 *            Le nouveau solde du compte
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * R�cup�re les clients de ce compte
	 * 
	 * @return Les clients du compte
	 */
	public Set<Client> getClients() {
		return clients;
	}

	/**
	 * Affecte les clients du compte
	 * 
	 * @param clients
	 *            Les nouveaux clients du compte
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	/**
	 * R�cup�re les op�rations sur le compte
	 * 
	 * @return Les op�rations du compte
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/**
	 * Affecte des op�rations au compte
	 * 
	 * @param operations
	 *            Les nouvelles op�rations du compte
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

}
