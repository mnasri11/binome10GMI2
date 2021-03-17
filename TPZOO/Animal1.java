

public abstract class Animal {

    private String nom;
    protected int poids;
    protected Regime regime;

    protected Animal(String nom, int poids, Regime regime) {//constructeur de Animal
        this.nom = nom;
        this.poids = poids;
        this.regime = regime;
    }

    public void crier() { // méthode crier 
        System.out.print(toString() + " crie...");
    }

    @Override
    public String toString() {
        return nom;
    }

    abstract public int coutNourriture();  // méthode permettant de calculer le coût de nourriture(à finir)

}



//Q4 on a la class Canard et Vache 

class Canard extends Animal {
    private String couleurPlumes;

    public Canard(String nom, int poids, String couleurPlumes) {
        super(nom, poids, new Regime("graines", 10));
        this.couleurPlumes = couleurPlumes;
    }

    public String getCouleurPlume() {
        return this.couleurPlumes;
    }


    @Override
    public void crier() {
        super.crier();
        System.out.println("Ce canard de " + poids + " kilos aux belles plumes "
            + couleurPlumes + " cancane!");
    }

    @Override
    public int coutNourriture() {
        return regime.getPrixKg();
    }
}


class Vache extends Animal {
    private int nbTaches;


    private final static Regime REGIME_COMMUN = new Regime("paille", 5);

    public Vache(String nom, int poids, int nbTaches) {
        super(nom, poids, REGIME_COMMUN);
        this.nbTaches = nbTaches;
    }


    @Override
    public String toString() {
        return super.toString() + ", la vache " +  ( "a " + nbTaches + " taches qui tachent");
    }

    @Override
    public void crier() {
        super.crier();
        System.out.println(" il meugle");
    }

    @Override
    public int coutNourriture() {
        return regime.getPrixKg() * nbTaches;
    }
}


