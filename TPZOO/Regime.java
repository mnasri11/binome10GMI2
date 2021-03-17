

class Regime {
    private String nom;
    private int prixKg;

    public Regime(String nom, int prixKg) {
        this.nom = nom;
        this.prixKg = prixKg;
    }

    public int getPrixKg() {
        return prixKg;
    }

    @Override
    public String toString() {
        return nom + " (" + prixKg+ "  €/kg)";
    }

}
