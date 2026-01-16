import Billeterie from "./billeterieClass.js";
class festival {
    static incrementalId = 1;
    constructor(nom) {
        this.id = festival.incrementalId++;
        this.nom = nom;
        this.programmation = [];
        this.billeterie = new Billeterie("",this);
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

    getMinCapacity() {
        if (this.programmation.length === 0) return 0;
        return Math.min(...this.programmation.map(prog => prog.capacite));
    }

    // retourne le prix du billet pour un lieu specifique et decrementer la capacite
    AchatBilletLieu(lieuId) {
        let lieu = this.programmation.find(prog => prog.salle === lieuId);
        if (lieu.capacite > 0) {
            lieu.capacite --;
        }
        return lieu.prix;
    }

    AchatBilletVille() {
        this.programmation.forEach(element => {
            element.capacite --;
        });
        return this.getPriceAllProgramations();
    }

};
export default festival;