package ma.cst.ym.reference.dao;

import javax.validation.constraints.Size;

public class Employe {

	private int id;
	@Size(min = 3, max = 100, message = "Nom n'est pas valide")
	private String nom;

	@Size(min = 3, max = 100, message = "Prenom n'est pas valide")
	private String prenom;

	@Size(min = 3, max = 100, message = "Nationalité non valide")
	private String nationalite;

	@Size(min = 3, max = 100, message = "Poste n'est pas valide")
	private String poste;

	@Size(min = 10, max = 100, message = "Addresse n'est pas valide")
	private String addresse;
	
	@Size(min = 3, max = 100, message = "Zone D'activité non valide")
	private String zoneActivite;
	
	@Size(min = 5, max = 100, message = "Telephone n'est pas valide")
	private String telephone;

	public Employe() {

	}

	public Employe(String nom, String prenom, String nationalite, String poste, String addresse, String zoneActivite,
			String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.poste = poste;
		this.addresse = addresse;
		this.zoneActivite = zoneActivite;
		this.telephone = telephone;
	}

	public Employe(int id, String nom, String prenom, String nationalite, String poste, String addresse,
			String zoneActivite, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.poste = poste;
		this.addresse = addresse;
		this.zoneActivite = zoneActivite;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getZoneActivite() {
		return zoneActivite;
	}

	public void setZoneActivite(String zoneActivite) {
		this.zoneActivite = zoneActivite;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Employé: [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", nationalité=" + nationalite + " ,"
				+ " poste=" + poste + ",addresse=" + addresse + ", zoneActivité=" + zoneActivite + ", telephone="
				+ telephone + "]";
	}

}
