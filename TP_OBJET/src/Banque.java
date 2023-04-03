import java.util.ArrayList;

public class Banque {
    private ArrayList<CompteBancaire> comptes;
    private String nomBanque;

    public Banque(String nomBanque) {
        this.nomBanque = nomBanque;
        this.comptes = new ArrayList<>();
    }

    public void ajouterCompte(CompteBancaire compte) {
        this.comptes.add(compte);
    }

    public void supprimerCompte(CompteBancaire compte) {
        this.comptes.remove(compte);
    }

    public void afficherComptes() {
        System.out.println("Voici les comptes dans "+ this.nomBanque + ":" );
        for (CompteBancaire compte : this.comptes) {
            System.out.println(compte);
        }
    }
}
