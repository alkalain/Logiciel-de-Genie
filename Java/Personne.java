package genieLogiciel;
import java.util.List;
import java.util.ArrayList;

public class Personne {
	
	private static Integer idPersonne = 1;
	private String nom;
	private String numTel;
	private String eMail;
	private List<Integer> billets;
	
	public Personne(String nom, String numTel, String eMail) {
		this.idPersonne = idPersonne++;
		this.nom = nom;
		this.numTel = numTel;
		this.eMail = eMail;
		this.billets = new ArrayList<>();
	}
	
	public Integer getId() {
		return idPersonne;
	}

	public String getNom() {
		return nom;
	}

	public String getNumTel() {
		return numTel;
	}

	public String getEMail() {
		return eMail;
	}

	public List<Integer> getBillets() {
		return billets;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}
}
		


