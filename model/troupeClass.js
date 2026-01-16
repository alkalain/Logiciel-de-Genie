class troupeClass {
    static incrementalId = 0;   
    constructor(nom) {
        this.id = troupeClass.incrementalId++;
        this.nom = nom;
        this.artistes = [];
    }
    addArtiste(personne) {
        this.artistes.push(personne);
    }

    suppArtiste(personneId) {
        this.artistes = this.artistes.filter(artiste => artiste.id !== personneId);
    }

    getInfos() {
        return `Troupe [ID: ${this.id}, Nom: ${this.nom}]`;
    }
}
module.exports = troupeClass;