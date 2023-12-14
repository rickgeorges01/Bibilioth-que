package mediatheque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bibliotheque bibliotheque = new Bibliotheque();

        // Ajoutez des livres, des films et des CD audio à la bibliothèque
        Livre livre1 = new Livre("Harry Potter", 1997, "J.K. Rowling", "Fantasy");
        Film film1 = new Film("Les Affranchis", 2010, "Martin scorsese", 148);
        CDAudio cd1 = new CDAudio("Mon Terre", 2021, "Rythmeurs", 9);

        bibliotheque.ajouterMedia(livre1);
        bibliotheque.ajouterMedia(film1);
        bibliotheque.ajouterMedia(cd1);
        

        // Affichez la liste des médias
        System.out.println("Médias initiaux:\n");
        bibliotheque.afficherMedias();

        // Utilisation de la méthode rechercher
        Media mediaTrouve = bibliotheque.rechercherParTitre("Mon Terre");
        if (mediaTrouve != null) {
            System.out.println("\nMédia trouvé:\n");
            mediaTrouve.afficherDetails();
        } else {
            System.out.println("Média non trouvé.");
        }

        // Utilisation de la méthode supprimer
        bibliotheque.supprimerMedia(film1);

        System.out.println("\nMédias après suppression:\n");
        bibliotheque.afficherMedias();

        // Affichez le nombre total de médias
        System.out.println("\nNombre total de médias : " + bibliotheque.nombreTotalDeMedias());
	}

}
