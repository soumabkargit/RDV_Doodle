package test.testjpa.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Sondage {
	private int idSondage;
	private ChoixDate choixDate;
	private Utilisateur utilisateur;
	private Collection <Participant> participants;
	private Reunion reunion;
	
	@Id
	@GeneratedValue
	public int getIdSondage() {
		return idSondage;
	}
	public void setIdSondage(int idSondage) {
		this.idSondage = idSondage;
	}
	
	@ManyToOne
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	@ManyToOne
	public Reunion getReunion() {
		return reunion;
	}
	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}
	@OneToOne
	public ChoixDate getChoixDateSondage() {
		return choixDate;
	}
	public void setChoixDateSondage(ChoixDate choixDateSondage) {
		this.choixDate = choixDateSondage;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Sondage_Participant", joinColumns=@JoinColumn(name="idSondage", referencedColumnName="idSondage"),
	   inverseJoinColumns=@JoinColumn(name="email", referencedColumnName="email"))
	public Collection<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(Collection<Participant> participants) {
		this.participants = participants;
	}
	
	

}
