package package1;

import java.awt.*;

class Parent1 {
    protected String name;
    protected String prenom;
    Parent1(String name, String prenom) {
        this.name = "Khadouja";
        this.prenom = "nahdi";
    }
    public void  getName() {
        System.out.println(name);
    }
}

class Child extends Parent1 {
    protected String helper;
    Child(String name, String prenom,String helper) {
        super(name,prenom); // calls Parent constructor
        this.helper = helper;
    }

    void greet() {
        super.getName(); // call parent method
         System.out.println(prenom);
        System.out.println(helper);
    }

}

public class Parent {
    public static void main(String[] args){
    Child child = new Child("Child","fire","100");
        child.greet();
    }
}
