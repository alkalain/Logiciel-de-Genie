class billetClass {
    constructor(id, prix) {
        this.id = id;
        this.prix = prix;
        this.vendu = false;
        this.proprietaireId = null;
        this.proprietaireTel = null;
        this.proprietaireNom = null;

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