class Programmation {
    constructor(festival, lieu, horaireDebut, prix, capacite) {
        this.festival = festival;
        this.ville = lieu.ville;
        this.lieu = lieu.nom;
        this.horaireDebut = horaireDebut;
        this.prix = prix;
        this.capacite = capacite;
        this.billetterie = prix > 0 ? new Billetterie(prix, capacite) : null;
    }

    modifHoraire(newHoraire) {
        this.horaireDebut = newHoraire;
        Billetterie.updateHoraire(this, newHoraire);
    }

}
