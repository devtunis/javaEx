package tp1;

public class Etudiant extends Personne {

    private  int numInscription;
    public Etudiant(String nom, String prenom, int numInscription) {
        super(nom,prenom);
        this.numInscription = numInscription;
    }
    public int getNumInscription() {
        return numInscription;
    }
    public  void Show(){
        System.out.println(super.toString());
        System.out.println("numInscription :"+numInscription);
    }
}
