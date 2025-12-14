package test;
import ecole.Etudiant;
import ecole.EtudiantLicence;

public class TestEtudiant

{
    public static void main(String[] args)
    {
        Etudiant e1 = new Etudiant("Ali", "Ben", 15.5);
        e1.afficherInfos();
        e1.acceibleMoyenne();

        EtudiantLicence e2 = new EtudiantLicence("Sara", "Ben", 16.0, "L2");
        e2.afficherInfosComplet();

    }
}
