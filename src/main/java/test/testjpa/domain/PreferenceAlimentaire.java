package test.testjpa.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PreferenceAlimentaire {
private int idPreferenceAlimentaire;
private String libellePreferenceAlimentaire;
private Collection<Participant> participants;

@Id
@GeneratedValue
public int getIdPreferenceAlimentaire() {
	return idPreferenceAlimentaire;
}
public void setIdPreferenceAlimentaire(int idPreferenceAlimentaire) {
	this.idPreferenceAlimentaire = idPreferenceAlimentaire;
}
public String getLibellePreferenceAlimentaire() {
	return libellePreferenceAlimentaire;
}
public void setLibellePreferenceAlimentaire(String libellePreferenceAlimentaire) {
	this.libellePreferenceAlimentaire = libellePreferenceAlimentaire;
}

@OneToMany(mappedBy="preferenceAlimentaire",cascade = CascadeType.ALL)
public Collection<Participant> getParticipants() {
	return participants;
}
public void setParticipants(Collection<Participant> participants) {
	this.participants = participants;
}



}
