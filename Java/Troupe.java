package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Troupe {
    private static int incrementalId = 0;
    private int id;
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

    public void suppArtiste(int personneId) {
        List<Personne> nouvelleListeArtistes = new ArrayList<>();

        for (Personne artiste : artistes) {
            if (artiste.getId() !=(personneId)) {
                nouvelleListeArtistes.add(artiste);
            }
        }

        this.artistes = nouvelleListeArtistes;
    }

    public String getInfos() {
        return String.format("Troupe [ID: %d, Nom: %s]", this.id, this.nom);
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public List<Personne> getArtistes() {
        return this.artistes;
    }

    public void supprimerTroupe(Troupe troupe) {
        // Suppression dans base de données
    }
}