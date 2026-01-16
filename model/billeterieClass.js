class Billetterie {
    constructor(ville, festivalId) {
        this.ville = ville;
        this.festivalId = festivalId;
        this.billets = [];
    }

    billetsDisponibles() {
        return this.billets.filter(b => !b.vendu);
    }

    billetsVendus() {
        return this.billets.filter(b => b.vendu);
    }

    vendreBilletVille(personne) {
        if(this.ville.getMinCapacity()>0) {
            this.billets.push(new billetClass(id, this.ville.AchatBilletVille(), this.festivalId, personne));
        }
        throw new Error("Plus de billets disponibles");
    }
    vendreBilletVilleLieu(personne, lieu) {
        if(this.ville.programmations.find(prog => prog.lieu === lieu && prog.capacite > 0)) {
            this.billets.push(new billetClass(id, this.ville.AchatBilletLieu(lieu), this.festivalId, personne));
        }
        throw new Error("Plus de billets disponibles");
    }

    billetsVendusFestival(festivalId) {
        return this.billets.filter(billet => billet.festivalId === festivalId);
    }

    billetsVendusSalle(salleNom) {
        return this.billets.filter(billet => billet.salleNom === salleNom);
    }
    
}
