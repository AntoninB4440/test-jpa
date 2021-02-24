package banque.entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
public class Virement extends Operation {

	@Column(name = "BENEFICIAIRE", nullable = false)
	private String beneficiaire;

	/**
	 * 
	 */
	public Virement() {
		super();
	}

	/**
	 * @param date
	 * @param montant
	 * @param motif
	 * @param compte
	 * @param beneficiaire
	 */
	public Virement(Date date, Double montant, String motif, Compte compte, String beneficiaire) {
		super(date, montant, motif, compte);
		this.beneficiaire = beneficiaire;
	}

	/**
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
