
import java.util.LinkedList;

class Zoo {
    private String nom;
    private LinkedList<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        animaux = new LinkedList<Animal>();
    }

    public int getNbAnimaux() {
        return animaux.size();
    }

    public void ajouteAnimal(Animal animal) {
        animaux.add(animal);
    }

    //q2: permet de faire crier tout les animaux
    public void crier() {
        System.out.println("*** 1, 2, 3 crions:");
        for (Animal a : animaux) {
            a.crier();
        }
    }

    // q9 : permet d'afficher le cout total de nourriture 
    public void coutNourriture() {
        System.out.println("*** Le cout de nourriture total par jour est :");
        int coutTotal = 0;
        for (Animal a : animaux) {
            int cout = a.coutNourriture();
            coutTotal += cout;
            System.out.println("  Le cout est = " + cout);
        }
        System.out.println("Donc le cout total = " + coutTotal);
    }
  
    @Override
    public String toString() { // permet de retourner le nom du Zoo et le nombre d'aniaml qu'il contient 

	return("Le zoo " + nom + " contient " + getNbAnimaux() + " animaux:");


    }

}
