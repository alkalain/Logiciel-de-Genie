class Programmation {
    constructor(spectacle, ville, lieu, horaireDebut, prix, capacite) {
        this.spectacle = spectacle;
        this.ville = ville;
        this.lieu = lieu;
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
