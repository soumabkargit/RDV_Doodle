package test.testjpa.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Allergie {
	private int idAllergie;
	private String libelleAllergie;
	private Collection<Participant> participants;
	
	@Id
	@GeneratedValue
	public int getIdAllergie() {
		return idAllergie;
	}
	public void setIdAllergie(int idAllergie) {
		this.idAllergie = idAllergie;
	}
	public String getLibelleAllergie() {
		return libelleAllergie;
	}
	public void setLibelleAllergie(String libelleAllergie) {
		this.libelleAllergie = libelleAllergie;
	}
	
	@ManyToMany
//	@JoinTable(name = "Allergie_Participant", joinColumns=@JoinColumn(name="Participant_ID", referencedColumnName="idAllergie"),
//	   inverseJoinColumns=@JoinColumn(name="Participant_ID", referencedColumnName="email"))
	public Collection<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(Collection<Participant> participants) {
		this.participants = participants;
	}
	
	
	

}
