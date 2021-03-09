

public class TestZoo {

    public static void main(String[] args) {
        testZooHeritage();
    }

    private static void testZooHeritage() {
        Zoo grp10 = new Zoo("Groupe 10");
        grp10.ajouteAnimal(new Vache("Catherine", 110, 5));
        grp10.ajouteAnimal(new Vache("Julie", 90, 3));
        grp10.ajouteAnimal(new Canard("Sahar",  50, "\"rose\""));
        grp10.ajouteAnimal(new Canard("Benoit", 50, "\"noir\""));
        grp10.ajouteAnimal(new Vache("Nicolas", 96, 14));
        grp10.ajouteAnimal(new Vache("Sebastien", 50, "\"orange\""));
        grp10.ajouteAnimal(new Vache("Sylvain", 120, 54));

        System.out.println(grp10);
        grp10.crier();
        grp10.coutNourriture();
    }
}
