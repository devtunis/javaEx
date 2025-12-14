package ecole;

public class EtudiantLicence extends Etudiant{
    private String niveau;

    public EtudiantLicence(String nom, String prenom, double moyenne, String niveau) {
        super(nom, prenom, moyenne);
        this.niveau = niveau;
    }

    public void afficherInfosComplet() {
        super.afficherInfos(); // appelle afficherInfos() de la classe mère
        System.out.println("Niveau: " + niveau);
    }
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

}
