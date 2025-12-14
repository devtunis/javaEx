package fr;

public class Forgeron  extends Person {
    Forgeron(String nom) {
        super(nom);
    }
    @Override
    public String toString() {
        return  super.toString() +" "+"le Forgeron";
    }
}
