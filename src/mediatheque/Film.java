package mediatheque;

public class Film extends Media {
    private String realisateur;
    private double duree;

    public Film(String titre, int annee, String realisateur, double duree) {
        super(titre, annee);
        this.realisateur = realisateur;
        this.duree = duree;
    }

    public void afficherDetails() {
        System.out.println("Titre du Film: " + titre + ", Année de parution : " + annee + ", Réalisateur(s): " + realisateur + ", Durée: " + duree + " heures");
    }

    public String getMediaType() {
        return " Ce media es un Film";
    }
}
