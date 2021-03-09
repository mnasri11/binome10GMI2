
public class Vector {
	
	private Rational [] tab = new Rational[2];
	
	public Vector(Rational x, Rational y)
	{
	tab[0]=x;
	tab[1]=y;
	}
	
	public String toString() 
	{
		return ("("+ tab[0].num +"/"+tab[0].denom+"," + tab[1].num +"/"+ tab[1].denom+ ")");
		
	}
	
	public void set(int i, Rational r) {
		if (this.tab.length<i) {
			 throw new ArithmeticException("Erreur, le denominateur ne peut pas être nul" ); 
		}
		else {
			this.tab[i]=r;
			
		}
		
	}
	
	public Rational get(int i) {
		if (this.tab.length<i) {
			 throw new ArithmeticException("Erreur, le denominateur ne peut pas être nul" ); 
		}
		else {
			return (tab[i]);
		
		
			}
	
	}
}
