class villeClass {
    constructor(nom, departement, capacite) {
        this.nom = nom;
        this.departement = departement;
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
}