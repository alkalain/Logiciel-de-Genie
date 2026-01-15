class Personne {
  constructor(id, nom, email) {
    this.id = id;
    this.nom = nom;
    this.email = email;
    this.billets = [];
  }
  acheterBillet(billet) {
    this.billets.push(billet);
  }
}
