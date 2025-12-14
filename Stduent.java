 
class Stduent {

    private  String nom;
    private String prenom;
    private int age;

    public  Stduent(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void affficherInfo(){
        System.out.println(nom+" "+prenom+" "+age);
    }
}