package genieLogiciel;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== DÉBUT DES TESTS =====");

        //création personnes
        Personne alice = new Personne("Alice", "0600000001", "ldlfklfkgf@idfihfhifd");
        Personne bob = new Personne("Bob", "0600000002", "bob@example.com");

        System.out.println("Personnes créées: " + alice.getNom() + ", " + bob.getNom());

        //création festival
        Festival festival = new Festival("Festival d'été");
        System.out.println("Festival créé (id=" + festival.getId() + ")");

        //création spectacles
        Spectacle spectacleClass = new Spectacle("Spectacle Magique", 120);
        Spectacle spectacle1 = new Spectacle("Spectacleeeeeeee", 90);
        System.out.println("Spectacles créés");

        //création troupe
        Troupe troupeClass = new Troupe("Troupe Magique");
        System.out.println("Troupe créée");

        //création ville
        Ville villeClass = new Ville("Paris", "Ile de France");
        System.out.println("Ville créée");

        //création salle
        Salle salleClass = new Salle(villeClass, "Grande Salle", "Paris", 50, 10.0, 50.0);
        System.out.println("Salle créée");

        //création programmations
        Date horaireDebut = new Date(); // ou utilisez SimpleDateFormat pour "2024-07-01T20:00:00"
        Programmation programmation1 = new Programmation(spectacleClass, salleClass, horaireDebut);
        Programmation programmation2 = new Programmation(spectacle1, salleClass, horaireDebut);
        System.out.println("Programmations créées");

        //ajout programmations
        festival.addProgrammation(programmation1);
        festival.addProgrammation(programmation2);
        villeClass.addProgrammation(programmation1);
        villeClass.addProgrammation(programmation2);
        System.out.println("Programmations ajoutées au festival et à la ville");

        //prix des programmations de la ville (total)
        System.out.println("Prix total des programmations: " + villeClass.getPriceAllProgramations());

        //création billeterie
        Billetterie billeterie = festival.createBilleterie(festival.getProgrammation());
        System.out.println("Billeterie créée");

        //vente des billets
        billeterie.vendreBilletVilleLieu(alice, salleClass.getId());
        billeterie.vendreBilletVilleLieu(bob, salleClass.getId());
        billeterie.vendreBilletVilleLieu(alice, salleClass.getId());
        System.out.println("Billets vendus");

        System.out.println("Billeterie générée: " + billeterie.getBillets().size() + " billets vendus");

        // Tests
        System.out.println("Recette totale (billets vendus pour le festival) : " + 
            billeterie.billetsVendusFestival(festival.getId()).size() + " billets");
        System.out.println("Billets vendus pour la salle 'Grande Salle' : " + 
            billeterie.billetsVendusSalle(salleClass.getId()).size() + " billets");

        // Affichage détaillé des billets
        System.out.println("\n--- Détails des billets vendus ---");
        for (Billet billet : billeterie.getBillets()) {
            System.out.println("Billet #" + billet.getId() + 
                " - Prix: " + billet.getPrix() + "€" +
                " - Propriétaire: " + billet.getProprietaireNom() +
                " (" + billet.getProprietaireTel() + ")");
        }
    }
}