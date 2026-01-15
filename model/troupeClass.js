class troupeClass {
    constructor(id, nom) {
        this.id = id;
        this.nom = nom;
        this.spectacles = [];
    }
    addSpectacle(spectacle) {
        this.spectacles.push(spectacle);
    }
}