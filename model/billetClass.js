class billetClass {
    constructor(id, prix, spectacleId, personne) {
        this.id = id;
        this.prix = prix;
        this.spectacleId = this.spectacleId;
        this.vendu = true;
        this.proprietaireId = personne.id;
        this.proprietaireTel = personne.tel;
        this.proprietaireNom = personne.nom;

    }
    getPrix() {
        return this.prix;
    }
    
    setPrix(newPrix) {
        this.prix = newPrix;
    }

    vendre(personne) {
        if (this.vendu) {
            throw new Error("Billet déjà vendu");
        }
        this.vendu = true;
        this.proprietaireId = personne.id;
        this.proprietaireTel = personne.tel;
        this.proprietaireNom = personne.nom;
    }
}