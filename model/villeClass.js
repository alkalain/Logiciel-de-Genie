class villeClass {
    constructor(nom, departement) {
        this.nom = nom;
        this.departement = departement;
        this.programmations = [];
    }
    addSpectacle(programmation) {
        this.programmations.push(programmation);
    }
}