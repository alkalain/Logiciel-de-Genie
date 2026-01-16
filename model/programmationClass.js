class Programmation {
    constructor(festival, salle, horaireDebut) {
        this.festivalId = festival.id;
        this.ville = salle.ville;
        this.salle = salle.nom;
        this.horaireDebut = horaireDebut;
        this.prix = salle.prix * (1 - salle.reduction / 100);
        this.capacite = salle.capacite;
        this.billetterie = salle.prix > 0 ? new Billetterie(salle.ville, festival.id) : null;
    }

    modifHoraire(newHoraire) {
        this.horaireDebut = newHoraire;
        Billetterie.updateHoraire(this, newHoraire);
    }

}
