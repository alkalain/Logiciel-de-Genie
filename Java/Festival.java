package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Festival {
    private static int incrementalId = 1;
    private int id;
    private String nom;
    private List<Programmation> programmation;
    private Billetterie billeterie;

    public Festival(String nom) {
        this.id = incrementalId++;
        this.nom = nom;
        this.programmation = new ArrayList<>();
        this.billeterie = new Billetterie("", this);
    }

    public void addProgrammation(Programmation programmation) {
        this.programmation.add(programmation);
    }

    public List<Programmation> getProgrammation() {
        return programmation;
    }

    public Billetterie createBilleterie(List<Programmation> programmation) {
        if (programmation == null || programmation.isEmpty()) {
            throw new IllegalArgumentException("Programmation invalide");
        }
        if (programmation.get(0).getPrix() > 0) {
            this.billeterie.setVille(programmation.get(0).getVille());
        }
        return this.billeterie;
    }

    public int getMinCapacity() {
        if (programmation.isEmpty()) {
            return 0;
        }
        
        int min = programmation.get(0).getCapacite();
        for (Programmation prog : programmation) {
            if (prog.getCapacite() < min) {
                min = prog.getCapacite();
            }
        }
        return min;
    }

    public Double achatBilletLieu(int lieuId) {
        Programmation lieu = null;
        for (Programmation prog : programmation) {
            if (prog.getSalle() == lieuId) {
                lieu = prog;
                break;
            }
        }
        
        if (lieu != null && lieu.getCapacite() > 0) {
            lieu.setCapacite(lieu.getCapacite() - 1);
            return lieu.getPrix();
        }
        return 0.0;
    }

    public Double achatBilletVille() {
        for (Programmation element : programmation) {
            element.setCapacite(element.getCapacite() - 1);
        }
        return getPriceAllProgramations();
    }

    public Double getPriceAllProgramations() {
        Double total = 0.0;
        for (Programmation prog : programmation) {
            total += prog.getPrix();
        }
        return total;
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public Billetterie getBilleterie() {
        return this.billeterie;
    }

    public Festival duplicateFestival() {
        Festival nouveauFestival = new Festival(this.nom + " - copie");
        for (Programmation programmation : this.programmation) {
                nouveauFestival.addProgrammation(programmation);
        }
        return nouveauFestival;
    }

    public void supprimerFestival(Festival festival) {
        // Suppression dans base de données
    }
}