class lieuClass {
    constructor(nomSalle, adresse, coordonnees) {
        this.id = lieuClass.incrementId();
        this.nomSalle = nomSalle;
        this.adresse = adresse;
        this.coordonnees = coordonnees;
    }
    getNomSalle() {
        return this.nomSalle;
    }
    getId() {
        return this.id;
    }
}