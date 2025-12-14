class Project {
    private Developpeur[] developpeur;
    private String titre;
    private int size;

    public Project(String titre) {
        this.titre = titre;
        this.size = 0;
        this.developpeur = new Developpeur[50];
        Entreprise.nbProjets++;   // يزداد كل مرة نعمل new Project
    }

    public void HandelSetDevloppeur(Developpeur d) {
        if (size < 50) {
            this.developpeur[size] = d;
            size++;
        } else {
            System.out.println("we sorry");
        }
    }
}
