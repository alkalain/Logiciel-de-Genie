class Programmation {
    constructor(spectacle, salle, horaireDebut) {
        this.spectacleId = spectacle.id;
        this.ville = salle.ville;
        this.salle = salle.id;
        this.horaireDebut = horaireDebut;
        this.prix = salle.prix * (1 - salle.reduction / 100);
        this.capacite = salle.capacite;
    }

    modifHoraire(newHoraire) {
        this.horaireDebut = newHoraire;
        Billetterie.updateHoraire(this, newHoraire);
    }
}
module.exports = Programmation;
