package Money;
interface FraudCheck {
    boolean verifierFraude();
}

public class TestPaiement {
    public static void main(String[] args) {
        Paiement[] moyens = new Paiement[3];
        moyens[0] = new CarteBancaire(100, "0123456"); // سيُرفض
        moyens[1] = new CarteBancaire(200, "5123456"); // سيُقبل
        moyens[2] = new PayPal(150, "user@email.com"); // سيُقبل

        for(Paiement p : moyens) {
            p.recap();
            p.payer();
            System.out.println("------");
        }
    }
}