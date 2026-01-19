package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Spectacle {
    private static Integer incrementId = 0;
    private Integer id;
    private String titre;
    private Integer duree;
    private List<Troupe> troupe;

    public Spectacle(String titre, Integer duree) {
        this.id = incrementId++;
        this.titre = titre;
        this.duree = duree;
        this.troupe = new ArrayList<>();
    }

    public void addTroupe(Troupe troupe) {
        this.troupe.add(troupe);
    }

    public Integer getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Integer getDuree() {
        return duree;
    }

    public List<Troupe> getTroupe() {
        return troupe;
    }
}