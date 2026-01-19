package genieLogiciel;

public class Salle {
    private static Integer currentId = 1;
    private Integer id;
    private String ville;
    private String nomSalle;
    private String adresse;
    private Integer capacite;
    private Double prix;
    private Double reduction;

    public Salle(Ville ville, String nomSalle, String adresse, Integer capacite, Double prix, Double reduction) {
        this.id = currentId++;
        this.ville = ville.getNom();
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.capacite = capacite;
        this.prix = prix;
        this.reduction = reduction;
    }

    public Salle(Ville ville, String nomSalle, String adresse, Integer capacite) {
        this(ville, nomSalle, adresse, capacite, 0.0, 0.0);
    }

    public Integer getId() {
        return this.id;
    }

    public String getVille() {
        return this.ville;
    }

    public String getNomSalle() {
        return this.nomSalle;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public Integer getCapacite() {
        return this.capacite;
    }

    public Double getPrix() {
        return this.prix;
    }

    public Double getReduction() {
        return this.reduction;
    }
}