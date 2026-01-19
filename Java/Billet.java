package genieLogiciel;

public class Billet {
    private static Integer idBillet = 1;
    private Double prix;
    private Integer spectacleId;
    private Integer proprietaireId;
    private String proprietaireTel;
    private String proprietaireNom;

    public Billet(Double prix, Integer spectacleId, Personne personne) {
        this.idBillet = idBillet++;
        this.prix = prix;
        this.spectacleId = spectacleId;
        this.proprietaireId = personne.getId();
        this.proprietaireTel = personne.getNumTel();
        this.proprietaireNom = personne.getNom();
    }

    public Integer getId() {
        return idBillet;
    }

    public Double getPrix() {
        return prix;
    }

    public Integer getSpectacleId() {
        return spectacleId;
    }

    public Integer getProprietaireId() {
        return proprietaireId;
    }

    public String getProprietaireTel() {
        return proprietaireTel;
    }

    public String getProprietaireNom() {
        return proprietaireNom;
    }
}