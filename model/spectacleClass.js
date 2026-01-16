const { incrementId } = require("./personneClass");

class spectacleClass {
    static incrementId = 0;
    constructor(titre, duree) {
        this.id = spectacleClass.incrementId++;
        this.titre = titre;
        this.duree = duree;
        this.troupe = [];
    }
    addTroupe(troupe) {
        this.troupe.push(troupe);
    }
}
module.exports = spectacleClass;