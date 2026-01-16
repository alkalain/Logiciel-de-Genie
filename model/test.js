import Personne from "./Personne.js";
import Billet from "./billetClass.js";
import Billeterie from "./Billeterie.js";
import Programmation from "./Programmation.js";
import Salle from "./salleClass.js";
import Spectacle from "./spectacleClass.js";
import Troupe from "./troupeClass.js";
import Ville from "./villeClass.js";
import Festival from "./festival.js";

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

// Vente des billets
festival.vendreBillet(billet1);
festival.vendreBillet(billet2);
festival.vendreBillet(billet3);

console.log("✔ Billets vendus");

// Test billetsFestival()
const billetsFestival = festival.billetsFestival();
console.log("🎟️ Billets du festival 100 :", billetsFestival);
console.assert(billetsFestival.length === 2, "❌ Erreur filtre festival");

// Test prix total
const total = festival.prixTotalBillets();
console.log("💰 Prix total des billets du festival :", total);
console.assert(total === 50, "❌ Erreur calcul prix total");

console.log("===== TOUS LES TESTS SONT PASSÉS ✅ =====");