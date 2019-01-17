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

@Entity
public class Participant {
	private String emailParticipant;     
    private String nom;
    private String prenom;
    private Collection<Sondage> sondages;
    private PreferenceAlimentaire preferenceAlimentaire;
    private Collection<Allergie> allergies;
    
    @Id
   // @GeneratedValue
	public String getEmail() {
		return emailParticipant;
	}
	public void setEmail(String email) {
		this.emailParticipant = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@ManyToMany
	public Collection<Sondage> getSondages() {
		return sondages;
	}
	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}
	@ManyToOne
	public PreferenceAlimentaire getPreferenceAlimentaire() {
		return preferenceAlimentaire;
	}
	public void setPreferenceAlimentaire(PreferenceAlimentaire preferenceAlimentaire) {
		this.preferenceAlimentaire = preferenceAlimentaire;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Participant_Allergie", joinColumns=@JoinColumn(name="email", referencedColumnName="email"),
			   inverseJoinColumns=@JoinColumn(name="idAllergie", referencedColumnName="idAllergie"))
	public Collection<Allergie> getAllergies() {
		return allergies;
	}
	public void setAllergies(Collection<Allergie> allergies) {
		this.allergies = allergies;
	}

	
	
}
