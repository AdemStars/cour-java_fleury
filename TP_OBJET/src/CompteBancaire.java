public class CompteBancaire {
    private int numero;
    private String titulaire;
    private double solde;
    
    public CompteBancaire(int numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
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
}
}