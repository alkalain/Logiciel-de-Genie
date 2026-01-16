class Personne {
  static incrementId=0;
  constructor(nom, tel, email) {
    this.id = Personne.incrementId++;
    this.nom = nom;
    this.tel = tel;
    this.email = email;
    this.billets = [];
  }
}
module.exports = Personne;
