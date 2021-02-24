package banque.entite;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "assurance_vie")
public class AssuranceVie extends Compte {

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_FIN")
	private Date dateFin;

	@Column(name = "TAUX")
	private Double taux;

	/**
	 * 
	 */
	public AssuranceVie() {
		super();
	}

	/**
	 * @param numero
	 * @param solde
	 * @param clients
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(String numero, Double solde, List<Client> clients, Date dateFin, Double taux) {
		super(numero, solde, clients);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
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
