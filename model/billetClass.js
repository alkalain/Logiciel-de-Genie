class billetClass {
    static currentId = 1;
    constructor(prix, spectacleId, personne) {
        this.id = billetClass.currentId++;
        this.prix = prix;
        this.spectacleId = spectacleId;
        this.proprietaireId = personne.id;
        this.proprietaireTel = personne.tel;
        this.proprietaireNom = personne.nom;
    }
}
module.exports = billetClass;