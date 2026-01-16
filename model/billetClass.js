class billetClass {
    constructor(id, prix, spectacleId, personne) {
        this.id = id;
        this.prix = prix;
        this.spectacleId = spectacleId;
        this.proprietaireId = personne.id;
        this.proprietaireTel = personne.tel;
        this.proprietaireNom = personne.nom;
    }
}
module.exports = billetClass;