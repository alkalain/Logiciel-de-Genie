class salleClass {
    static currentId = 1;
    constructor(ville, nomSalle, adresse, capacite, prix = 0, reduction = 0) {
        this.id = salleClass.currentId++;
        this.ville = ville.nom;
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.capacite = capacite;
        this.prix = prix;
        this.reduction = reduction;
    }

    villeEtape() {
        return this.programme.length == 0;
    }

    getSpectacles() {
        return this.programme;
    
    }
    getNomSalle() {
        return this.nomSalle;
    }
    getId() {
        return this.id;
    }
}
module.exports = salleClass;