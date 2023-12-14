package mediatheque;

public class Livre extends Media {
    // Attributs spécifiques au Livre
    private String auteur;
    private String genre;

    // Constructeur
    public Livre(String titre, int annee, String auteur, String genre) {
    	
    	// Appel au constructeur de la classe mère
        super(titre, annee); 
        
        this.auteur = auteur;
        this.genre = genre;
    }

    // Implémentation des méthodes abstraites
    public void afficherDetails() {
        System.out.println("Titre du Livre: " + titre + ", Année de publication : " + annee + ", Auteur de l'ouvrage: " + auteur + ", Genre : " + genre);
    }

    public String getMediaType() {
        return "Ce media est un Livre";
    }
}
