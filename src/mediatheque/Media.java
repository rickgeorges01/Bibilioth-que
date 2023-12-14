package mediatheque;

public abstract class Media {
    // Attributs
    protected String titre;
    protected int annee;

    // Constructeur
    public Media(String titre, int annee) {
        this.titre = titre;
        this.annee = annee;
    }
    

    public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	// Méthodes abstraites
    public abstract void afficherDetails();
    public abstract String getMediaType();
}

