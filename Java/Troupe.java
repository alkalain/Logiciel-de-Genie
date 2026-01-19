package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Troupe {
    private static Integer incrementalId = 0;
    private Integer id;
    private String nom;
    private List<Personne> artistes;

    public Troupe(String nom) {
        this.id = incrementalId++;
        this.nom = nom;
        this.artistes = new ArrayList<>();
    }

    public void addArtiste(Personne personne) {
        this.artistes.add(personne);
    }

    public void suppArtiste(Integer personneId) {
        List<Personne> nouvelleListeArtistes = new ArrayList<>();

        for (Personne artiste : artistes) {
            if (!artiste.getId().equals(personneId)) {
                nouvelleListeArtistes.add(artiste);
            }
        }

        this.artistes = nouvelleListeArtistes;
    }

    public String getInfos() {
        return String.format("Troupe [ID: %d, Nom: %s]", this.id, this.nom);
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Personne> getArtistes() {
        return artistes;
    }
}