class Billetterie {
    constructor(prix, ville) {
        this.ville = ville;
        this.billets = [];

        // Création automatique des billets
        for (let id = 1; id <= ville.capacite; id++) {
            this.billets.push(new billetClass(id, prix));
        }
    }

    billetsDisponibles() {
        return this.billets.filter(b => !b.vendu);
    }

    billetsVendus() {
        return this.billets.filter(b => b.vendu);
    }

    vendreBilletVille(personne) {
        if(this.ville.programmations.min(prog => prog.capacite>0)) {
            new billetClass(id, this.ville.AchatBilletVille());
        }
        throw new Error("Plus de billets disponibles");
    }
    vendreBilletVilleLieu(personne, lieu) {
        if(this.ville.programmations.lieu(prog => prog.capacite>0)) {
            new billetClass(id, this.ville.AchatBilletLieu(lieu));
        }
        throw new Error("Plus de billets disponibles");
    }
    
    billet.vendre(personne);
        return billet;
    }

    nombrePlacesRestantes() {
        return this.billetsDisponibles().length;
    }

    recetteTotale() {
        return this.billetsVendus().length * this.prix;
    }
}
