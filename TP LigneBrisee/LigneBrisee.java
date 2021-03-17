package geometrie;
import java.util.Arrays;


public class LigneBrisee {
	
	private Point [] points;
	
	private static int taille=3;
	
	public LigneBrisee(Point[] points) {
		super();
		if (points==null)
			{
			this.points= new Point[taille]; 
			}
		else
			this.points = points;
	}
	
	public LigneBrisee() {
		this.points = new Point[taille];  // constructeur 
	}
	
	Point[] ListePoints = new Point[3]; // liste de 3 valeurs de points
		
		public Point[] getListePoints() {
		return ListePoints;
	}
	
	 
	
	public void setListePoints(Point[] listePoints) {
		ListePoints = listePoints;
	}
	
	public boolean contientPoint(Point pt) {  // test qui renvoie vrai si le point passé en paramètre est
											 // dans la ligne brisée et faux sinon.
		boolean test = false; //on défini test un bouléen (qui est de base faux) 
		
		for (Point pointTest : this.getListePoints()) {
			if (pt.equals(pointTest)) { //le point test est dans la ligne brisée 
				test = true;
			}
			}
		return test;
		}
	
	
	public void addPoint(Point pt) {
		for (int i = 0; i < this.getListePoints().length; i++) // parcours les cases du tableau 
			{
			if (this.getListePoints()[i] == null) {  //  permet de trouver une case libre dans le tableau
				this.getListePoints()[i] = pt;    //ajoute le point 
			break;
			}
			}
		}
	
	public int nbPoints() {
		int nombre = 0; // on met en place une variable appelé nombre qui stockera notre nombre d'éléments dans le tableau 
		for (int i = 0; i < this.getListePoints().length; i++) // on parcourt le tableau
			{
			if (this.getListePoints()[i] != null) { //le test qui permet de dire si un élement de ListePoint n'est pas null
				nombre ++; 	// on stock alors la valeur
				}
				}
			return nombre;
		}
	
	
	public int nbMaxPoints() {  
		return this.getListePoints().length - this.nbPoints();   // la soustraction nous permet de savoir le nombre de case null où l'on peut donc ajouter des points   
	}
	
	public void deletePoint(Point pt) {
		if (!(this.contientPoint(pt))) {   // verifie si le point est dans la ligne brisé 
			System.out.print("Le point testé ne se trouve pas dans la ligne brisée \n");
			}   
		else {
			int indFirst = 0;  // on met en place l'indice premier 
			for (int i = 0; i < this.getListePoints().length; i++)
				{
				if (this.getListePoints()[i] == pt) { // quand on parcourt le tableau et qu'on tombe sur notre point 
				indFirst = i;  // on le met à la place de notre indice premier
				break;
				}
				}
				this.getListePoints()[indFirst] = null;  // et on l'efface
			for (int j = indFirst; j+1 < this.getListePoints().length; j++) {  
				this.getListePoints()[j] = this.getListePoints()[j+1]; // ensuite on va décaler tout nos points vers l'arriere
				this.getListePoints()[j+1] = null; // et supprimer la derniere case 
				}
		}
	}
	
	
	@Override
	public String toString() {
		return "LigneBrisee [ListePoints=" + Arrays.toString(ListePoints) + "]";
	}
	}
	
