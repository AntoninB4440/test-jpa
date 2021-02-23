package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ville")
public class Ville {

	@Id
	private Integer id;

	@Column(name = "code_region")
	private String codeRegion;

	@Column(name = "code_departement")
	private String codeDepartement;

	@Column(name = "nom_Ville")
	private String nomVille;

	@Column(name = "population_ville")
	private String populationVille;

	public Ville() {

	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * @return the nomVille
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * @param nomVille the nomVille to set
	 */
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	/**
	 * @return the populationVille
	 */
	public String getPopulationVille() {
		return populationVille;
	}

	/**
	 * @param populationVille the populationVille to set
	 */
	public void setPopulationVille(String populationVille) {
		this.populationVille = populationVille;
	}

}
