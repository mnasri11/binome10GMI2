import java.util.*;

class Env {

    
    private Map<String, Double> table;

  
    public Env() {
        table = new Hashtable<String, Double>();
    }

    public void associer(String s, double val) {
        table.put(s, val); 


    }

    
    public double obtenirValeur(String s) {
        if (contient(s)) {
            return table.get(s); /
        } else {
            throw new RuntimeException("variable " + s
                    + " inconnue dans l'environnement");
        }
    }

    public boolean contient(String s) {
        return table.containsKey(s);
    }

    @Override
    public String toString() {
        return "Environnement : " + table;
    }
}
