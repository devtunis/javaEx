package fr;



public class TestMetiers {



    public static void main(String [] args) {
        Person[] personnes = new Person[4];

        personnes[0]= new Person("Salah");
        personnes[1]= new Forgeron("ali");
        personnes[2]= new Menuisier("Mohamed");
        personnes[3]= new Forgeron("amor");

        for (int i=0 ; i<personnes.length ; i++){
            System.out.println(personnes[i]);


        }



}


}