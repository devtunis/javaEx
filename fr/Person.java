package fr;

public class Person {

    private String nom;
    Person(String nom) {
        this.nom = nom;

    }
    @Override
    public String toString() {
        return "je suis"+" "+nom;
    }
}
