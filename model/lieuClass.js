class lieuClass {
    constructor(nomSalle, adresse, capacite) {
        this.id = lieuClass.incrementId();
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.capacite = capacite;
        this.programme = [];
    }

    addSpectacle(programme) {
        this.programme.push(programme);
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