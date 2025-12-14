package Money;

class CarteBancaire extends Paiement implements FraudCheck {
    private String numero;

    CarteBancaire(double montant, String numero) {
        super(montant);
        this.numero = numero;
    }

    @Override
    void payer() {
        if(verifierFraude()) {
            System.out.println("Paiement refusé pour la carte: " + numero);
        } else {
            System.out.println("Paiement accepté par carte: " + numero);
        }
    }

    @Override
    public boolean verifierFraude() {
        // مثال معقد: نتحقق حسب الرقم لو أول رقم 0 = احتيال
        return numero.startsWith("0");
    }
}
