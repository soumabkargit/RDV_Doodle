package test.testjpa.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ChoixDate {
	private int idChoixDate;
	@Temporal(TemporalType.DATE)
	private Date dateSondage;
	private boolean pauseDejeuner;
	private Sondage sondage;
	
	@Id
	@GeneratedValue
	public int getIdChoixDate() {
		return idChoixDate;
	}
	public void setIdChoixDate(int idChoixDate) {
		this.idChoixDate = idChoixDate;
	}
	public Date getDateSondage() {
		return dateSondage;
	}
	public void setDateSondage(Date dateSondage) {
		this.dateSondage = dateSondage;
	}
	public boolean isPauseDejeuner() {
		return pauseDejeuner;
	}
	public void setPauseDejeuner(boolean pauseDejeuner) {
		this.pauseDejeuner = pauseDejeuner;
	}
	@OneToOne
	public Sondage getSondage() {
		return sondage;
	}
	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}

}
