class villeClass {
    constructor(nom, departement) {
        this.nom = nom;
        this.departement = departement;
        this.programmations = [];
    }
    addProgrammation(programmation) {
        this.programmations.push(programmation);
    }
    getPriceAllProgramations() {
        return this.programmations.reduce((total, prog) => total + prog.prix, 0);
    }
    AchatBilletVille() {
        this.programmations.forEach(element => {
            element.capacite --;
        });
        return this.getPriceAllProgramations();
    }

    AchatBilletLieu(lieu) {
        lieu = this.programmations.find(prog => prog.lieu === lieu);
        if (lieu && lieu.capacite > 0) {
            lieu.capacite --;
        }
        return lieu.prix();
    }

    getMinCapacity() {
        if (this.programmations.length === 0) return 0;
        return Math.min(...this.programmations.map(prog => prog.capacite));
    }
}
module.exports = villeClass;