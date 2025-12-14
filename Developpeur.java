class Developpeur {
    private String nom;
    private String specialité;

    public Developpeur(String nom , String specialité){
        this.nom = nom ;
        this.specialité = specialité;
    }
    public String toString() {
        return  nom+" "+specialité;
    }
}
