class Billetterie {
    constructor(prix, nbBillet) {
        this.prix = prix;
        this.nbBillet = nbBillet;
        this.billets = [];

        // Création automatique des billets
        for (let id = 1; id <= nbBillet; id++) {
            this.billets.push(new billetClass(id, prix));
        }
    }

    billetsDisponibles() {
        return this.billets.filter(b => !b.vendu);
    }

    billetsVendus() {
        return this.billets.filter(b => b.vendu);
    }

    vendreBillet(personne) {
    const billet = this.billetsDisponibles()[0];

    if (!billet) {
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
