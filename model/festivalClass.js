class festivalClass {
    constructor(nom) {
        this.id = id
        this.nom = nom;
        this.spectacle = [];
    }
    addSpectacle(spectacle) {
        this.spectacle.push(spectacle);
    }
    suppSpectacle(spectacle) {
        this.spectacle = this.spectacle.filter(s => s !== spectacle);
    }
}