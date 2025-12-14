class Produit {
    private int identifiant;
    private String libellé;
    private String marque;
    private float prix;


    public Produit(int identifiant, String libellé, String marque) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;

        this.prix = 0;
    }

    public Produit(int identifiant, String libellé, String marque, float prix) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        this.prix = prix;
    }


    public void afficherInfo() {
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Libellé: " + libellé);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix + " DT");
        System.out.println("-------------------");
    }
    public void SetProduit(float amount){
        if(amount > 0){
            this.prix = amount;
        }
        else{
            System.out.println("Le prix est negative");
        }
    }

    @Override
    public String toString() {
        return libellé+" "+prix;
    }

}

