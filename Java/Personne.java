package genieLogiciel;
import java.util.List;
import java.util.ArrayList;

public class Personne {
	
	private static int idPersonne = 1;
	private String nom;
	private String numTel;
	private String email;
	private List<Integer> billets;
	
	public Personne(String nom, String numTel, String email) {
		this.idPersonne = idPersonne++;
		this.nom = nom;
		this.numTel = numTel;
		this.email = email;
		this.billets = new ArrayList<>();
	}
	
	public int getId() {
		return this.idPersonne;
	}

	public String getNom() {
		return this.nom;
	}

	public String getNumTel() {
		return this.numTel;
	}

	public String getEmail() {
		return this.email;
	}

	public List<Integer> getBillets() {
		return this.billets;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
		


