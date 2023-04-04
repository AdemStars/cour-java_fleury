public class TestCompteBancaire {
    public static void main(String[] args) {
        CompteBancaire compte1 = new CompteBancaire(1234, "Jean Dupont", 100000.0);
        CompteBancaire compte2 = new CompteBancaire(5678, "Pierre Durand", 2000.0);
        CompteEpargne compte1 = new CompteEpargne(0, "Jean Dupont", 2300, 0.993)

        compte1.deposer(600.0); // dépose 500 euros sur le compte 1
        compte1.retirer(200.0); // retire 200 euros du compte 1
        compte1.transferer(compte2, 300.0); // transfère 300 euros du compte 1 vers le compte 2
        System.out.println(compte2);
        System.out.println(compte2);

        Banque banque = new Banque("N26");

        banque.ajouterCompte(compte1);
        banque.ajouterCompte(compte2);

        banque.afficherComptes(); // affiche les détails de tous les comptes de la banque

        
    }
}
