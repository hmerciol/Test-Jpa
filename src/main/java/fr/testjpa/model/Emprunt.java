package fr.testjpa.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Représentation d'un emprunt (liée à la table du même nom)
 * 
 * @author hmerciol
 *
 */
@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

	/**
	 * Identifiant de l'emprunt
	 */
	@Id
	private Integer id;

	/**
	 * Date du début de l'emprunt
	 */
	@Column(name = "DATE_DEBUT", nullable = false)
	private LocalDate dateDebut;

	/**
	 * Délai maximum de l'emprunt
	 */
	@Column(name = "DELAI")
	private Integer delai;

	/**
	 * Date de fin de l'emprunt
	 */
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	/**
	 * Client ayant effectué l'emprunt
	 */
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	/**
	 * Liste des livres empruntés
	 */
	@ManyToMany
	@JoinTable(name = "COMPO", 
		joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private Set<Livre> livres;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Integer getDelai() {
		return delai;
	}

	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Client getIdClient() {
		return client;
	}

	public void setIdClient(Client client) {
		this.client = client;
	}

	public Set<Livre> getLivres() {
		return livres;
	}

	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

}
