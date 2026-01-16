class artisteClass {
    static incrementalId = 0;
    constructor(tel, nom) {
        this.id = artisteClass.incrementalId++;   
        this.tel = tel;
        this.nom = nom;
    }
    getInfos() {
        return `Artiste [Nom: ${this.nom}, Tel: ${this.tel}]`;
    }

    getId() {
        return this.id;
    }
    createArtiste(nom, tel) {
        return new artisteClass(this.id, tel, nom);
    }
}
module.exports = artisteClass;