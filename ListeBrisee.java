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
	
	
	
	@Override
	public String toString() {
		return "LigneBrisee [ListePoints=" + Arrays.toString(ListePoints) + "]";
	}
	}
	
