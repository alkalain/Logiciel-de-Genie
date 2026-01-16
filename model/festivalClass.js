import Billeterie from "./billeterieClass.js";
class festival {
    static incrementalId = 1;
    constructor(nom) {
        this.id = festival.incrementalId++;
        this.nom = nom;
        this.programmation = [];
        this.billeterie = new Billeterie("",this.id);
    }

    addProgrammation(programmation) {
        this.programmation.push(programmation);   
    };

    getProgrammation() {
        return this.programmation;
    }

    createBilleterie(programmation) {
        if (!programmation ) {
            throw new Error("Programmation invalide");
        }
        if (programmation[0].salle.prix > 0) {
            this.billeterie.ville = programmation[0].salle.ville;
            this.billeterie.programmation = programmation;
        }
        return this.billeterie;
    };

};
export default festival;