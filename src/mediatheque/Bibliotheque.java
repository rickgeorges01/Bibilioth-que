package mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    
	// Liste pour stocker tous les médias
    private List<Media> medias;  

    public Bibliotheque() {
        medias = new ArrayList<>();
    }

    // Méthode pour ajouter un média
    public void ajouterMedia(Media media) {
        medias.add(media);
    }

    // Méthode pour supprimer un média
    public void supprimerMedia(Media media) {
        medias.remove(media);
    }

    // Méthode pour rechercher un média par titre
    public Media rechercherParTitre(String titre) {
        for (Media media : medias) {
            if (media.getTitre().toLowerCase().equals(titre.toLowerCase())) {
                return media;
            }
        }
     // Si le média n'est pas trouvé
        return null;  
    }

    // Méthode pour afficher les médias
    public void afficherMedias() {
        for (Media media : medias) {
            media.afficherDetails();
        }
    }

    // Méthode pour calculer le nombre total de médias
    public int nombreTotalDeMedias() {
        return medias.size();
    }
}
