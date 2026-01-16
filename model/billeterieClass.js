const billetClass = require("./billetClass");

class Billetterie {
    constructor(ville, festival) {
        this.ville = ville;
        this.festival = festival;
        this.billets = [];
    }

    vendreBilletVille(personne) {
        if(this.festival.getMinCapacity()>0) {
            let billetPersonnel = new billetClass(this.festival.AchatBilletVille(), this.festival.id, personne)
            this.billets.push(billetPersonnel);
            personne.billets.push(billetPersonnel);
            return;
        }
        console.log("Plus de billets disponibles pour la ville");
    }
    vendreBilletVilleLieu(personne, lieuId) {
        if(this.festival.programmation.find(prog => prog.salle === lieuId && prog.capacite > 0)) {
            let billetPersonnel = new billetClass(this.festival.AchatBilletLieu(lieuId), this.festival.id, personne);
            this.billets.push(billetPersonnel);
            personne.billets.push(billetPersonnel);
            return;
        }
        console.log("Plus de billets disponibles pour cette salle");
    }

    

    billetsVendusFestival(festivalId) {
        return this.billets.filter(billet => billet.festivalId === festivalId);
    }

    billetsVendusSalle(salleId) {
        return this.billets.filter(billet => billet.salleId === salleId);
    }
    
}
module.exports = Billetterie;