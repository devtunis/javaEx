package tp100;

public class Etudiant extends Personne {
    private  int numInscription;

    public Etudiant(String nom, String prenom, int numInscription) {
        super(nom, prenom);
        this.numInscription = numInscription;
    }
    public void aff(){
        System.out.println(super.toString());
        System.out.println("Affichage de inscription : "+this.numInscription);
    }

    public int getNumInscription() {
        return numInscription;
    }
}

