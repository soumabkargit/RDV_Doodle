package test.testjpa.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Reunion {
	
	private int idReunion;
	private String intitule;
	private String resume;
	private Collection<Sondage> sondages;
	
	@Id
	@GeneratedValue
	public int getIdReunion() {
		return idReunion;
	}
	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	@OneToMany(mappedBy="reunion")
	public Collection<Sondage> getSondages() {
		return sondages;
	}
	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}
	
	
	
	
	

}
