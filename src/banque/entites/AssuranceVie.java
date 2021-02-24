package banque.entites;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "assurance_vie")
public class AssuranceVie extends Compte {

	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

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
	public AssuranceVie(String numero, Double solde, List<Client> clients, LocalDate dateFin, Double taux) {
		super(numero, solde, clients);
		this.dateFin = dateFin;
		this.taux = taux;
	}

}
