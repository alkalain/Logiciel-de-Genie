import Personne from "./personneClass.js";
import Billet from "./billetClass.js";
import Billeterie from "./billeterieClass.js";
import Programmation from "./programmationClass.js";
import Salle from "./salleClass.js";
import Spectacle from "./spectacleClass.js";
import Troupe from "./troupeClass.js";
import Ville from "./villeClass.js";
import Festival from "./festivalClass.js";

console.log("===== DÉBUT DES TESTS =====");

// Création des personnes
const alice = new Personne(1, "Alice", "0600000001", "ldlfklfkgf@idfihfhifd");
const bob = new Personne(2, "Bob", "0600000002", "bob@example.com");

console.log("✔ Personnes créées :", alice, bob);

// Création du festival
const festival = new Festival(100);
console.log("✔ Festival créé (id=100)");

// Création des billets
const billet1 = new Billet(1, 20, alice, 100);
const billet2 = new Billet(2, 30, bob, 100);
const billet3 = new Billet(3, 15, alice, 200); // autre festival

console.log("✔ Billets créés");

const spectacleClass = new Spectacle("Spectacle Magique", "Un spectacle plein de magie");
const spectacle1 = new Spectacle("Spectacleeeeeeee", "Un bete de spectacle");
const troupeClass = new Troupe("Troupe Magique");
const villeClass = new Ville("Paris", "ile de france");
const salleClass = new Salle(villeClass, "Grande Salle", "Paris", 50, 10, 50);
const horaireDebut = new Date("2024-07-01T20:00:00");
const programmation1 = new Programmation(spectacleClass, salleClass, horaireDebut);
const programmation2 = new Programmation(spectacle1, salleClass, horaireDebut);

// Vente des billets
festival.addProgrammation(programmation1);
festival.addProgrammation(programmation2);
villeClass.addProgrammation(programmation1);
villeClass.addProgrammation(programmation2);

villeClass.getPriceAllProgramations();
let billeterie = festival.createBilleterie(festival.getProgrammation());

billeterie.vendreBilletVilleLieu(alice, salleClass.getId());
/*bob.acheterBillet(billet2);
alice.acheterBillet(billet3); // billet pour un autre festival*/
console.log("✔ Billets vendus");

console.log("Billeterie générée :", billeterie);

// 5. Tests
console.log("Recette totale :", billeterie.billetsVendusFestival(festival.id));
console.log("Billets vendus pour la salle 'Grande Salle' :", billeterie.billetsVendusSalle(salleClass.getId()));

console.log("===== FIN DES TESTS =====");
