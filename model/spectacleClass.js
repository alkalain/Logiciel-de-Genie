class spectacleClass {
    constructor(id, titre, duree) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.artistes = [];
    }
    addArtistes(artiste) {
        this.artistes.push(artiste);
    }
}