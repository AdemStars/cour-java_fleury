public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(int numero, String titulaire, double solde, double tauxInteret) {
        super(numero, titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void appliquerInterets() {
        double interets = this.getSolde() * tauxInteret / 100;
        this.deposer(interets);
    }
}
