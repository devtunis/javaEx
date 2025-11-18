package tp1;

public class Etudiants {
    private Etudiant [] listeEtudiants;
    private int nbEtudiants;
    private  int maxSize;
    private  int i ;

   public Etudiants(int maxSize){
       this.maxSize = maxSize;
       this.i = 0 ;
       listeEtudiants = new Etudiant[maxSize];
   }

   public void  setEtudiant(Etudiant p ){
      boolean found = false;
       for(int j=0;j<i;j++){
           if (listeEtudiants[j].getNumInscription()==p.getNumInscription()){
               found =true;
           }
       }
       if(found==false){
           listeEtudiants[i] = p;
           i++;
           System.out.println("succesfull adding you *");
       }else{
           System.out.println("soory we c'ant add this user to this D'epartement");
       }


   }
   public  Etudiants rechercherEtudiant(int getnuminscription){
       for(int j =0 ;j<i;j++){
           if(listeEtudiants[j].getNumInscription()==getnuminscription){
               System.out.println(listeEtudiants[j]);
           }


       }
       return null;
   }


   public  void DisplayAllEtudiants(){
       for(int j =0 ;j<i;j++){
               System.out.println(listeEtudiants[j]);

       }
   }
}
