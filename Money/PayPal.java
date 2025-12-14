package Money;

class PayPal extends Paiement {
    private String email;

    PayPal(double montant, String email) {
        super(montant);
        this.email = email;
    }

    @Override
    void payer() {
        System.out.println("Paiement accepté via PayPal pour: " + email);
    }
}