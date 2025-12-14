public class Magasin {
    private int identifiant;
    private String adresse;
    private int Capacité;
    private Produit [] ensemble_de_produits;
    public  Magasin(int identifiant,String adresse){
        this.identifiant=identifiant;
        this.adresse=adresse;
        this.Capacité = 0;
        this.ensemble_de_produits = new Produit[50];
    }
    public  void ajouter( Produit p){

        if(Capacité<50){
            ensemble_de_produits[Capacité] = p;
            Capacité++;
        }else{
            System.out.println("soory we c'ant insert your document");
        }
    }

    public void caractéristiquesMagasin(){
        System.out.print(identifiant+"  "+adresse);
    }


    public  void afficherPoduit(){
        for(int i=0;i<ensemble_de_produits.length;i++){
          if(ensemble_de_produits[i]!=null)  System.out.println(ensemble_de_produits[i]);
        }
    }
}
