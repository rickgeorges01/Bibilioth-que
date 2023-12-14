package mediatheque;

public class CDAudio extends Media {
    private String artiste;
    private int nombreDePistes;

    public CDAudio(String titre, int annee, String artiste, int nombreDePistes) {
        super(titre, annee);
        this.artiste = artiste;
        this.nombreDePistes = nombreDePistes;
    }

    public void afficherDetails() {
        System.out.println("Titre du morceau: " + titre + ", Année de sortie: " + annee + ", Artiste(s): " + artiste + ", Nombre de pistes: " + nombreDePistes);
    }

    public String getMediaType() {
        return "Ce media est un CD Audio";
    }
}

