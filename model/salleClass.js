class salleClass {
    constructor(nomSalle, adresse, capacite) {
        this.id = salleClass.incrementId();
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.capacite = capacite;;
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