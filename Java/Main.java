package genieLogiciel;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== DÉBUT DES TESTS =====");

        //création personnes
        Personne alice = new Personne("Alice", "0600000001", "alice@example.com");
        Personne bob = new Personne("Bob", "0600000002", "bob@example.com");
        System.out.println("===================================================");
        System.out.println("Personnes créées: " + alice.getNom() + ", " + bob.getNom());

        //création festivals
        System.out.println("===================================================");
        Festival festivalEte = new Festival("Festival d'été");
        Festival festivalAutomne = new Festival("Festival d'automne");
        System.out.println("Festival été créé (id=" + festivalEte.getId() + ")");
        System.out.println("Festival hiver créé (id=" + festivalAutomne.getId() + ")");

        //création spectacles
        System.out.println("===================================================");
        Spectacle spectacle1 = new Spectacle("Spectacle Magique", 120);
        Spectacle spectacle2 = new Spectacle("Spectacle Fabuleux", 90);
        System.out.println("Spectacles créés");
        System.out.println("Spectacle Magique créé (id=" + spectacle1.getId() + ")");
        System.out.println("Spectacle Fabuleux créé (id=" + spectacle2.getId() + ")");

        //création troupes
        System.out.println("===================================================");
        Troupe troupeA = new Troupe("Troupe Rock");
        Troupe troupeB = new Troupe("Troupe Arc-en-ciel");
        spectacle1.addTroupe(troupeA);
        spectacle2.addTroupe(troupeB);
        System.out.println("Troupes crées");
        System.out.println("Troupe Rock créé (id=" + troupeA.getId() + ")");
        System.out.println("Troupe Arc-en-ciel créé (id=" + troupeB.getId() + ")");

        //création villes
        System.out.println("===================================================");
        Ville ville1 = new Ville("Paris", "Ile de France");
        Ville ville2 = new Ville("Grenoble", "Isère");
        System.out.println("Villes créées");
        System.out.println(ville1.getNom()+" créé");
        System.out.println(ville2.getNom()+" créé");

        //création salles
        System.out.println("===================================================");
        Salle salle1 = new Salle(ville1, "Grande Salle", "Paris", 50, 10.0, 50.0);
        Salle salle2 = new Salle(ville2, "Salle concert", "Grenoble", 140, 15.0, 50.0);
        System.out.println("Salles créées");
        System.out.println("Grande Salle crée (id=" + salle1.getId() + ")");
        System.out.println("Salle concert crée (id=" + salle2.getId() + ")");

        //création programmations
        System.out.println("===================================================");
        Date horaireDebut = new Date();
        Programmation programmation1 = new Programmation(spectacle1, salle1, horaireDebut);
        Programmation programmation2 = new Programmation(spectacle2, salle2, horaireDebut);
        System.out.println("Programmations créées");

        //ajout programmations
        System.out.println("===================================================");
        festivalEte.addProgrammation(programmation1);
        festivalAutomne.addProgrammation(programmation2);
        ville1.addProgrammation(programmation1);
        ville1.addProgrammation(programmation2);
        ville2.addProgrammation(programmation1);
        ville2.addProgrammation(programmation2);
        System.out.println("Programmations ajoutées aux festivals et aux villes");

        //prix des programmations de la ville (total)
        System.out.println("Prix total des programmations Paris : " + ville1.getPriceAllProgramations());
        System.out.println("Prix total des programmations Grenoble : " + ville2.getPriceAllProgramations());

        //création billeterie
        System.out.println("===================================================");
        Billetterie billeterieEte = festivalEte.createBilleterie(festivalEte.getProgrammation());
        Billetterie billeterieAutomne = festivalAutomne.createBilleterie(festivalAutomne.getProgrammation());
        System.out.println("Billeteries créées");

        //vente des billets
        billeterieEte.vendreBilletVilleLieu(alice, salle1.getId());
        billeterieEte.vendreBilletVilleLieu(bob, salle1.getId());
        billeterieEte.vendreBilletVilleLieu(alice, salle1.getId());

        billeterieAutomne.vendreBilletVilleLieu(alice, salle2.getId());

        System.out.println("Billets vendus");
        System.out.println("Billeterie générée: " + billeterieEte.getBillets().size() + " billets Festival été vendus");
        System.out.println("Billeterie générée: " + billeterieAutomne.getBillets().size() + " billets Festival automne vendus");

        // Tests
        System.out.println("===================================================");
        System.out.println("Recette totale (billets vendus pour le festival été) : " +
            billeterieEte.getRecetteTotal() + " euros");
        System.out.println("Billets vendus pour la salle 'Grande Salle' : " +
                billeterieEte.billetsVendusSalle(salle1.getId()).size() + " billets");

        System.out.println("Recette totale (billets vendus pour le festival automne) : " +
                billeterieAutomne.getRecetteTotal() + " euros");
        System.out.println("Billets vendus pour la salle 'Grande Salle' : " +
                billeterieAutomne.billetsVendusSalle(salle2.getId()).size() + " billets");


        // Affichage détaillé des billets
        System.out.println("===================================================");
        System.out.println("\n--- Détails des billets vendus Billeterie été ---");
        for (Billet billet : billeterieEte.getBillets()) {
            System.out.println("Billet #" + billet.getId() + 
                " - Prix: " + billet.getPrix() + "€" +
                " - Propriétaire: " + billet.getProprietaireNom() +
                " (" + billet.getProprietaireTel() + ")");
        }

        System.out.println("===================================================");
        System.out.println("\n--- Détails des billets vendus automne ---");
        for (Billet billet : billeterieAutomne.getBillets()) {
            System.out.println("Billet #" + billet.getId() +
                    " - Prix: " + billet.getPrix() + "€" +
                    " - Propriétaire: " + billet.getProprietaireNom() +
                    " (" + billet.getProprietaireTel() + ")");
        }

        System.out.println("===== FIN DES TESTS =====");
    }
}