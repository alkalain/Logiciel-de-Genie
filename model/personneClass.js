class Personne {
  constructor(id, nom, tel, email) {
    this.id = id;
    this.nom = nom;
    this.tel = tel;
    this.email = email;
    this.billets = [];
  }
  acheterBillet(billet) {
    this.billets.push(billet);
  }
}
module.exports = Personne;
