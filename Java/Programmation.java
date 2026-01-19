package genieLogiciel;

import java.util.Date;

public class Programmation {
    private int spectacleId;
    private String ville;
    private int salle;
    private Date horaireDebut;
    private Double prix;
    private int capacite;

    public Programmation(Spectacle spectacle, Salle salle, Date horaireDebut) {
        this.spectacleId = spectacle.getId();
        this.ville = salle.getVille();
        this.salle = salle.getId();
        this.horaireDebut = horaireDebut;
        this.prix = salle.getPrix() * (1 - salle.getReduction() / 100.0);
        this.capacite = salle.getCapacite();
    }

    public void modifHoraire(Date newHoraire) {
        this.horaireDebut = newHoraire;
    }

    public int getSpectacleId() {
        return this.spectacleId;
    }

    public String getVille() {
        return this.ville;
    }

    public int getSalle() {
        return this.salle;
    }

    public Date getHoraireDebut() {
        return this.horaireDebut;
    }

    public Double getPrix() {
        return this.prix;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}