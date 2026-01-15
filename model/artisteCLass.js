class artisteClass {
    constructor(id, tel, nom) {
        this.id = id;   
        this.tel = tel;
        this.nom = nom;
    }
    getInfos() {
        return `Artiste [Nom: ${this.nom}, Tel: ${this.tel}]`;
    }

    getId() {
        return this.id;
    }
}