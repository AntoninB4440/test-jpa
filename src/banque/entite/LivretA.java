package banque.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livret_A")
public class LivretA extends Compte {

	@Column(name = "TAUX", nullable = false)
	private Double taux;

	/**
	 * 
	 */
	public LivretA() {
		super();
	}

	/**
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param taux
	 */
	public LivretA(String numero, Double solde, Double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	/**
	 * @return the taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

}
