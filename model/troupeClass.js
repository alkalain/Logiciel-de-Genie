class troupeClass {
    constructor(id, nom) {
        this.id = id;
        this.nom = nom;
        this.artistes = [];
        this.spectacles = [];
    }
    addArtiste(artiste) {
        this.artistes.push(artiste);
    }

    addSpectacle(spectacle) {
        this.spectacles.push(spectacle);
    }

    suppSpectacle(spectacle) {
        this.spectacles = this.spectacles.filter(s => s !== spectacle);
    }
    
    getInfos() {
        return `Troupe [ID: ${this.id}, Nom: ${this.nom}, spectacle: ${this.spectacles.join(', ')}]`;
    }
}