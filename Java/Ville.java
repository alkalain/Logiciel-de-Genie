package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Ville {
    private String nom;
    private String departement;
    private List<Programmation> programmations;

    public Ville(String nom, String departement) {
        this.nom = nom;
        this.departement = departement;
        this.programmations = new ArrayList<>();
    }

    public void addProgrammation(Programmation programmation) {
        this.programmations.add(programmation);
    }

    public Double getPriceAllProgramations() {
        Double total = 0.0;
        for (Programmation prog : programmations) {
            total += prog.getPrix();
        }
        return total;
    }

    public Integer getMinCapacity() {
        if (programmations.isEmpty()) {
            return 0;
        }
        
        Integer min = programmations.get(0).getCapacite();
        for (Programmation prog : programmations) {
            if (prog.getCapacite() < min) {
                min = prog.getCapacite();
            }
        }
        return min;
    }

    public String getNom() {
        return this.nom;
    }

    public String getDepartement() {
        return this.departement;
    }

    public List<Programmation> getProgrammations() {
        return this.programmations;
    }
}