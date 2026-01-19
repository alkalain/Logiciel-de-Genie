package genieLogiciel;

import java.util.Date;

public class Programmation {
    private Integer spectacleId;
    private String ville;
    private Integer salle;
    private Date horaireDebut;
    private Double prix;
    private Integer capacite;

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

    public Integer getSpectacleId() {
        return spectacleId;
    }

    public String getVille() {
        return ville;
    }

    public Integer getSalle() {
        return salle;
    }

    public Date getHoraireDebut() {
        return horaireDebut;
    }

    public Double getPrix() {
        return prix;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }
}