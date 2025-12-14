package tp100;

public class Etudiants {

    private Etudiant [] listeEtudiant;
    private  int maxSize ;
    private  int i ;
    public Etudiants(int maxSize ){
        this.maxSize = maxSize;
        this.listeEtudiant = new Etudiant[maxSize];
        this.i = 0;
    }


    public void ajout(Etudiant e) {

        boolean found = false;
        for(int  j=0;j<i;j++){
            if(listeEtudiant[j].getNumInscription() ==e.getNumInscription()){
                found = true;
                break;
            }
        }
 if(found==false){
     listeEtudiant[i] = e;

     i++;
 }
 else{
     System.out.println("Le etudiant n'existe pas");
 }


    }
    public  Etudiant rechercherEtudiant (int cin){
        for(int  j=0;j<i;j++){
            if(listeEtudiant[j].getNumInscription() ==cin){
                return listeEtudiant[j];
            }
        }
        return  null;
    }

}

//[{},{},{}]  {"f"}  [new class(),new class(),] ===111
