public class CompteCourant extends CompteBancaire {
    private double limiteDecouvert;

    public CompteCourant(int numero, String titulaire, double solde, double limiteDecouvert) {
        super(numero, titulaire, solde);
        this.limiteDecouvert = limiteDecouvert;
    }

    public double getLimiteDecouvert() {
        return limiteDecouvert;
    }

    public void setLimiteDecouvert(double limiteDecouvert) {
        this.limiteDecouvert = limiteDecouvert;
    }

    @Override
    public void retirer(double montant) {
        if (this.getSolde() - montant < -limiteDecouvert) {
            System.out.println("Limite de découvert atteinte !");
        } else {
            super.retirer(montant);
        }
    }
}
