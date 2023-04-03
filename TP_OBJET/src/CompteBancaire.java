public class CompteBancaire {
    private int numero;
    private String titulaire;
    private double solde;
    private double fraisGestion;
    private double tauxInteret;
    private double limiteDecouvert;
    
        public CompteBancaire(int numero, String titulaire, double solde) {
            this.numero = numero;
            this.titulaire = titulaire;
            this.solde = solde;
            this.fraisGestion = fraisGestion;
            this.tauxInteret = tauxInteret;
            this.limiteDecouvert = limiteDecouvert;


        }
        public String toString() {
            return "Compte numéro " + this.numero + ", titulaire " + this.titulaire + ", solde " + this.solde;
        }    
    // Getters et setters pour les attributs
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
        this.solde -= this.fraisGestion;
    }
    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            this.solde -= this.fraisGestion; 
            System.out.println("Dépôt de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Le montant du dépôt doit être supérieur à 0.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0) {
            if (montant <= this.solde + this.limiteDecouvert) {
                this.solde -= montant;
                this.solde -= this.fraisGestion;
                System.out.println("Retrait de " + montant + " effectué avec succès.");
            } else {
                System.out.println("Solde insuffisant.");
            }
        } else {
            System.out.println("Le montant du retrait doit être supérieur à 0.");
        }
    }

    public void transferer(CompteBancaire destinataire, double montant) {
        if (montant > 0) {
            if (montant <= this.solde) {
                this.solde -= montant;
                destinataire.solde += montant;
                System.out.println("Transfert de " + montant + " effectué avec succès.");
            } else {
                System.out.println("Solde insuffisant.");
            }
        } else {
            System.out.println("Le montant du transfert doit être supérieur à 0.");
        }

    }
    public void calculerInterets() {
        double interets = this.solde * this.tauxInteret;
        this.solde += interets;
    }
}