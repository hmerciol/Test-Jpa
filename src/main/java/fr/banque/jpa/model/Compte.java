package fr.banque.jpa.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Représente un compte
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
	 * Numéro du compte
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
	 * Les opérations à effectuer sur le compte
	 */
	@OneToMany(mappedBy = "compte")
	private Set<Operation> operations;

	/**
	 * Récupère l'identifiant du compte
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
	 * Récupère le numéro de compte
	 * 
	 * @return Le numéro du compte
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Affecte le numéro du compte
	 * 
	 * @param numero
	 *            Le nouveau numéro de compte
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Récupère le solde du compte
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
	 * Récupère les clients de ce compte
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
	 * Récupère les opérations sur le compte
	 * 
	 * @return Les opérations du compte
	 */
	public Set<Operation> getOperations() {
		return operations;
	}

	/**
	 * Affecte des opérations au compte
	 * 
	 * @param operations
	 *            Les nouvelles opérations du compte
	 */
	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

}
