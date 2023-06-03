package fr.iut.films;

public class Film {
    private int rang;
    private String id;
    private String nom;
    private int annee;


    public int getRang() {
        return rang;
    }
    public void setRang(int rang) {
        this.rang = rang;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
