package genieLogiciel;

import java.util.ArrayList;
import java.util.List;

public class Billetterie {
    private String ville;
    private Festival festival;
    private List<Billet> billets;

    public Billetterie(String ville, Festival festival) {
        this.ville = ville;
        this.festival = festival;
        this.billets = new ArrayList<>();
    }

    public void vendreBilletVille(Personne personne) {
        if (festival.getMinCapacity() > 0) {
            Billet billetPersonnel = new Billet(festival.achatBilletVille(), festival.getId(), personne);
            this.billets.add(billetPersonnel);
            personne.getBillets().add(billetPersonnel.getId());
        } else {
            System.out.println("Plus de billets disponibles pour la ville");
        }
    }

    public void vendreBilletVilleLieu(Personne personne, int lieuId) {
        boolean salleDisponible = false;
        
        for (Programmation prog : festival.getProgrammation()) {
            if (prog.getSalle() == lieuId && prog.getCapacite() > 0) {
                salleDisponible = true;
                break;
            }
        }
        
        if (salleDisponible) {
            Billet billetPersonnel = new Billet(festival.achatBilletLieu(lieuId), festival.getId(), personne);
            this.billets.add(billetPersonnel);
            personne.getBillets().add(billetPersonnel.getId());
        } else {
            System.out.println("Plus de billets disponibles pour cette salle");
        }
    }

    public List<Billet> billetsVendusFestival(int festivalId) {
        List<Billet> resultat = new ArrayList<>();
        
        for (Billet billet : billets) {
            if (billet.getSpectacleId() == festivalId) {
                resultat.add(billet);
            }
        }
        
        return resultat;
    }

    public List<Billet> billetsVendusSalle(int salleId) {
        List<Billet> resultat = new ArrayList<>();
        
        for (Billet billet : billets) {
            if (billet.getSpectacleId() == salleId) {
                resultat.add(billet);
            }
        }
        
        return resultat;
    }

    public String getVille() {
        return this.ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Festival getFestival() {
        return this.festival;
    }

    public List<Billet> getBillets() {
        return this.billets;
    }

    public Double getRecetteTotal() {
        Double total = 0.0;
        for (Billet billet : billets) {
            total += billet.getPrix();
        }
        return total;
    }
}