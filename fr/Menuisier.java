package fr;

public class Menuisier  extends  Person {

    Menuisier(String nom) {
        super(nom);
    }

    @Override
    public String toString() {
        return  super.toString() +" "+"le Menuisier";
    }
}
