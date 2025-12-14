package Money;

abstract class Paiement {
    protected double montant;

    Paiement(double montant) {
        this.montant = montant;
    }

    abstract void payer();  // كل وسيلة دفع لازم تنفذها

    void recap() {  // دالة مشتركة لكل الوسائل
        System.out.println("Montant: " + montant + " DT");
    }
}
