package tp1;

public class Departement {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("ghaith","nahdi",11460083);
        Etudiant e2 = new Etudiant("wajih","hichri",11460083);

        Etudiants listOfEtudiant = new Etudiants(10);
        listOfEtudiant.setEtudiant(e1);
        listOfEtudiant.setEtudiant(e2);
        listOfEtudiant.DisplayAllEtudiants();
    }
}
