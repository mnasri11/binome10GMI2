
public abstract class ExpAbstraite {

    abstract public String toStringInfixe();

    @Override
    public String toString() {
        return "Je suis une expression et voila ma représentation infixée => "
            + toStringInfixe();
    }

   
    abstract public double evaluer(Env env);
}



class Constante extends ExpAbstraite {
    double val;

    public Constante(double val) {
        this.val = val;
    }

    @Override
    public String toStringInfixe() {
        return Double.toString(val); 
    }

    @Override
    public double evaluer(Env env) {
        return val;
    }
}



class Variable extends ExpAbstraite {
    String nom;

    public Variable(String nom) {
        this.nom = nom;
    }

    @Override
    public String toStringInfixe() {
        return nom;
    }

    @Override
    public double evaluer(Env env) {
        return env.obtenirValeur(nom);
    }
}






abstract class ExpUnaire extends ExpAbstraite {
    protected ExpAbstraite operande;	

    public ExpUnaire(ExpAbstraite e) {
        operande = e;
    }
}


class UnaireCos extends ExpUnaire {
    public UnaireCos(ExpAbstraite e) {
        super(e);
    }

    @Override
    public String toStringInfixe() {
        return "cos(" + operande.toStringInfixe() + ")";	
    }

    @Override
    public double evaluer(Env env) {
    	return Math.cos(operande.evaluer(env));
    }
}


class UnaireSin extends ExpUnaire {
    public UnaireSin(ExpAbstraite e) {
        super(e);
    }

    public String toStringInfixe() {
        return "sin(" + operande.toStringInfixe() + ")";	
    }


    @Override
    public double evaluer(Env env) {
    	return Math.sin(operande.evaluer(env));
    }
}





abstract class ExpBinaire extends ExpAbstraite {
    // operandes
    private ExpAbstraite opGauche;	
    private ExpAbstraite opDroite;


    private String imageOperateur;

    public ExpBinaire(ExpAbstraite g, ExpAbstraite d, String imageOperateur) {
        opGauche = g;
        opDroite = d;
        this.imageOperateur = imageOperateur;
    }

    @Override
    public String toStringInfixe() {
        return "(" + opGauche.toStringInfixe() +
            " " + imageOperateur + " "			
            + opDroite.toStringInfixe() + ")";
    }


    abstract double executeOperation(double evalG, double evalD);

    @Override
    public double evaluer(Env env) {

    	double evalG = opGauche.evaluer(env);
    	double evalD = opDroite.evaluer(env);

    	return executeOperation(evalG, evalD);
    }
}



class BinaireMult extends ExpBinaire {

    public BinaireMult(ExpAbstraite g, ExpAbstraite d) {
        super(g, d, "*");	
    }

    @Override
    double executeOperation(double evalG, double evalD) {
    	return evalG * evalD;
    }
}


class BinairePlus extends ExpBinaire {

    public BinairePlus(ExpAbstraite g, ExpAbstraite d) {
        super(g, d, "+");	
    }

    @Override
    double executeOperation(double evalG, double evalD) {
    	return evalG + evalD;
    }
}




