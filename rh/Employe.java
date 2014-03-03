package rh;

public class Employe {
	private long id;
	private String nom;
	private float salaire;
	public Employe(long id, String nom, float salaire) {
		super();
		this.id = id;
		this.nom = nom;
		this.salaire = salaire;
	}
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	
}
