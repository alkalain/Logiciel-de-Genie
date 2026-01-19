package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Spectacle {
    private static int incrementId = 0;
    private int id;
    private String titre;
    private int duree;
    private List<Troupe> troupe;

    public Spectacle(String titre, int duree) {
        this.id = incrementId++;
        this.titre = titre;
        this.duree = duree;
        this.troupe = new ArrayList<>();
    }

    public void addTroupe(Troupe troupe) {
        this.troupe.add(troupe);
    }

    public int getId() {
        return this.id;
    }

    public String getTitre() {
        return this.titre;
    }

    public int getDuree() {
        return this.duree;
    }

    public List<Troupe> getTroupe() {
        return this.troupe;
    }

    public Spectacle duplicateSpectacle() {
        Spectacle nouveauSpectacle = new Spectacle(this.titre, this.duree);
        for (Troupe troupeExistante : this.troupe) {
            nouveauSpectacle.addTroupe(troupeExistante);
        }
        return nouveauSpectacle;
    }

    public void supprimerSpectacle(Spectacle spectacle) {
        // Suppression dans base de données
    }
}