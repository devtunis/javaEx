class Chien {
    int id;
    String race;

    static int nbChien = 0;
    static float PI = 3.15f;
    public Chien(int id, String race) {
        this.id = id;
        this.race = race;
        nbChien++;
    }


    public static void afficherNbChien() {
        System.out.println("عدد الكلاب = " + nbChien);
    }
}