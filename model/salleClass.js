class salleClass {
    constructor(ville, nomSalle, adresse, capacite) {
        this.id = salleClass.incrementId();
        this.ville = ville;
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.capacite = capacite;
        this.prix = 0;
        this.reduction = 0;
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