package ecole;

public class Etudiant {
    protected String nom ;
    protected String prenom;
    protected double  moyenne;

    public Etudiant(String nom, String prenom, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

  public  void afficherInfos(){
        System.out.println("Nom : "+this.nom+"Prenom"+this.prenom+"Moyenne : "+this.moyenne);

  }
  public void  acceibleMoyenne(){
        System.out.println("Moyenne : "+this.moyenne);
  }
    public void  acceibleSetMoyenne(double moy){
      this.moyenne = moy;
    }


}

