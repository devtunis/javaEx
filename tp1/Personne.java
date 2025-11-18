package tp1;

public class Personne {
    public  String nom;
    public  String prenom;

    public  Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    @Override
    public String toString(){
        return  "nom :"+nom+" prenom :"+prenom;
    }

}
