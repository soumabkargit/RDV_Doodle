package test.testjpa.domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur {

    private String emailUtilisateur;     
    private String nom;
    private String prenom;
    private Collection<Sondage> sondages;
//    private Collection<Allergie> allergies;
//    private Collection<PreferenceAlimentaire> preferenceAlimentaires;
    
    @Id
    //@GeneratedValue
	public String getEmail() {
		return emailUtilisateur;
	}
	public void setEmail(String email) {
		this.emailUtilisateur = email;
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
	
	@OneToMany(mappedBy = "utilisateur")
	public Collection<Sondage> getSondages() {
		return sondages;
	}
	public void setSondages(Collection<Sondage> sondages) {
		this.sondages = sondages;
	}
	/*
	@ManyToMany
	public Collection<Allergie> getAllergies() {
		return allergies;
	}
	public void setAllergies(Collection<Allergie> allergies) {
		this.allergies = allergies;
	}
	@ManyToMany
	public Collection<PreferenceAlimentaire> getPreferenceAlimentaires() {
		return preferenceAlimentaires;
	}
	public void setPreferenceAlimentaires(Collection<PreferenceAlimentaire> preferenceAlimentaires) {
		this.preferenceAlimentaires = preferenceAlimentaires;
	}
	*/
	
	
}
