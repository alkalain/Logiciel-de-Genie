class Programmation {
    constructor(festival, lieuClass, horaireDebut, prix, capacite) {
        this.festival = festival;
        this.ville = lieuClass.ville;
        this.lieu = lieuClass;
        this.horaireDebut = horaireDebut;
        this.prix = prix;
        this.capacite = capacite;
        this.billetterie = prix > 0 ? new Billetterie(capacite) : null;
    }

    modifHoraire(newHoraire) {
        this.horaireDebut = newHoraire;
        Billetterie.updateHoraire(this, newHoraire);
    }

}
