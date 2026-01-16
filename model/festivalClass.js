class festival {
    constructor(nom) {
        this.id = id
        this.nom = nom;
        this.programmation = [];
    }

    addProgrammation(programmation) {
        this.programmation.push(programmation);
        programmation.salle.prix > 0 ? new Billetterie(programmation.ville, this.id) : null;
    }

}
module.exports = festival;