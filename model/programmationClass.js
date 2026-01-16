class Programmation {
    constructor(festival, salle, horaireDebut) {
        this.festival = festival;
        this.ville = salle.ville;
        this.salle = salle.nom;
        this.horaireDebut = horaireDebut;
        this.prix = salle.prix;
        this.capacite = salle.capacite;
        this.billetterie = salle.prix > 0 ? new Billetterie(salle.ville) : null;
    }

    modifHoraire(newHoraire) {
        this.horaireDebut = newHoraire;
        Billetterie.updateHoraire(this, newHoraire);
    }

}
