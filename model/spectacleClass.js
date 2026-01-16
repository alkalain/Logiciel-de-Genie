class spectacleClass {
    constructor(id, titre, duree) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.troupe = [];
    }
    addTroupe(troupe) {
        this.troupe.push(troupe);
    }
}
module.exports = spectacleClass;