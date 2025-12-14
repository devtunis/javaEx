class Parent {
    public boolean value;
    Parent(boolean v) {
        value = v; }
}

class Child extends Parent {
    public boolean value;  
    Child(boolean v) { super(v); }
}


class Main {
    public static void main(String[] args) {
     Child c = new Child(true);
     System.out.println(c.value); 
    
    }
}


Explanation

At first glance, most developers would expect true to be printed because we passed true to the Child constructor.

What actually happens:

The Parent class has a field value.

The Child class redeclares value, creating a new field that shadows the parent’s field.

In the constructor Child(boolean v), we call super(v), which initializes Parent.value to true.

However, when we access c.value, Java uses the field in the current class (Child), not the parent.

Since Child.value was never initialized, it defaults to false.

✅ This behavior is not a bug, it’s how Java handles field shadowing.
