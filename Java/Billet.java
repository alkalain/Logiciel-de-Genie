package genieLogiciel;

public class Billet {
    private static int idBillet = 1;
    private Double prix;
    private int spectacleId;
    private int proprietaireId;
    private String proprietaireTel;
    private String proprietaireNom;

    public Billet(Double prix, int spectacleId, Personne personne) {
        this.idBillet = idBillet++;
        this.prix = prix;
        this.spectacleId = spectacleId;
        this.proprietaireId = personne.getId();
        this.proprietaireTel = personne.getNumTel();
        this.proprietaireNom = personne.getNom();
    }

    public int getId() {
        return this.idBillet;
    }

    public Double getPrix() {
        return this.prix;
    }

    public int getSpectacleId() {
        return this.spectacleId;
    }

    public int getProprietaireId() {
        return this.proprietaireId;
    }

    public String getProprietaireTel() {
        return this.proprietaireTel;
    }

    public String getProprietaireNom() {
        return this.proprietaireNom;
    }
}